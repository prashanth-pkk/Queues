package org.pk;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class ArrayQueue<T> {
    private T[] queue;
    private int front;
    private int back;
    public static final int INITIAL_CAPACITY = 10;

    public ArrayQueue() {
        queue = (T[]) new Object[INITIAL_CAPACITY];
        front = 0;
        back = 0;
    }

    public ArrayQueue(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("The capacity must be greater than 1");
        }
        queue = (T[]) new Object[INITIAL_CAPACITY];
        front = 0;
        back = 0;
    }

    //add() method is used to add the elements in queue
    public void add(T element) {
        if (back == queue.length) {
            reSize(queue.length * 2);
        }
        queue[back] = element;
        back++;
    }

    //remove() method is used to remove elements from queue
    public T remove() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }
        T element = queue[front];
        queue[front] = null;
        front++;

        if (size() == 0) {
            back = 0;
            front = 0;
        }
        return element;
    }

    private void reSize(int newSize) {
        if (newSize < INITIAL_CAPACITY) {
            newSize = INITIAL_CAPACITY;
        }
        queue = Arrays.copyOf(queue, newSize);
    }

    public int size() {
        return back - front;
    }

    //peek() method, used to peek elements in queue
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return queue[front];
    }

    public boolean isEmpty() {
        return front == back;
    }

    public void printQueue() {
        for (int i = front; i < back; i++) {
            System.out.println(queue[i]);
        }
    }
}
