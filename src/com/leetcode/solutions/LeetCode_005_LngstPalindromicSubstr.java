package com.leetcode.solutions;

/**
 * Created by haoliu350 on 2/27/17.
 */
public class LeetCode_005_LngstPalindromicSubstr {
    private static int lo, maxLen;

    public static void main(String[] args){
        String input = "baaabc";
        String output = longestPalindrome(input);
        System.out.println(output);
    }

    public static String longestPalindrome(String s) {
        int len = s.length();
        if (len < 2)
            return s;

        for (int i = 0; i < len-1; i++) {
            extendPalindrome(s, i, i);  //assume odd length, try to extend Palindrome as possible
            extendPalindrome(s, i, i+1); //assume even length.
        }
        return s.substring(lo, lo + maxLen);
    }

    private static void extendPalindrome(String s, int j, int k) {
        while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
            j--;
            k++;
        }
        if (maxLen < k - j - 1) {
            lo = j + 1;
            maxLen = k - j - 1;
        }
    }


}
