package com.bridgelabz;

public class StackMain {
    public static void main(String[] args) {
    //UC1:
        System.out.println("Stack :-");
    Stacks<Integer> stacks = new Stacks<>();
        stacks.push(70);
        stacks.push(30);
        stacks.push(56);
        stacks.display();
        System.out.println();
    //UC2:
        System.out.println( "Peak Element");
        stacks.peak();
        System.out.println();
        System.out.println( "Popped Element");
    Integer poppedData;
       do {
        poppedData = stacks.pop();
        if (poppedData == null)
            System.out.println("Stack is Empty");
        else
            System.out.println("The Element popped is " + poppedData);
        stacks.display();
    }
       while (poppedData != null);
        System.out.println("-----");
}
}
