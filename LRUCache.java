class LRUCache {
    Node head=new Node(0,0);
    Node tail=new Node(0,0);
    int capacity;
    Map<Integer,Node> map;

    public LRUCache(int capacity) {
        this.capacity=capacity;
        map=new HashMap<Integer,Node>(capacity);
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        int result=-1;
        if(map.containsKey(key))
        {
           Node temp=map.get(key); 
           remove(temp);
           add(temp);
           
           result=map.get(key).val;
        }
        return result;
	      
    }
    
    public void put(int key, int value) {
        Node temp = new Node(key,value);
        if(!map.containsKey(key))
        {
           if(capacity==map.size())
               remove(tail.prev);
          add(temp);
        }
        remove(map.get(key));
        add(temp);
        
        
    }
    
    private void remove(Node  node)
    {
        map.remove(node.key);
        Node prev_node=node.prev;
        Node next_node=node.next;
        
        prev_node.next=next_node;
        next_node.prev=prev_node;
    }
    
    private void add(Node node)
    {
        map.put(node.key,node);
        Node headNext=head.next;
        head.next=node;
        node.prev=head;
        node.next=headNext;
        headNext.prev=node;
        
    }
    
    class Node {
        Node prev;
        Node next;
        int key;
        int val;
    
    Node(int key,int val)
    {
        this.key=key;
        this.val=val;
    }
    }
}

