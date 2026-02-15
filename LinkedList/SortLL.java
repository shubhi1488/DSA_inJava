package LinkedList.EasyLevel;
import java.util.*;
public class SortLL {
    public ListNode sort(ListNode head){
        ListNode temp=head;
        int cnt0=0,cnt1=0,cnt2=0;
        while(temp!=null){
            if(temp.data==0) cnt0++;
            else if(temp.data==1) cnt1++;
            else cnt2++;
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            if(cnt0!=0){
                temp.data=0;
                cnt0--;
            }
            else if(cnt1!=0){
                temp.data=1;
                cnt1--;
            }
            else{
                temp.data=2;
                cnt2--;
            }
            temp=temp.next;
        }
        return head;
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
        SortLL s1=new SortLL();
        ListNode head=new ListNode(1,new ListNode(2,new ListNode(1,
                new ListNode(0,new ListNode(2,new ListNode(1))))));
        System.out.println("Linked list before sorting");
        s1.display(head);
        System.out.println("Linked list after sorting");
        s1.sort(head);
        s1.display(head);
    }

}
