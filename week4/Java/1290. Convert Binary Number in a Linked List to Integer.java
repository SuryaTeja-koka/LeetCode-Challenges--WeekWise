class Solution {
    public int getDecimalValue(ListNode head) {
        int num = head.val;
        while (head.next != null) {
            num = num * 2 + head.next.val;  // need to remember this logic.....
            head = head.next;    
        }
        return num;
    }
}
