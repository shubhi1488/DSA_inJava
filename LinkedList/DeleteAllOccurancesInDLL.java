package LinkedList.HardLevel;
class NodeDlL{
    int data;
    NodeDlL next;
    NodeDlL prev;
    NodeDlL(){
        this.data=0;
        this.next=null;
        this.next=null;
    }
    NodeDlL(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
    NodeDlL(int data,NodeDlL next,NodeDlL prev){
        this.data=data;
        this.next=next;
        this.prev=prev;
    }

}
public class DeleteAllOccurancesInDLL {
    public NodeDlL deleteOccurances(NodeDlL head,int target){
        NodeDlL temp=head;
        while(temp!=null){
            if(temp.data==target){
                if(temp==head){
                    head=head.next;}
                    NodeDlL nextNode=temp.next;
                    NodeDlL prevNode=temp.prev;
                    if(nextNode!=null) nextNode.prev=prevNode;
                    if(prevNode!=null) prevNode.next=nextNode;
                    temp=nextNode;
                }
            else{
                temp=temp.next;
            }
        }
        return head;
    }
    public static void display(NodeDlL head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DeleteAllOccurancesInDLL obj=new DeleteAllOccurancesInDLL();
        NodeDlL head = new NodeDlL(1);
        head.next = new NodeDlL(2);
        head.next.prev = head;
        head.next.next = new NodeDlL(3);
        head.next.next.prev = head.next;
        head.next.next.next = new NodeDlL(2);
        head.next.next.next.prev = head.next.next;
        head.next.next.next.next = new NodeDlL(4);
        head.next.next.next.next.prev = head.next.next.next;
        head.next.next.next.next.next = new NodeDlL(2);
        head.next.next.next.next.next.prev = head.next.next.next.next;
        head.next.next.next.next.next.next = new NodeDlL(5);
        head.next.next.next.next.next.next.prev = head.next.next.next.next.next;
        System.out.println("Original Linked List");
        display(head);
        head=obj.deleteOccurances(head,2);
        System.out.println("new linked list");
        display(head);

    }
}
