package com.yengchihang.sixthTwo;

/**
 * Created by 恒仔 on 2019/11/1.
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int m = 7;
        int n = 3;
        System.out.println(solution.uniquePaths(m, n));
    }

    /*
    * 只能向右向下走
    * f(1,n) == f(m,1) == 1, f(1, 1)== 0
    * f(m,n) == f(m, n-1) + f(m-1, n)
    * */
    public int uniquePaths(int m, int n) {
        if (m <=1 || n<=1){
            return 1;
        }
        int[][] map = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i==0 || j==0){
                    map[i][j] = 1;
                }else {
                    map[i][j] = map[i][j-1] + map[i-1][j];
                }
            }
        }
        return map[m-1][n-1];
    }
}
