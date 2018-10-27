package com.leetcode.solutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


/**
 * Created by haoliu350 on 2/21/17.
 */
public class LeetCode_001_TwoSum {

    public static void main(String[] args){
        int[] nums = {2, 7, 11, 15};
        //int[] nums = {3,2,4};
        int target = 9;

        int[] result = twoSum(nums, target);

        Arrays.stream(result).forEach(e -> System.out.println(e));


    }


    //http://www.cnblogs.com/grandyang/p/4130379.html
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
        int[] res = new int[2];
        for (int i = 0; i < nums.length; ++i) {
            if (m.containsKey(target - nums[i])) {
                res[0] = i;
                res[1] = m.get(target - nums[i]);
                break;
            }
            m.put(nums[i], i);
        }
        return res;

    }

}
