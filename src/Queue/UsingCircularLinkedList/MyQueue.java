package Queue.UsingCircularLinkedList;

public class MyQueue {
    Node front;
    Node rear;
    int size;
    MyQueue(){
        front=null;
        rear=null;
        size=0;
    }

    boolean isEmpty(){
        boolean response=false;
        if(size==0){
            response=true;
        }
        return response;
    }

    void enqueue(int element){
        Node node=new Node(element);
        if(front==null){
            front=node;
            rear=node;
            rear.setNext(front);
            size++;
            System.out.println("Value successfully Entered");
        }
        else{
            rear.setNext(node);
            rear=node;
            rear.setNext(front);
            size++;
            System.out.println("Value successfully Entered");
        }
    }

    Node dequeue(){
        Node response=null;
        if(front!=null){
            if(front.getNext()!=front){
                response=new Node(front.getData());
                front=front.getNext();
                rear.setNext(front);
                size--;
            }
            else{
                response=new Node(front.getData());
                front=null;
                rear=null;
                size--;
            }
        }
        return response;
    }

    Node peek(){
        Node response=null;
        if(front!=null && rear!= null){
            response=new Node(front.getData());
        }
        return response;
    }
    public int size(){
        return size;
    }
}
