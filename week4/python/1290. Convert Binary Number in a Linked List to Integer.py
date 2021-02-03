class Solution:
    def getDecimalValue(self, head: ListNode) -> int:
        result = 0
        while head: # linked list lo manam end daaka traverse kaavali soo ee condition
            result = result * 2 + head.val # idhi amo manam result anae variable loki mana binary value ni integer laaga store chaestunnam (iteratively)
            head = head.next  # increment chaestunam
        return result  # returning result
