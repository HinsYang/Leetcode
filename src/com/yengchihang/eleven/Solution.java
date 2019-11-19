package com.yengchihang.eleven;

/**
 * Created by 恒仔 on 2019/11/1.
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1,8,6,2,5,4,8,3,7};
        System.out.println(solution.maxArea(nums));
    }


    public int maxArea(int[] height) {
        int ans = 0;
        int i = 0 , j = height.length-1;
        while (i < j){
            int buf = (j-i) * Math.min(height[i],height[j]);
            ans = Math.max(ans, buf);
            if (height[i] < height[j]){
                i++;
            }else {
                j--;
            }
        }
        return ans;
    }
}
