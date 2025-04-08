import java.util.*;

class node{
    node prev;
    int data;
    node next;
    node(int value){
        prev=null;
        data=value  ;
        next=null;

    }
}
public class doubly_LinkedList{
    
    static node head=null;
    static node tail=null;
    public static void insertAtStart(int data){
        node temp= new node(data);
        if(head==null){
            head=temp;
            tail=temp;
        }
        else{
            temp.next=head;
            head.prev=temp;
            head=temp;
        }
    }
    public static void deleteAtStart(){
        if(head==null){
            return;
        }
        if(head==tail){
            head=null;
            tail=null;
            return;
        }
        node temp=head;
        head=head.next;
        head.prev=null;
        temp.next=null;
    }
    public static void display(node head){
        node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.print("Null");
    }
    public static void main(String[] args) {
        //doubly_LinkedList ll=new doubly_LinkedList();
        insertAtStart(14);
        insertAtStart(15);
        insertAtStart(16);
        //insertAtStart(0); 
        display(head);
        System.out.println();
        deleteAtStart();
        display(head);
    }

}