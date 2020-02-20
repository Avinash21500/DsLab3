package Queue.UsingLinkedList;

public class MyQueueUsingLinkedList {
    private Node front;
    private Node rear;
    private int size;
    public MyQueueUsingLinkedList(){
        front=null;
        rear=null;
        size=0;
    }
     public boolean isEmpty(){
        boolean respone=false;
        if (front==rear||size==0){
            respone=true;
        }
        return respone;
    }

    void enqueue(int element){
        Node node=new Node(element);
        if(front==null){
            front=node;
            rear=node;
            size++;
            System.out.println("Value successfuly entered ");
        }
        else{
            rear.setNext(node);
            rear=node;
            size++;
            System.out.println("Value successfuly entered ");
        }
    }
    Node dequeue(){
        Node response=null;
        if(front!=null) {
            if (front.getNext() != null) {
                response = front;
                front = front.getNext();
                size--;
            } else {
                response = front;
                front = null;
                rear = null;
                size--;
            }
        }
        return response;
    }

    Node peek(){
        return front;
    }

    int size(){
        return size;
    }

}
