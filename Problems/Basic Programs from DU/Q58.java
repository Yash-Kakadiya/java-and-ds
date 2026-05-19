// Given an array of strings strs, group the anagrams together. You can return the answer in any order. 
// Input: strs = ["eat","tea","tan","ate","nat","bat"]  Output: 
// [["bat"],["nat","tan"],["ate","eat","tea"]]

import java.util.*;

public class Q58 {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
        System.out.println(groupAnagrams(strs));
    }
}
