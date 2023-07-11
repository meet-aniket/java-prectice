package leetcode;

/**
 * Question :- Longest Common Prefix in List of Strings.
 */
public class Prob_14 {
    public static void main(String[] args) {
        Prob_14 prob = new Prob_14();
        String[] strs = {"flower","flow","flight"};
        Solution sol = prob.new Solution();
        sol.longestCommonPrefix(strs);
    }

    class Solution {
        public String longestCommonPrefix(String[] strs) {
            StringBuilder ans = new StringBuilder();

            if(strs == null || strs.length == 0) {
                return ans.toString();
            }

            // Finding the minimum length starting from the array
            int minimumLength = strs[0].length();
            for(int i = 1; i < strs.length; i++) {
                minimumLength = Math.min(minimumLength, strs[i].length());
            }

            // Looping for the minimum length
            for(int i = 0; i <= minimumLength; i++) {
                // Getting the current character from the first string
                char current = strs[0].charAt(i);

                //Checking if this char is present in all strings or not
                for(String str : strs) {
                    if(str.charAt(i) != current) {
                        return ans.toString();
                    }
                }
                ans.append(current);
            }

            return ans.toString();
        }
    }
}
