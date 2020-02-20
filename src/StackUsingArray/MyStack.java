package StackUsingArray;

public class MyStack {
    private int[] data;
    private int top;
    private int size;

    public MyStack(int sizeOfArray) {
        data =new int[sizeOfArray];
        top = 0;
        size = 0;
    }
    //Insert function
    public void push(int element){
        if(!isFull()){
            data[top]=element;
            System.out.println("Data Inserted");
            top++;
            size++;
        }
        else {
            System.out.println("Stack is overflow");
        }
    }

    //Remove function
    public int pop(){
        int response=0;
        if(!isEmpty()){
            top--;
            size--;
            response=data[top];
            return response;
        }
        else {
            System.out.println("Stack is underflow");
            return 0;
        }
    }

    //peek function
    public int peek(){
        int response=0;
        if(!isEmpty()){
            response=data[top-1];
        }
        return response;
    }

    //print size of Array
    public int size(){
        return size;
    }

    //printing all elements
    public void allElement(){
        for (int i = 0; i <top ; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }
    private boolean isEmpty() {
        boolean response=false;
        if(top==0){
            response=true;
        }
        return response;
    }

    private boolean isFull() {
        boolean response=false;
        if(top==data.length){
            response=true;
        }
        return response;
    }

}
