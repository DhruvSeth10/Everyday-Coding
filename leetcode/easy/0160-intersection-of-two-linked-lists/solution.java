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

        if (headA == null || headB == null)
            return null;

        ListNode tempa = headA;
        ListNode tempb = headB;
        int la = 1;
        int lb = 1;
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
    }
}