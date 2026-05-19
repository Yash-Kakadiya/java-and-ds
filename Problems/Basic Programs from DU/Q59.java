// A valid number can be split up into these components (in order): 
// A decimal number or an integer. 
// (Optional) An 'e' or 'E', followed by an integer. 
// A decimal number can be split up into these components (in order): 
// (Optional) A sign character (either '+' or '-'). 
// One of the following formats: 
// One or more digits, followed by a dot '.'. 
// One or more digits, followed by a dot '.', followed by one or more digits. 
// A dot '.', followed by one or more digits. 
// An integer can be split up into these components (in order): 
// (Optional) A sign character (either '+' or '-'). 
// One or more digits. 
// For example, all the following are valid numbers: ["2", "0089", "-0.1", "+3.14", "4.", "-.9", "2e10", "-90E3", "3e+7", "+6e-1", "53.5e93", "-123.456e789"],
//  while the following are not valid numbers: ["abc", "1a", "1e", "e3", "99e2.5", "--6", "-+3", "95a54e53"].
// Given a string s, return true if s is a valid number

public class Q59 {
    public static boolean isNumber(String s) {
        s = s.trim();
        if (s.isEmpty())
            return false;

        boolean hasE = false;
        boolean hasDot = false;
        boolean hasDigit = false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '+' || c == '-') {
                if (i > 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') {
                    return false;
                }
            } else if (c == 'e' || c == 'E') {
                // 'e' or 'E' must follow a digit and cannot appear more than once
                if (hasE || !hasDigit) {
                    return false;
                }
                hasE = true;
                hasDigit = false; // reset for the exponent part
            } else if (c == '.') {
                if (hasDot || hasE) {
                    return false;
                }
                hasDot = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else {
                return false;
            }
        }

        return hasDigit;
    }

    public static void main(String[] args) {
        String s = "+6e-1";
        System.out.println(isNumber(s)); // Output: true
    }
}
