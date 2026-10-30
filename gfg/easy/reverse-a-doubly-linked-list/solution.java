/* Structure of Doubly Linked List Node
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    public Node reverse(Node head) {
        Node curr = head;
        Node temp = null;

        while (curr != null) {
            temp = curr.next;
            curr.next = curr.prev;
            curr.prev = temp;
            
            head = curr;
            curr = temp;
        }

        return head;
    }
}