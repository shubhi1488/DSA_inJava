package LinkedList.HardLevel;
import java.util.*;
public class SortLL {
    public ListNode sort(ListNode head){
        List<Integer>arr=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            arr.add(temp.data);
            temp=temp.next;
        }
        Collections.sort(arr);
        temp=head;
        for(int val:arr){
            temp.data=val;
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
        SortLL obj=new SortLL();
        ListNode head=new ListNode(5,new ListNode(6,new ListNode(1,new ListNode(2,new ListNode(1)))));
        head=obj.sort(head);
        obj.display(head);


    }

}
