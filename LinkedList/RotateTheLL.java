package LinkedList.HardLevel;
import LinkedList.MediumLevel.ListNode;

import java.util.*;
public class RotateTheLL {
    public static ListNode findKthNode(ListNode temp,int k){
        int cnt=1;
        while(temp!=null){
            if(cnt==k) return temp;
            cnt++;
            temp=temp.next;
        }
        return temp;
    }
    public ListNode rotate(ListNode head,int k){
        if(head==null || head.next==null || k==0) return head;
        ListNode tail=head;
        int len=1;
        while(tail.next!=null){
            len++;
            tail=tail.next;
        }
        if(k%len==0) return head;
        k=k%len;
        tail.next=head;
        ListNode lastNode=findKthNode(head,len-k);
        head=lastNode.next;
        lastNode.next=null;
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
        RotateTheLL obj=new RotateTheLL();
        ListNode head=new ListNode(1,new ListNode(2,
                new ListNode(3,new ListNode(4,new ListNode(5)))));
        int k=2;
        head=obj.rotate(head,k);
        display(head);
    }
}
