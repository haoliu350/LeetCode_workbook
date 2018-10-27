package com.leetcode.solutions;

/**
 * Created by haoliu350 on 2/27/17.
 */
public class LeetCode_007_ReverseInteger {

    public static void main(String[] args){
        int input = 123;
        System.out.println(reverse(input));
        System.out.println(reverse(-123));
        System.out.println(reverse(1000000003));
        System.out.println(reverse(123456789));
        System.out.println(reverse(987654321));

    }

    public static int reverse(int x) {
        int result = 0;
        while(x != 0) {
            int tail = x % 10;
            int newResult = result * 10 + tail;
            if((newResult - tail) / 10 != result ) return 0;
            result = newResult;
            x = x/10;
        }
        return result;
    }
}
