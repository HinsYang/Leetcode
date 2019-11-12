package com.yengchihang.seventy;

/**
 * Created by 恒仔 on 2019/11/1.
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int arg = 4;
        System.out.println(solution.climbStairs(arg));
    }

    /*
        f(n)=f(n-1)+f(n-2)
     */
    public int climbStairs(int n) {
        if (n < 1){
            return 0;
        }
        int[] buf = new int[n+1];
        for (int i = 1; i <= n; i++) {
            if (i == 1){
                buf[i] = 1;
            }else if (i == 2){
                buf[i] = 2;
            }else {
                buf[i] = buf[i-1]+ buf[i-2];
            }
        }
        return buf[n];
    }
}
