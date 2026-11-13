/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        
        ListNode head1 = list1;
        ListNode head2 = list2;

        if (head1.val > head2.val) {
            ListNode temp = head1;
            head1 = head2;
            head2 = temp;
        }

        ListNode resultHead = head1;

        while (head1 != null && head2 != null) {

            while (head1.next != null && head1.next.val <= head2.val)
                head1 = head1.next;

            if (head1.next == null) {
                head1.next = head2;
                break;
            }
            ListNode temp = head1.next;
            head1.next = head2;
            head2 = temp;
            
            head1 = head1.next;
        }
        return resultHead;
    }
}