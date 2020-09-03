class MinStack {


    /** initialize your data structure here. */
    static class DLLStack{
        int data;
        DLLStack next;
        DLLStack prev;
        
        DLLStack()
        {
            this.data=0;
            prev=null;
            next=null;
        }
        
        DLLStack(int val)
        {
            this.data=val;
            prev=null;
            next=null;
        }  
    }

     DLLStack eleStack; 
     DLLStack minstack;
     int min;
    
    
    public MinStack() { 
            eleStack=new DLLStack();
            minstack=new DLLStack();
            min=Integer.MAX_VALUE;
    }
    
    public void push(int x) {
        
        eleStack.data=x;
        DLLStack temp=new DLLStack();
        temp.prev=eleStack;
        eleStack.next=temp;
        eleStack=eleStack.next;
        
        if(min>x)
            min=x;
        
        minstack.data=min;
        DLLStack tempMin=new DLLStack();
        tempMin.prev=minstack;
        minstack.next=tempMin;
        minstack=minstack.next;   
    }
    
    public void pop() {
        if(eleStack.prev.prev!=null)
        {
            eleStack.prev=eleStack.prev.prev;
            eleStack.prev.next=eleStack;
        }
        else if(eleStack.prev.prev==null)
        {
            eleStack.prev=null;
            
        }
        
        if(minstack.prev.prev!=null)
        {
            minstack.prev=minstack.prev.prev;
            minstack.prev.next=minstack;
            min=minstack.prev.data;
        }
        else if(minstack.prev.prev==null)
        {
            minstack.prev=null;
            min=Integer.MAX_VALUE;
            
        }        
    }
    
    public int top() {
        if(eleStack.prev!=null)
            return eleStack.prev.data;
        
        else 
            return 0;
        
    }
    
    public int getMin() {
    if(minstack.prev!=null)
         return minstack.prev.data;
        else 
            return 0;
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
