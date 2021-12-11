package com.company;

public class MyQueue {
    private int[]arr=new int[10];
    private int front=-1;
    private int rear=-1;

    public boolean isEmpty(){
        return rear==-1 && front==-1;
    }

    public int size(){
        return (rear-front)+1;
    }

    public void enqueue(int value){
        if(rear==arr.length-1) resize();
        if(isEmpty()){
            rear=0;
            front=rear;
        }
        else rear=rear+1;
        arr[rear]=value;
    }

    public int dequeue(){
        if(isEmpty()) System.out.println("Queue is Empty");
        int removed=arr[front];
        if(rear==front){
            front=-1;
            rear=front;
        }
        else front=front+1;
        return removed;
    }

    private void resize () {
        System.out.println("resizing...");
        int[] temp = new int[2*arr.length];
        System.arraycopy(arr, 0, temp, 0, arr.length);
        arr = temp;
    }

    public int peek(){
        return arr[front];
    }

    public String toString () {
        StringBuilder sb = new StringBuilder("[");
        for (int i = front; i < rear; i++) {
            sb.append(arr[i] + ", ");
        }
        sb.append(arr[rear] + "]");
        return sb.toString();
    }

    public static void main(String[] args) {
        MyQueue mq=new MyQueue();
        System.out.println(mq.isEmpty());
        mq.enqueue(5);
        mq.enqueue(8);
        mq.enqueue(3);
        mq.enqueue(1);
        System.out.println(mq);
        System.out.println(mq.size());
        mq.dequeue();
        mq.dequeue();
        System.out.println(mq);
        System.out.println(mq.size());
        mq.enqueue(9);
        mq.enqueue(14);
        mq.enqueue(2);
        System.out.println(mq);
        System.out.println(mq.size());
        mq.dequeue();
        System.out.println(mq);

    }
}
