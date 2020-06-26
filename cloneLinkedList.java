/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {      
        if(head==null)
            return null;
        
        Node dummy=head;
        
        Node temp=null;
        
        while(dummy!=null)
        {
          Node t= dummy.next;
          dummy.next=new Node(dummy.val);
          dummy.next.next=t;
          dummy=t;     

        } 
        
        dummy=head;
        
        //
        while(dummy!=null)
        {
            dummy.next.random=(dummy.random!=null)?dummy.random.next: dummy.random;
            
            dummy=dummy.next.next;
        }
        
      dummy = head;
     Node clone = head.next;  
     temp=clone;
        
        
        while(dummy!=null && clone!=null)
        {
            dummy.next=(dummy.next!=null)?dummy.next.next:null; 
            dummy=dummy.next;
            
            clone.next=(clone.next!=null)?clone.next.next :null;
            clone=clone.next;
          
        }
        
        return temp;
        
        
        
    }
}
