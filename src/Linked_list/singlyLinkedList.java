package Linked_list;
import java.util.Scanner;
public class singlyLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public static class linkedlist{
        Node head=null;
        Node tail=null;
        int size=0;
        void insertAtEnd(int data){        //Insert At End method
            Node temp=new Node(data);
            if(head==null){
                head=temp;
            }else{
                tail.next=temp;
            }
            tail=temp;
            size++;
        }

       void insertAtFirst(int data){       //Insert At First method
            Node temp=new Node(data);
            if(head==null){
                head=temp;
                tail=temp;
            }else{
                temp.next=head;
                head=temp;
            }
            size++;
       }

       void insertAtIdx(int idx,int data){      //Insert At Any index method
            if(idx>size+1 || idx<=0){
                System.out.println("Invalid index!!!");
                return;
            }
            if(idx==1){
                insertAtFirst(data);
                return;
            }
            if(idx==size+1){
                insertAtEnd(data);
                return;
            }
            Node temp=head;
            for(int i=1;i<idx-1;i++){
                temp=temp.next;
            }
//           System.out.println(temp.data);
           Node insertNode=new Node(data);
            insertNode.next=temp.next;
            temp.next=insertNode;
            size++;
            return;
       }


       void deleteAtidx(int idx){
            if(idx>size){
                System.out.println("Invaild Index!!!");
                return;
            }
            if(idx==1){
                head=head.next;
                size--;
                return;
            }
            Node temp=head;
            for(int i=1;i<idx-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
       }

        void display(){            // Display method
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" -> ");
                temp=temp.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        linkedlist sll=new linkedlist();
        System.out.print("Enter the size of linked list: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int data=sc.nextInt();
            sll.insertAtFirst(data);
        }

        sll.display();
        System.out.println("tail ka data -> "+sll.tail.data);
        System.out.println("head ka data -> "+sll.head.data);
        sll.insertAtIdx(3,500);
        sll.deleteAtidx(2);
        sll.display();
        System.out.println(sll.size);


    }
}
