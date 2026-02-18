package LinkedList.MediumLevel;
import java.util.*;
public class LengthOfTheLoop {
    public int findLengthOfLoop(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return findLength(slow,fast);
            }
        }
        return 0;
    }
    public static int findLength(ListNode slow,ListNode fast){
        int cnt=1;
        fast=fast.next;
        while(slow!=fast){
            cnt++;
            fast=fast.next;
        }
        return cnt;
    }

    public static void main(String[] args) {
        LengthOfTheLoop obj=new LengthOfTheLoop();
        ListNode node1=new ListNode(1);
        ListNode node2=new ListNode(2);
        node1.next=node2;
        ListNode node3=new ListNode(3);
        node2.next=node3;
        ListNode node4=new ListNode(5);
        node3.next=node4;
        ListNode node5=new ListNode(6);
        node4.next=node5;
        node5.next=node2;
        ListNode head=node1;
        int length=obj.findLengthOfLoop(head);
        if(length>0){
            System.out.println("length of the loop:"+length);
        }
        else{
            System.out.println("loop doesnot exist");
        }
    }
}
