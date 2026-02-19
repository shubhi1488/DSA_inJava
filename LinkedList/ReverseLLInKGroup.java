package LinkedList.HardLevel;
import LinkedList.MediumLevel.ListNode;

import java.util.*;
public class ReverseLLInKGroup {
    public static ListNode findKthNode(ListNode temp,int k){
        k-=1;
        while(temp!=null && k>0){
            k--;
            temp=temp.next;
        }
        return temp;
    }
    public static ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null){
            ListNode nextNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
        }
        return prev;
    }
    public ListNode reversekNodes(ListNode head,int k){
        ListNode temp=head;
        ListNode prevNode=null;
        while(temp!=null){
            ListNode kthNode=findKthNode(temp,k);
            if(kthNode==null){
                if(prevNode!=null){
                    prevNode.next=temp;
                }
                break;
            }
            ListNode nextNode=kthNode.next;
            kthNode.next=null;
            reverse(temp);
            if(temp==head) head=kthNode;
            else prevNode.next=kthNode;
            prevNode=temp;
            temp=nextNode;
        }
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
        ReverseLLInKGroup r1=new ReverseLLInKGroup();
        ListNode head=new ListNode(1,new ListNode(2,new ListNode(3,
                new ListNode(4,new ListNode(5,new ListNode(6,
                        new ListNode(7,new ListNode(8,new ListNode(9,
                                new ListNode(10))))))))));
        head=r1.reversekNodes(head,3);
        display(head);
    }
}
