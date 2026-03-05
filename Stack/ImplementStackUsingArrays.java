package Stack;
import java.util.*;
public class ImplementingStackUsingArrays {
    int maxsize;
    int[] st;
    int top;
    public ImplementingStackUsingArrays(int size){
        this.maxsize=size;
        this.st=new int[maxsize];
        this.top=-1;
    }
    public void push(int element){
        if(top==maxsize-1){
            System.out.println("Stack Overflow!No more elements can be added");

        }
        else{
            top++;
            st[top]=element;
            System.out.println("Element added to the stack is:"+element);
        }
    }
    public int pop(){
        if(top==-1){
            System.out.println("Stack Underflow! stack is empty");
            return -1;
        }
        return st[top--];
    }
    public int peek(){
        if(top==-1){
            System.out.println("Stack is empty");
            return -1;
        }
        return st[top];
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public void display(){
        if(top==-1){
            System.out.println("stack is empty");
        }
        else{
            System.out.println("stack is empty");
            for(int i=top;i>=0;i--){
                System.out.println("stack elements are:"+st[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of the array");
        int size=sc.nextInt();
        ImplementingStackUsingArrays stack=new ImplementingStackUsingArrays(size);
        int choice;
        do{
            System.out.println("\n1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. isEmpty");
            System.out.println("5. Display");
            System.out.println("6. Exit");
            System.out.println("enter the choice");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("enter the element to be entered");
                    int value=sc.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.peek();
                    break;
                case 4:
                    stack.isEmpty();
                    break;
                case 5:
                    stack.display();
                    break;
                case 6:
                    System.out.println("exiting the system");
                    break;
                default:
                    System.out.println("Invalid output");
            }
        }while(choice!=6);
        sc.close();

    }
}
