/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {


        ListNode tempa = headA;
        ListNode tempb = headB;
        int la = 1, lb = 1;

        while (tempa != tempb) {
            if (tempa == null)
                tempa = headB;
            else
                tempa = tempa.next;

            if (tempb == null)
                tempb = headA;
            else 
                tempb = tempb.next;
        }
        return tempa;


/*
        if (headA == null || headB == null)
            return null;

        while (tempa != null) {
            la++;
            tempa = tempa.next;
        }

        while (tempb != null) {
            lb++;
            tempb = tempb.next;
        }

        tempa = headA;
        tempb = headB;

        if (lb>la) {
            for (int i=0; i<lb-la; i++) {
                tempb = tempb.next;
            }
        }

        else if (la>lb) {
            for (int i=0; i<la-lb; i++) {
                tempa = tempa.next;
            }
        }

        while (tempa != null && tempb != null) {
            if (tempa == tempb)
                return tempa;
            tempa = tempa.next;
            tempb = tempb.next;
        }
        return null;
*/
    }
}