package com.yengchihang.fiftyThree;

/**
 * Created by 恒仔 on 2019/11/1.
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(solution.maxSubArray(nums));
    }

    /*
        输入: [-2,1,-3,4,-1,2,1,-5,4],
        输出: 6
        解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
    */

    public int maxSubArray(int[] nums) {
        int ans = nums[0], buf = 0;
        for (int i = 0; i < nums.length; i++) {
            if (buf > 0){
                buf += nums[i];
            }else {
                buf = nums[i];
            }
            ans = Math.max(ans , buf);
        }
        return ans;
    }
}
