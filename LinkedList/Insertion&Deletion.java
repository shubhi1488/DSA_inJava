package LinkedList;
import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
    Node(int data,Node next){
        this.data=data;
        this.next=next;
    }
}
public class InsertionInSLL {
    public static Node insertAtBeginning(Node head,int val){
        if(head==null) return new Node(val);
        Node n1=new Node(val,head);
        return n1;

    }
    public static Node insertAtLast(Node head,int val){
        if(head==null) return new Node(val);
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node n1=new Node(val);
        temp.next=n1;
        return head;
    }
    public static  Node insertAtPosition(Node head,int val,int k){
        if(head==null) {
            if(k==1){
                return new Node(val,head);
            }else{
                return head;
            }
        }
        if(k==1){
            return new Node(val,head);
        }
        int cnt=0;
        Node temp=head;
        while(temp!=null){
            cnt++;
            if(cnt==(k-1)){
                Node x=new Node(val,temp.next);
                temp.next=x;
                break;
            }
        }
        temp=temp.next;
        return head;
    }
    public static Node insertBeforeThex(Node head,int el,int val){
        if(head==null) return null;
        if(head.data==el) return new Node(val,head);
        Node temp=head;
        while(temp.next!=null){
            if(temp.next.data==el){
                Node x=new Node(val,temp.next);
                temp.next=x;
                break;
            }
        }
        temp=temp.next;
        return head;
    }
    public static Node deleteFromBeginning(Node head){
        if(head==null) return head;
        head=head.next;
        return head;
    }
    public static Node deleteFromLast(Node head){
        if(head==null || head.next==null) return null;
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }
    public static Node deleteAtThePosition(Node head,int k){
        if(k==1){
            head=head.next;
            return head;
        }
        int cnt=0;
        Node temp=head;
        Node prev=null;
        while(temp!=null){
            cnt++;
            if(cnt==k){
                prev.next=prev.next.next;
                break;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
    }
    public static Node deleteOnvalue(Node head,int el){
        if(head==null) return head;
        if(head.data==el){
            head=head.next;
            return head;
        }
        Node temp=head;
        Node prev=null;
        while(temp!=null){
            if(temp.data==el){
                prev.next=prev.next.next;
                break;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
    }
    public static  void display(Node head){
         Node temp=head;
         while(temp!=null){
             System.out.print(temp.data+" ");
             temp=temp.next;
         }
         System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Node head=null;
        System.out.println("enter initial elements in the list");
        int n=sc.nextInt();
        System.out.println("enter the elements");
        for(int i=0;i<n;i++){
            int val=sc.nextInt();
            head=insertAtLast(head,val);
        }
        System.out.println("Initial list are:");
        display(head);
        int choice;
        do{
            System.out.println("\n---------Menu--------\n");
            System.out.println("1.Insert At the beginning");
            System.out.println("2. Insert At the Last");
            System.out.println("3. Insert at the given position");
            System.out.println("4. Insert element before the value x");
            System.out.println("5. display");
            System.out.println("0. exit");
            System.out.println("Enter your choice");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("enter the element to insert");
                    int v1=sc.nextInt();
                    head=insertAtBeginning(head,v1);
                    break;
                case 2:
                    System.out.println("enter the element to insert");
                    int v2=sc.nextInt();
                    head=insertAtLast(head,v2);
                    break;
                case 3:
                    System.out.println("enter the position");
                    int k1=sc.nextInt();
                    System.out.println("enter the value");
                    int v3=sc.nextInt();
                    head=insertAtPosition(head,v3,k1);
                    break;
                case 4:
                    System.out.println("enter the value before which element is inserted");
                    int el=sc.nextInt();
                    System.out.println("enter value to insert");
                    int v4=sc.nextInt();
                    head=insertBeforeThex(head,el,v4);
                    break;
                case 5:
                    display(head);
                    break;
                case 0:
                    System.out.println("exiiting the program");
                    break;
                default:
                    System.out.println("wrong choice");
            }
        }while (choice!=0);
        sc.close();


    }
}
