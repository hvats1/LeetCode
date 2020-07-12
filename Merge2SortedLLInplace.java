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

    private static void sortList(ListNode l1, ListNode l2) {
        ListNode prev = l1;
        
        while (l2 != null) {
            
            if (l1.val == l2.val) {
                if (l1.next != null) {
                    ListNode temp = l1.next;
                    l1.next = new ListNode(l2.val,temp);
                    prev = l1.next;
                    l1 = temp;
                    l2 = l2.next;
                } else {
                    l1.next = l2;
                    break;
                }
            } 
            
            
            else if (l1.val < l2.val) {
                prev = l1;
                if (l1.next != null)
                    l1 = l1.next;
                else {
                    l1.next = l2;
                    break;
                }

            } else {
                ListNode temp = l1;
                l1 = prev;
                l1.next = new ListNode(l2.val,temp);
                prev = l1.next;
                l1 = temp;
                l2 = l2.next;
            }
        }

    }


    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        if (l2==null)
            return l1;

        ListNode ans;
        if (l1.val <= l2.val)
        {   ans=l1;
            sortList(l1, l2);
        }
         else{
             ans=l2;
             sortList(l2,l1);
         }
        
        return ans;


    }
}

 
