package LinkedList.MediumLevel;

import LinkedList.MediumLevel.ListNode;

import java.util.*;
public class IntersectionofTwoLL{
    public ListNode intersection(ListNode headA, ListNode headB){
        ListNode t1=headA;
        ListNode t2=headB;
        while(t1!=t2){
            t1=t1.next;
            t2=t2.next;
            if(t1==t2) return t1;
            if(t1==null) t1=headB;
            if(t2==null) t2=headA;
        }
        return t1;
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
        IntersectionofTwoLL obj=new IntersectionofTwoLL();
        ListNode head=new ListNode(3,new ListNode(1,new ListNode(4,
                new ListNode(6,new ListNode(2)))));
        ListNode head2=new ListNode(1,new ListNode(2,new ListNode(4,
                new ListNode(5,new ListNode(4,new ListNode(6,new ListNode(2)))))));
        ListNode answerNode=obj.intersection(head,head2);
        if(answerNode==null){
            System.out.println("No Intersection");
        }
        else{
            System.out.println("Intersection happended"+answerNode.data);
        }
    }
}