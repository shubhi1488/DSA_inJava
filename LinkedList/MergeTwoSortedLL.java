package LinkedList.HardLevel;
import LinkedList.MediumLevel.ListNode;

import java.util.*;
public class MergeTwoSortedLL {
    public ListNode merge(ListNode list1,ListNode list2){
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        while(list1!=null && list2!=null){
            if(list1.data<=list2.data){
                temp.next=list1;
                list1=list1.next;
            }
            else{
                temp.next=list2;
                list2=list2.next;
            }
            temp=temp.next;
        }
        if(list1!=null){
            temp.next=list1;
        }
        else{
            temp.next=list2;
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
        MergeTwoSortedLL m1=new MergeTwoSortedLL();
        ListNode head1=new ListNode(2,new ListNode(4,
                new ListNode(7,new ListNode(9))));
        m1.display(head1);
        ListNode head2=new ListNode(1,new ListNode(2,new ListNode(5,
                new ListNode(6))));
        m1.display(head2);
        ListNode mergeHead=m1.merge(head1,head2);
        m1.display(mergeHead);
    }
}
