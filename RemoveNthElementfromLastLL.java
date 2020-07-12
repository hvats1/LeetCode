/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fastptr=head;
        ListNode slwptr=head;
        ListNode ans=slwptr;
        
        while(n-- > 0)
         fastptr=fastptr.next;  
        
          if(fastptr==null)
            return ans.next;
        
        while(fastptr.next!=null)
        {
            fastptr=fastptr.next;
            slwptr=slwptr.next;
        }
        
      
        slwptr.next=slwptr.next.next;
        return ans;
        
        
    }
}
