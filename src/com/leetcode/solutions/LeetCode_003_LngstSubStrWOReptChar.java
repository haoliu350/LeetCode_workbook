package com.leetcode.solutions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by haoliu350 on 2/22/17.
 */
public class LeetCode_003_LngstSubStrWOReptChar {

    public static void main(String[] args){
        String input = "abcabcbb";  //Given "abcabcbb", the answer is "abc", which the length is 3.
        System.out.println("result: " + lengthOfLongestSubstring(input));

        int[] test = new int[256];
        for(int i = 0; i<256; i++){
            test[i] = i;
        }
        System.out.println(test['c']);

    }


    public static int lengthOfLongestSubstring(String s) {
        int[] m = new int[256];
        Arrays.fill(m, -1);
        int res = 0, left = -1;
        for (int i = 0; i < s.length(); ++i) {
            left = Math.max(left, m[s.charAt(i)]);
            //System.out.println(m[s.charAt(i)]);
            m[s.charAt(i)] = i;
            res = Math.max(res, i - left);
        }
        return res;
    }

    public static int lengthOfLongestSubstring2(String s) {
        int i = 0, j = 0;
        int max = 0;
        Set<Character> set = new HashSet<>();

        while(j<s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                max = Math.max(max, set.size());
            }else{
                set.remove(s.charAt(i++));
            }
        }

        return max;
    }
}
