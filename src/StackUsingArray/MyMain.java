package StackUsingArray;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of Stack you want to make:-  ");
        int z=sc.nextInt();
        MyStack obj=new MyStack(z);
        int n=1;
        while (n != 0 ) {
            System.out.println("What do you want to do?");
            System.out.print("For Inserting Element press 1, For Removing Element press 2,For seeing top Element press 3, For knowing number of Elements press 4, For seeing all Elements press 5:- " );
            int counter=sc.nextInt();
            switch(counter){
                case 1:
                    System.out.print("Enter Element you want to Enter");
                    obj.push(sc.nextInt());
                    break;
                case 2:
                    int result=obj.pop();
                    System.out.println("Last Entered number is "+result+". Your number is also deleted from stack also");
                    break;
                case 3:
                    int result1=obj.peek();
                    System.out.println("Last Entered number is "+result1);
                    break;
                case 4:
                    int result2=obj.size();
                    System.out.println("total number of items in stack is "+result2);
                    break;
                case 5:
                    obj.allElement();
                    break;
            }
            System.out.print("for exit press 0 and for continue press 1");
            n=sc.nextInt();

        }
    }
}
