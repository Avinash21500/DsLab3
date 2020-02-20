package StackUsingLinkedList;

import StackUsingArray.MyStack;

import java.util.Random;

public class Mymain {
    public static void main(String[] args) {
        Mystack stack = new Mystack();
        stack.peek();
        stack.pop();
        System.out.println("Size of stack = "+stack.size());
        stack.push(23);
        Node element = stack.peek();
        System.out.println(element.getData());
        System.out.println("Size of stack = "+stack.size());

        for (int i = 0; i <100 ; i++) {
            stack.push(new Random().nextInt(100));

        }
        System.out.println("Size of stack = "+stack.size());
        for (int i = 0; i <180 ; i++) {
            Node deleted;
            deleted = stack.pop();
            if(deleted !=null)
                System.out.print(deleted.getData() + ",");
        }
    }
}
