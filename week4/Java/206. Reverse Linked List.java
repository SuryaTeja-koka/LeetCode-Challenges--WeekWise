class Solution {
    public ListNode reverseList(ListNode head) {
        // iterative
        ListNode currentNode = head,next=null,prev=null;
        
        while(currentNode!= null){
            // store the current next value in a variable to  not loose reference 
            next = currentNode.next;
            currentNode.next = prev;
            prev = currentNode;
            currentNode =  next;

            head = prev;

            
            
            
            
        }
        
        return prev;
        
    }
}
