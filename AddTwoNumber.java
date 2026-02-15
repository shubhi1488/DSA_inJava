package LinkedList.EasyLevel;
class ListNode{
    int data;
    ListNode next;
    ListNode(int data){
        this.data=data;
        this.next=null;
    }
    ListNode(int data,ListNode next){
        this.data=data;
        this.next=next;
    }
}
public class AddTwoNumber {
    public ListNode addTwoNumbers(ListNode l1,ListNode l2){
        ListNode dummy=new ListNode(-1);
        ListNode curr=dummy;
        int carry=0;
        while((l1!=null || l2!=null) || carry!=0){
            int sum=carry;
            if(l1!=null){
                sum=sum+l1.data;

            }
            if(l2!=null) sum=sum+l2.data;
            ListNode newNode=new ListNode(sum%10);
            carry=sum/10;
            curr.next=newNode;
            curr=curr.next;
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
        }
        if(carry!=0){
            ListNode newNode=new ListNode(carry);
            curr.next=newNode;
            curr=curr.next;
        }
        return dummy.next;
    }
    public void display(ListNode head){
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        AddTwoNumber obj1=new AddTwoNumber();
        ListNode l1=new ListNode(3,new ListNode(5));
        ListNode l2=new ListNode(4,new ListNode(5,new ListNode(9,new ListNode(9))));
        ListNode result=obj1.addTwoNumbers(l1,l2);
        obj1.display(result);

    }

}
