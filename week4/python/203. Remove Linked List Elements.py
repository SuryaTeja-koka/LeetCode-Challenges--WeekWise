class Solution:
    def removeElements(self, head: ListNode, val: int) -> ListNode:
        while head is not None and head.val == val:
            head = head.next
        
        current_node = head
        while current_node is not None and current_node.next is not None:
            if current_node.next.val == val:
                current_node.next = current_node.next.next
            else:
                current_node = current_node.next
        
        return head
