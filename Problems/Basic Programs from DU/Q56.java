// You are given a 0-indexed binary string s which represents the types of buildings along a street where: 
// s[i] = '0' denotes that the ith building is an office and 
// s[i] = '1' denotes that the ith building is a restaurant. 
// As a city official, you would like to select 3 buildings for random inspection. However, to ensure variety, no two consecutive buildings out of the selected buildings can be of the same type. 
// For example, given s = "001101", we cannot select the 1st, 3rd, and 5th buildings as that would form "011" which is not allowed due to having two consecutive buildings of the same type. 
// Return the number of valid ways to select 3 buildings. 
// Input: s = "001101" 
// Output: 6 
// Explanation: 
// The following sets of indices selected are valid: 
// - [0,2,4] from "001101" forms "010" 
// - [0,3,4] from "001101" forms "010" 
// - [1,2,4] from "001101" forms "010" 
// - [1,3,4] from "001101" forms "010" 
// - [2,4,5] from "001101" forms "101" 
// - [3,4,5] from "001101" forms "101" No other selection is valid. Thus, there are 6 total ways

public class Q56 {
    public static int countGoodTriplets(String s) {
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            for (int j = i + 1; j < s.length() - 1; j++) {
                for (int k = j + 1; k < s.length(); k++) {
                    if (s.charAt(i) != s.charAt(j) && s.charAt(j) != s.charAt(k)) {
                        count++;
                        System.out.println("[" + i + "," + j + "," + k + "] from \"" + s + "\" forms \"" + s.charAt(i)
                                + s.charAt(j) + s.charAt(k) + "\"");
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "001101";
        System.out.println(countGoodTriplets(s));
    }
}
