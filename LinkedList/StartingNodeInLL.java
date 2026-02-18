package LinkedList.MediumLevel;
import java.util.*;
public class StartingNodeInLL {
    public ListNode startingNode(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                slow=head;
                while(slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        StartingNodeInLL obj=new StartingNodeInLL();
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
        ListNode startnode=obj.startingNode(head);
        if(startnode!=null){
            System.out.println("Starting node:"+startnode.data);
        }
        else{
            System.out.println("No loop exist");
        }

    }
}
