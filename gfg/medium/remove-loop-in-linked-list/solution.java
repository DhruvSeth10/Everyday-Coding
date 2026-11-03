/* Structure of Linked List Node
class Node {
    int data;
    Node next;
    Node(int val) {
        data = val;
        next = null;
    }
} */
class Solution {
    public static void removeLoop(Node head) {
        // code here
        Node fast = head;
        Node slow = head;
        boolean hasLoop = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                hasLoop = true;
                break;
            }
        }
        
        if (!hasLoop) return;
        
        slow = head;
        
        if (slow == fast) {
            while (fast.next != slow)
                fast = fast.next;
            fast.next = null;
            return;
        }
        
        while (slow.next != fast.next) {
            slow = slow.next;
            fast = fast.next;
        }
        
        fast.next = null;
    }
}