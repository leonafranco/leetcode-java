package org.example;


import org.example.resources.ListNode;

public class Q206ReserveLinkedList {
    class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode reverted = null;
            while(head != null){
                ListNode foward = head.next;
                head.next = reverted;
                reverted = head;
                head = foward;
            }
            return reverted;
        }
    }
}
