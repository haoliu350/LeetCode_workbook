package com.leetcode.solutions;

/**
 * Created by haoliu350 on 2/28/17.
 */
public class LeetCode_009_PalindromeNum {

    public static void main(String[] args) {

        System.out.println(isPalindrome(123454321));
        System.out.println(isPalindrome(-123454321));
        System.out.println(isPalindrome(12344321));
        System.out.println(isPalindrome(1234564321));

    }


    public static boolean isPalindrome(int x) {
        if(x<0 || (x!=0 && x%10==0)) return false;
        int rev = 0;
        while(x>rev){
            rev = rev*10 + x%10;
            x = x/10;
        }
        return (x==rev || x==rev/10);

    }
}
