package LinkedList.HardLevel;

import java.util.HashMap;

class Node{
    int val;
    Node next;
    Node random;
    Node(){
        this.val=0;
        this.next=null;
        this.random=null;
    }
    Node(int val){
        this.val=val;
        this.next=null;
        this.random=null;
    }
    Node(int val,Node next,Node random){
        this.val=val;
        this.next=next;
        this.random=random;
    }
}
public class CloneOfLL {
    public Node cloneOfLL(Node head){
        if(head==null) return null;
        HashMap<Node,Node> mpp=new HashMap<>();
        Node temp=head;
        while(temp!=null){
            Node newNode=new Node(temp.val);
            mpp.put(temp,newNode);
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            Node copyNode=mpp.get(temp);
            copyNode.next=mpp.get(temp.next);
            copyNode.random=mpp.get(temp.random);
            temp=temp.next;
        }
        return mpp.get(head);
    }
    public static void display(Node head){
        while(head!=null){
            System.out.print("Head data:"+head.val);
            if(head.random!=null){
                System.out.print("random data:"+head.random.val);
            }else{
                System.out.print("Random:null");
            }
            System.out.println();
            head=head.next;
        }
    }

    public static void main(String[] args) {
        CloneOfLL obj=new CloneOfLL();
        Node head = new Node(7);
        head.next = new Node(14);
        head.next.next = new Node(21);
        head.next.next.next = new Node(28);

        // Assigning random pointers
        head.random = head.next.next; // 7 -> 21
        head.next.random = head; // 14 -> 7
        head.next.next.random = head.next.next.next; // 21 -> 28
        head.next.next.next.random = head.next; //
        System.out.println("original linked list");
        display(head);
        System.out.println("clone of the linked list");
        head=obj.cloneOfLL(head);
        display(head);
    }
}
