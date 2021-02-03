public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        var lenA = getLen(headA);
        var lenB = getLen(headB);
        var skipCount = Math.abs(lenA - lenB);
        if (lenA > lenB) {
            while (skipCount-- > 0) headA = headA.next;
        } else {
            while (skipCount-- > 0) headB = headB.next;
        }
        
        var commonLen = Math.min(lenA, lenB);
        while (commonLen-- > 0) {
            if (headA == headB) return headA;
            headA = headA.next;
            headB = headB.next;
        }
        
        
        return null;   
    }
    
    private static int getLen(ListNode head) {
        var len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }
        return len;
    }
}
