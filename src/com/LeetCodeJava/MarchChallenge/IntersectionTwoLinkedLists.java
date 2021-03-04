package com.LeetCodeJava.MarchChallenge;

import com.LeetCodeJava.ObjectLib.ListNode;

/**
 * March 4 Challenge - Intersection of Two Linked Lists
 *
 * INTUITION:
 * Let pointer A traverse to end of A-list, then traverse from start of B-list to end
 * Simultaneously, let pointer B traverse to end of B-list, then traverse from start of A-list to end
 *
 * If an intersection exists, they will eventually meet.
 * If not, they will reach end of list at same time and both be null
 */


public class IntersectionTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode ptrA = headA;
        ListNode ptrB = headB;

        while (ptrA != ptrB){
            ptrA = ptrA == null ? headB : ptrA.next;
            ptrB = ptrB == null ? headA : ptrB.next;
        }
        return ptrA;
    }
}
