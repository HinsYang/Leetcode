package com.yengchihang.one;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by 恒仔 on 2019/11/1.
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(solution.twoSum(nums, target)));
    }

    /*
    * 给定 nums = [2, 7, 11, 15], target = 9
      因为 nums[0] + nums[1] = 2 + 7 = 9
      所以返回 [0, 1]
    *
    * */
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                result[0] = map.get(nums[i]);
                result[1] = i;
                return result;
            }
            map.put(target-nums[i],i);
        }
        return result;
    }
}
