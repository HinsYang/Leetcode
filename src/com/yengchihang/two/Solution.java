package com.yengchihang.two;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by 恒仔 on 2019/11/1.
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {5,4};
        int[] b = {5,6,4};
        ListNode aNode = solution.change(a);
        ListNode bNode = solution.change(b);
        System.out.println(aNode);
        System.out.println(bNode);
        System.out.println(solution.addTwoNumbers(aNode,bNode));
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoNumbers(l1,l2,0);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2, int add) {
        if (l1 == null){
            l1 = new ListNode(0);
        }
        if (l2 == null){
            l2 = new ListNode(0);
        }
        int buf = l1.val + l2.val + add;
        add = buf >= 10 ? 1 : 0;
        ListNode node = new ListNode(buf>=10 ? buf-10: buf);
        if (l1.next != null || l2.next != null || add > 0){
            node.next = addTwoNumbers(l1.next,l2.next,add);
        }
        return node;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }

        @Override
        public String toString() {
            return next != null ? val+" -> "+next.toString():Integer.toString(val);
        }
    }

    public ListNode change(int[] a){
        ListNode node = new ListNode(a[0]);
        ListNode result = node;
        for (int i = 1; i < a.length; i++) {
            node.next = new ListNode(a[i]);
            node = node.next;
        }
        return result;
    }
}
