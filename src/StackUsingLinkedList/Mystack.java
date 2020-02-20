package StackUsingLinkedList;

public class Mystack {
    Node head;
    int size;
    //Constructor
    public Mystack(){
        head=null;
        size=0;
    }
    public boolean isEmpty(){
        boolean response =false;
        if(head==null){
            response=true;
        }
        return  response;
    }
    //Inserting function
    public void push(int element){
        Node obj=new Node(element);
        obj.setNext(head);
        head=obj;
        size++;
    }
    //delete function
    public Node pop(){
        Node respone=null;
        if(!isEmpty()){
            respone=head;
            size--;
            head=head.getNext();
        }
        else{
            System.out.println("Stack underflow");
        }
        return respone;
    }
    public int size(){
        return size;
    }
    //peeking function
    public Node peek(){
        Node response=null;
        if(!isEmpty()){
            response=head;
        }
        else{
            System.out.println("Stack underflow");
        }
        return response;
    }
}
