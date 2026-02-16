package LinkedList.EasyLevel;
import java.util.*;
public class ReverseLL {
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
    public static void display(ListNode head){
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head=new ListNode(1,new ListNode(2,
                new ListNode(3,new ListNode(4,new ListNode(5)))));
        System.out.println("Linked list before reversing ");
        display(head);
        System.out.println("Linked list after reversing");
        head=reverse(head);
        display(head);
    }
}
