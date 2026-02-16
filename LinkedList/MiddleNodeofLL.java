package LinkedList.MediumLevel;
import LinkedList.MediumLevel.ListNode;

import java.util.*;
public class MiddleNodeofLL {
    public static ListNode middleElement(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
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
        ListNode middleNode=middleElement(head);
        System.out.println("middle element is");
        display(middleNode);
    }
}
