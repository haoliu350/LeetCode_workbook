package com.leetcode.solutions;

/**
 * Created by haoliu350 on 2/21/17.
 */

import com.leetcode.vo.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class LeetCode_002_AddTwoNumber {

    public static void main(String[] args){


    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        int carry = 0;
        while(l1 != null || l2 != null) {
            int val1 = l1 != null ? l1.val : 0;
            int val2 = l2 != null ? l2.val : 0;
            int sum = val1 + val2 + carry;
            carry = sum >= 10 ? 1 : 0;
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
            if(l1 != null ) l1=l1.next;
            if(l2 != null ) l2=l2.next;
        }
        if(carry != 0) cur.next = new ListNode(1);
        return dummy.next;

    }

}
