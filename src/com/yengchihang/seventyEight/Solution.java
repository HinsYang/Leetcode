package com.yengchihang.seventyEight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by 恒仔 on 2019/11/1.
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] candidates = {1,2,3};
        System.out.println(solution.subsets(candidates));
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> buf = new ArrayList<>();
        backTrack(ans,buf,0,nums);
        return ans;
    }

    private void backTrack(List<List<Integer>> ans, List<Integer> list, int i, int[] nums) {
        ans.add(new ArrayList<>(list));
        for (int j = i; j < nums.length; j++) {
            list.add(nums[j]);
            backTrack(ans,list,j+1,nums);
            //dfs完一个数就剪枝清除掉这个数所递归累积的组合
            list.remove(list.size()-1);
        }
    }

    /*//回溯法
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        if (candidates.length > 0){
            Arrays.sort(candidates);
            if (target >= candidates[0]){
                List<Integer> buf = new ArrayList<>();
                backTrack(ans,buf,0,candidates,target);
            }
        }
        return ans;
    }*/

    private void backTrack(List<List<Integer>> ans, List<Integer> buf, int i, int[] candidates, int target) {
        if (target > 0){
            for (int j = i; j < candidates.length && candidates[j] <= target; j++) {
                List<Integer> thisBuf = new ArrayList<>(buf);
                thisBuf.add(candidates[j]);
                int nextTarget = target - candidates[j];
                backTrack(ans,thisBuf,j,candidates,nextTarget);
            }
        }else if (target == 0){
            ans.add(buf);
        }
    }

}
