package queue.udemy.circular;

import java.util.NoSuchElementException;

public class ArrayQueue {
    private Employee[] queue;
    private int front;
    private int back;   // next available position

    public ArrayQueue(int capacity) {
        this.queue = new Employee[capacity];
    }

    public void add(Employee employee){
        if(size() == queue.length) {
            int arraySize = queue.length;
            Employee[] newArray = new Employee[2* queue.length];
            System.arraycopy(queue,front,newArray,0,queue.length-front);
            System.arraycopy(queue,0, newArray, queue.length-front, back);
            queue = newArray;

            front = 0;
            back = arraySize;
        }
        queue[back] = employee;
        if(back < queue.length-1)
            back++;
        else
            back=0;
    }

    public Employee remove() throws NoSuchElementException{
        if(size() == 0){
            front = 0;
            back = 0;
            throw new NoSuchElementException();
        }
        Employee employee = queue[front];
        queue[front++] = null;

        if (front == queue.length) {
            front = 0;
        }
        return employee;
    }

    public Employee peek() throws NoSuchElementException{
        if(size() == 0)
            throw new NoSuchElementException();

        return queue[front];
    }

    public int size(){
        if(front <= back)
            return back - front;
        else
            return back - front + queue.length;
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    public void printQueue() {
        if(front <= back){
            for(int i=front; i<back; i++){
                System.out.print(queue[i]+" ");
            }
            System.out.println();
        }
        else {
            for(int i=front; i<queue.length; i++)
                System.out.print(queue[i]+" ");
            for(int i=0; i<back; i++){
                System.out.print(queue[i]+" ");
            }
        }
    }
}