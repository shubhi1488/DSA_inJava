package LinkedList.MediumLevel;

public class Add1toaNoinLL {
    public static ListNode reverse(ListNode head){
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null){
            ListNode front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;

        }
        return prev;
    }
    public static ListNode add(ListNode head){
        head=reverse(head);
        int carry=1;
        ListNode temp=head;
        while(temp!=null){
            temp.data=temp.data+1;
            if(temp.data<10){
                carry=0;
                break;
            }
            else{
                temp.data=0;
                carry=1;
            }
            temp=temp.next;
        }
        if(carry==1){
            ListNode newNode=new ListNode(carry);
            head=reverse(head);
            newNode.next=head;
            return newNode;
        }
        head=reverse(head);
        return head;
    }
    public static void display(ListNode head){
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head=new ListNode(1,new ListNode(5,new ListNode(9)));
        System.out.println("linked list after adding 1");
        head=add(head);
        display(head);

    }
}
