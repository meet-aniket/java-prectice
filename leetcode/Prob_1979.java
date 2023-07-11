package leetcode;

import java.sql.Timestamp;
import java.util.Date;

public class Prob_1979 {
    public static void main(String[] args) {
        Prob_1979 prob = new Prob_1979();
        Solution sol = prob.new Solution();
        
    }

    class Solution {
        private int __gcd(int a, int b) {
            return b == 0? a:__gcd(b, a % b);
        }
        private int getGCD(int[] nums, int n) {
            int ans = nums[0];
            for(int ele : nums) {
                ans = __gcd(ans, ele);
                if(ans == 1)
                    return 1;
            }
            return ans;
        }
        public int findGCD(int[] nums) {
            return getGCD(nums, nums.length);
        }
    }
}
