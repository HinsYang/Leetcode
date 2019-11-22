package com.yengchihang.thirtyNine;

import java.util.*;

/**
 * Created by 恒仔 on 2019/11/1.
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        //int[] candidates = {2,3,6,7};
        int[] candidates = {2,3,5};
        //int target = 7;
        int target = 8;
        System.out.println(solution.combinationSum(candidates, target));
    }

    //回溯法
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
    }

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

    /*public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (!digits.isEmpty()){
            backTrack(ans, "", digits);
        }
        return ans;
    }

    //digits不断取第一个sub
    private void backTrack(List<String> ans, String s, String nextDigits) {
        if (!nextDigits.isEmpty()){
            String digits = nextDigits.substring(0,1);
            String word = phone.get(digits);
            for (int j = 0; j < word.length(); j++) {
                backTrack(ans, s + word.charAt(j),nextDigits.substring(1));
            }
        }else {
            ans.add(s);
        }
    }*/
}
