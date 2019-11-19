package com.yengchihang.fifteen;

import java.util.*;

/**
 * Created by 恒仔 on 2019/11/1.
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        //int[] nums = {-1, 0, 1, 2, -1, -4};
        //int[] nums = {-4, -1, -1, 0, 1, 2 };
        int[] nums = {0, 0, 0, 0};
        System.out.println(solution.threeSum(nums));
    }

    //双指针
    public List<List<Integer>> threeSum(int[] nums) {
        List ans = new ArrayList();
        if (nums.length > 2){
            Arrays.sort(nums);
            int l = 0;
            while (nums[l] <= 0 && l < nums.length -2){
                if (l == 0 || nums[l] != nums[l - 1]){
                    int m = l+1;
                    int r = nums.length-1;
                    while (m < r){
                        int s = nums[l] + nums[m] + nums[r];
                        if (s == 0){
                            List<Integer> list = new ArrayList<>();
                            list.add(nums[l]);
                            list.add(nums[m]);
                            list.add(nums[r]);
                            ans.add(list);
                        }
                        if (s <= 0){
                            do {
                                m++;
                            }while (m < nums.length && nums[m] == nums[m-1]);
                        }else {
                            do {
                                r--;
                            }while (r > m && nums[r] == nums[r+1]);
                        }
                    }
                }
                l++;
            }
        }
        return ans;
    }
}
