package LinkedList.MediumLevel;
import java.util.*;
public class PallindromeLL {
    public static ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode nextNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
        }
        return prev;
    }
    public static boolean isPallindrome(ListNode head){
        if(head==null || head.next==null) return true;
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode newHead=reverse(slow.next);
        ListNode first=head;
        ListNode second=newHead;
        while(second!=null){
            if(first.data!=second.data){
                return false;
            }
            first=first.next;
            second=second.next;
        }
        return true;
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
        ListNode head=new ListNode(3,new ListNode(7,new ListNode(5,
                new ListNode(7,new ListNode(3)))));
        if(isPallindrome(head)){
            System.out.println("linked list is pallidrome");
        }
        else{
            System.out.println("linked list is not pallindrome");
        }
    }
}
