package queue.udemy.arrayImpl;

import java.util.NoSuchElementException;

public class ArrayQueue {
    private Employee[] queue;
    private int front, back;

    public ArrayQueue(int capacity) {
        this.queue = new Employee[capacity];
    }

    public void add(Employee employee){
        // queue filled
        if(back == queue.length) {
            Employee[] newArray = new Employee[2* queue.length];
            System.arraycopy(queue,0,newArray,0,queue.length);
            queue = newArray;
        }
        queue[back++] = employee;
    }

    public Employee remove() throws NoSuchElementException{
        if(size() == 0){
            front = 0;
            back = 0;
            throw new NoSuchElementException();
        }
        return queue[front++];
    }

    public Employee peek() throws NoSuchElementException{
        if(size() == 0)
            throw new NoSuchElementException();

        return queue[front];
    }

    public int size(){
        return back-front;
    }

    public boolean isEmpty(){
        if(size() == 0)
            return true;
        return false;
    }

    public void printQueue() {
        for(int i=front; i<back; i++){
            System.out.print(queue[i]+" ");
        }
        System.out.println();
    }
}
