package LinkedList.EasyLevel;
import java.util.*;
public class OddEvenLK {
    public ListNode oddEvenList(ListNode head){
        if(head==null || head.next==null) return head;
        List<Integer> arr=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null && temp.next!=null){
            arr.add(temp.data);
            temp=temp.next.next;
        }
        if(temp!=null) arr.add(temp.data);
        temp=head.next;
        while(temp!=null && temp.next!=null){
            arr.add(temp.data);
            temp=temp.next.next;
        }
        if(temp!=null) arr.add(temp.data);
        int i=0;
        temp=head;
        while(temp!=null){
            temp.data=arr.get(i);
            i++;
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
        int[] arr={1,3,4,2,5,6};
        OddEvenLK o1=new OddEvenLK();
        ListNode head=new ListNode(arr[0],new ListNode(arr[1],new ListNode(arr[2],new ListNode(arr[3],
                new ListNode(arr[4],new ListNode(arr[5]))))));
        o1.oddEvenList(head);
        o1.display(head);

    }
}
