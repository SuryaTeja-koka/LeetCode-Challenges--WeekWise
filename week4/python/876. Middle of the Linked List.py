class Solution:
    def middleNode(self, head: ListNode) -> ListNode:
        a = []   # empty array okati declaring 
        while head: # iterating inside the linkedlist
            a.append(head) # inserting the value into the array
            head = head.next # incrementing the stuff
        return a[len(a)//2] # we are returning the middle value of the array
        
        
        # simple ga cleppali antae manam oka linked list ni array ga convert chaesaam and then returning the len(array)//2
        
