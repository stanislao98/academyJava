package it.capgemini.academy.esercizioThread;

import java.util.ArrayList;

public class Coda<T> {
    // front and rear variables are initially initiated to
    // -1 pointing to no element that control queue
    int front = -1, rear = -1;
 
    // Creating an object of ArrayList class of T type
    ArrayList<T> A = new ArrayList<>();
 
    // Method 1
    // Returns value of element at front
    T front()
    {
        // If it is not pointing to any element in queue
        if (front == -1)
 
            return null;
 
        // else return the front element
        return A.get(front);
    }
    // Method 2
    // Returns value of element at rear
    T rear()
    {
        // If it is not pointing to any element in queue
        if (rear == -1)
            return null;
        return A.get(rear);
    }
    // Method 3
    // Inserts element at the front of queue
    synchronized void enqueue(T X)
    {
        // If queue is empty
        if (this.empty()) {
            front = 0;
            rear = 0;
            A.add(X);
        }
 
        // If queue is not empty
        else {
            front++;
            if (A.size() > front) {
 
                // Mov front pointer to next
                A.set(front, X);
            }
            else
 
                // Add element to the queue
                A.add(X);
        }
    }
    // Method 4
    // Deletes elements from the rear from queue
    synchronized T dequeue()
    {
        // if queue doesn't have any elements
        if (this.empty()) {
 
            // Display message when queue is already empty
            System.out.println("Queue is already empty");
        	return null;
        }
        // If queue has only one element
        else if (front == rear) {
 
            // Both are pointing to same element
        	int temp = front;
            front = rear = -1;
            return A.get(temp);

        }
 
        // If queue has more than one element
        else {
 
            // Incrememnt the rear
            rear++;
            return A.get(front);

        }
    }
 
    // Method 5
    // Checks whether the queue is empty
    synchronized boolean empty()
    {
        // Both are initialized to same value
        // as assigned at declaration means no queue made
        if (front == -1 && rear == -1)
            return true;
        return false;
    }
    // Method 6
    // Print the queue
 
    // @Override
    public String toString()
    {
        if (this.empty())
            return "";
 
        String Ans = "";
 
        for (int i = rear; i < front; i++) {
            Ans += String.valueOf(A.get(i)) + "->";
        }
 
        Ans += String.valueOf(A.get(front));
 
        return Ans;
    }
}