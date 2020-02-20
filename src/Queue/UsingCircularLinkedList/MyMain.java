package Queue.UsingCircularLinkedList;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        MyQueue obj=new MyQueue();
        System.out.print("For Enqueue press 1, for Dequeue press 2, for peeking press 3, for size of queue press 4");
        int counter=sc.nextInt();
        while (counter!=0){
            switch(counter){
                case 1:
                    System.out.print("Enter Element you want to Enter");
                    obj.enqueue(sc.nextInt());
                    break;
                case 2:
                    Node result=obj.dequeue();
                    if(result!=null) {
                        System.out.println("The number is " + result.getData() + ". Your number is also deleted from stack also");
                    }else{
                        System.out.println("The Queue is empty");
                    }
                    break;
                case 3:
                    Node result1=obj.peek();
                    if(result1!=null) {
                        System.out.println("The number is " + result1.getData() + ". ");
                    }else{
                        System.out.println("The Queue is empty");
                    }
                    break;
                case 4:
                    int result2=obj.size();
                    System.out.println("total number of items in queue is "+result2);
                    break;

            }
            System.out.print("For Enqueue press 1, for Dequeue press 2, for peeking press 3, for size of queue press 4, for exit press 0");
            counter=sc.nextInt();

        }
    }
}
