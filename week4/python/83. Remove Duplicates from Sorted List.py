class Solution(object):
    def deleteDuplicates(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """

        seen = set()
        current_node = head
        
        if head is not None:
            seen.add(current_node.val)
        else:
            return head
        
        while current_node.next is not None:
            if current_node.next.val in seen or current_node.next is None:
                current_node.next = current_node.next.next
                
            else:
                current_node = current_node.next
                seen.add(current_node.val)
                
        return head
