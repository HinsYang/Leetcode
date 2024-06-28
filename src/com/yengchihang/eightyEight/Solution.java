package com.yengchihang.eightyEight;

import java.util.Arrays;

/**
 * Created by 恒仔 on 2019/11/1.
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
       /* int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;*/
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;
        solution.merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }


    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0 && n == 0){
            return;
        }

        int totalSize = m + n - 1;
        int mIndex = m - 1;
        int nIndex = n - 1;
        for (int i = totalSize; i >= 0; i--) {
            if (mIndex < 0 && nIndex < 0){
                return;
            } else if (nIndex < 0) {
                nums1[i] = nums1[mIndex--];
            } else if (mIndex < 0) {
                nums1[i] = nums2[nIndex--];
            } else if (nums1[mIndex] >= nums2[nIndex]){
                nums1[i] = nums1[mIndex--];
            } else {
                nums1[i] = nums2[nIndex--];
            }
        }
    }
}
