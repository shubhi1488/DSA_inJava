package LinkedList.EasyLevel;
import java.util.*;
public class RemoveKthElementfromlast {
    public static ListNode deleteKthLastElement(ListNode head,int n){
        ListNode fast=head;
        ListNode slow=head;
        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        if(fast==null){
            return head.next;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        ListNode deleteNode=slow.next;
        slow.next=slow.next.next;
        return head;

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
        Scanner sc=new Scanner(System.in);
        ListNode head=new ListNode(1,new ListNode(2,new ListNode(3,
                new ListNode(4,new ListNode(5)))));
        System.out.println("linked list before deletion");
        display(head);
        System.out.println("enter the value of N");
        int N;
        N=sc.nextInt();

        System.out.println("linked list after deletion");
        head=deleteKthLastElement(head,N);
        display(head);
    }
}
