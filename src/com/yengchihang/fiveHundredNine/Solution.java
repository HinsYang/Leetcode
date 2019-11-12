package com.yengchihang.fiveHundredNine;

/**
 * Created by 恒仔 on 2019/11/1.
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int arg = 4;
        System.out.println(solution.fib(arg));
    }

    /*
        F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
     */
    public int fib(int N) {
        if (N < 0){
            return 0;
        }
        int[] buf = new int[N+1];
        for (int i = 0; i <= N; i++) {
            if (i == 0){
                buf[i] = 0;
            }else if (i == 1){
                buf[i] = 1;
            }else {
                buf[i] = buf[i - 1] + buf[i - 2];
            }
        }
        return buf[N];
    }
}
