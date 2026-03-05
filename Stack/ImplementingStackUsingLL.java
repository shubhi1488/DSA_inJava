package Stack;
class Node{
    int val;
    Node next;
    Node(int d){
        val=d;
        next=null;
    }
}
public class ImplementingStackUsingLL {
    Node top;
    int size;
    public ImplementingStackUsingLL(){
        top=null;
        size=0;
    }
    public void push(int x){
        Node n1=new Node(x);
        n1.next=top;
        top=n1;
        size++;
    }
    public int pop(){
        if(top==null){
            return -1;
        }
        int value=top.val;
        Node temp=top;
        top=top.next;
        temp=null;
        size--;
        return value;
    }
    public int peek(){
        if(top==null) return -1;
        return top.val;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return (size==0);
    }

    public static void main(String[] args) {
        ImplementingStackUsingLL st=new ImplementingStackUsingLL();
        st.push(10);
        System.out.println(st.peek());
        System.out.println(st.size);
        System.out.println(st.isEmpty());
    }
}
