// since we do not have any information about the previous node, and we are only givin the node that we need to delete, we just need to copy the next node's address and the value into the current node.

class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
    node.next = node.next.next;
    }
}
