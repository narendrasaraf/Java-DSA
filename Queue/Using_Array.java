package Queue;

import java.util.*;

public class Using_Array{
    static class Queue{
        static int arr[];
        static int rear;
        static int size;
        Queue (int data) {
            arr= new int[data];
            size=data;
            rear=-1;
        }
        public static boolean isEmpty() {
            return rear==-1;
        }
        public static void Add(int data) {
            if (rear==size-1) {
                System.out.println("Queue is full");
                return;
            }
            rear=rear+1;
            arr[rear]=data;
        }
        public static int remove() {
            if(isEmpty()) return -1;
            int front =arr[0];
            for(int i=0;i<rear;i++) {
                arr[i]=arr[i+1];
            }
            rear=rear-1;
            return front;
        }
        public static int peek() {
            if(isEmpty()) return -1;
            int peek=arr[0];
            return peek;
        }
    }
    public static void main(String[] args) {
        Queue q=new Queue(5);
        q.isEmpty();
        q.Add(1);
        q.Add(2);
        q.Add(3);
        q.Add(4);
        q.peek();
        q.remove();
        q.peek();
    }
}