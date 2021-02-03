#since we do not have any information about the previous node, and we are only givin the node that we need to delete, we just need to copy the next node's address and the value into the current node.

class Solution:
    def deleteNode(self, node):
        """
        :type node: ListNode
        :rtype: void Do not return anything, modify node in-place instead.
        """
        if node.next is not None:
            node.val, node.next = node.next.val, node.next.next
