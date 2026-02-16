package LinkedList.MediumLevel;
import java.util.*;
public class DeleteMiddleOfLL {
    public static ListNode delete(ListNode head){
        if(head==null || head.next==null) return null;
        ListNode slow=head;
        ListNode fast=head.next.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=slow.next.next;
        return head;
    }
    public static void display(ListNode head){
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head=new ListNode(1,new ListNode(2,
                new ListNode(3,new ListNode(4,new ListNode(5)))));
        System.out.println("linked list after deletion");
        head=delete(head);
        display(head);
    }
}
