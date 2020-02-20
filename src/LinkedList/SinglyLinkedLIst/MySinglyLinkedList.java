package LinkedList.SinglyLinkedLIst;

public class MySinglyLinkedList {
    Node head = null;

    public boolean isEmpty() {
        boolean response = false;
        if (head == null) {
            response = true;
        }
        return response;
    }
    public void insertAtBegining(int element){
        Node node=new Node(element);
        node.setNext(head);
        head=node;
    }
    public void insertAtLast(int element){
        Node node= new Node(element);
        if(head==null){
            head=node;
        }
        else{
            Node temp=head;
            while(temp.getNext()!=null){
                temp=temp.getNext();
            }
            temp.setNext(node);
        }
    }

    public int deleteFromBegining(){
        Node response=null;
        if(head!=null){
            response=head;
            head=head.getNext();
        }
        return head.getData();
    }

    public int deleteFromLast(){
        Node temp=head;
        while(temp.getNext()!=null){
            temp=temp.getNext();
        }
        int response = temp.getData();
        return  response;
    }
    public boolean search(int data){
        boolean response= false;
        Node temp=head;
        while(temp.getNext()!=null){
            if(temp.getData()==data){
                response=true;
                break;
            }
            temp=temp.getNext();
        }
        return response;
    }


    public void printList(){
        Node temp=head;
        while(temp.getNext()!=null){
            System.out.print(temp.getData()+" ");
            temp=temp.getNext();
        }

    }

}
