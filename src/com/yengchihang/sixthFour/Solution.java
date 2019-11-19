package com.yengchihang.sixthFour;

/**
 * Created by 恒仔 on 2019/11/1.
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] map = {
                {1,3,1},
                {1,5,1},
                {4,2,1},
        };
        System.out.println(solution.minPathSum(map));
    }

    /*
    * 只能向右向下走
    * f(1,n) == f(1,n-1) + val ,f(m,1) == f(m-1,1)+val, f(1, 1)== val
    * f(m,n) == Math.min(f(m, n-1),f(m-1, n)) + val
    * */
    public int minPathSum(int[][] grid) {
        int high = grid.length;
        if (high < 1){
            return 0;
        }
        int len = grid[0].length;
        int[][] buf = new int[high][len];
        for (int i = 0; i < high; i++) {
            for (int j = 0; j < len; j++) {
                int val = grid[i][j];
                if (i == 0 && j ==0){
                    buf[i][j] = val;
                } else if (i == 0){
                    buf[i][j] = buf[i][j-1] + val;
                } else if (j == 0){
                    buf[i][j] = buf[i-1][j] + val;
                } else {
                    buf[i][j] = Math.min(buf[i][j-1],buf[i-1][j]) + val;
                }
            }
        }
        return buf[high-1][len-1];
    }
}
