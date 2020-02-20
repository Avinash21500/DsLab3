package Queue.PriorityQueue;

public class MyQueue {
    private Node front;
    private Node rear;
    private int size;
    MyQueue(){
        front=null;
        rear=null;
        size=0;
    }
     public boolean isEmpty(){
        boolean response=false;
        if(size!=0 || front!=null){
            response=true;
        }
        return response;
    }
    public Node dequeue(){
        Node response=null;
        if(front!=null){
            if(front.getNext()!=null){
                response=new Node(front.getData());
                front=front.getNext();
                rear.setNext(front);
                size--;
            }
            else {
                response=front;
                front=null;
                rear=null;
                size--;
            }
        }
        return response;
    }

    public Node peek(){
        Node response=null;
        if(front!=null){
            response=front;
        }
        return response;
    }
}
