package org.pk;

public class Main {
    public static void main(String[] args) {
        ArrayQueue<Employee> arrayQueue = new ArrayQueue<>();
        arrayQueue.add(new Employee(1, "Jane", 123));
        arrayQueue.add(new Employee(2, "Mike", 341));
        arrayQueue.add(new Employee(3, "Bill", 879));

        //print queue
       arrayQueue.printQueue();

       //remove elements
        arrayQueue.remove();
        arrayQueue.printQueue();

        //pop the elements
        System.out.println(arrayQueue.peek());
        arrayQueue.printQueue();
    }
}