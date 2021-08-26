/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rameshwari.j;

import static java.lang.Math.log;
import java.util.ArrayList;

/**
 *
 * @author Rameshwari
 * @param <T>
 *
 */
public class queueUsingArr <T> implements QueueInterface {
    private int capacity = 7;
    int rear = 0;
    int front = 0;
    int currentSize = 0;
    
    // Creating an object of ArratList class of T type
    ArrayList<T> queue = new ArrayList<>();
    
    public void enqueue(T element) throws IllegalStateException
    {
        //if queue is empty
        try{
        if(full()){
            throw new IllegalStateException("Queue is full !!");
        }
        else{
            rear ++;
            queue.add(element);
            currentSize ++;
            System.out.println(element + " added to the queue \n");
        }
        }
        catch (IllegalStateException e){
            System.err.print("Queue is full !!");
        }
    }
    
    @Override
    public void dequeue() throws IndexOutOfBoundsException
    {
        try{
       
        if(!empty())
        {
            System.out.println(queue.get(front) + " removed from the queue\n");
            front ++;
            currentSize --;
        }
        }
        catch (IndexOutOfBoundsException e)
        {
            System.err.print("Queue is empty!! ");
        };
    }
    
    
    public void frontElement()
    {
         System.out.println("The front element is  : "+queue.get(front)+ "\n");
    }
    
    public boolean empty()
    {
        if(front == -1 && rear == -1)
        {
            return true;
        }
        return false;
    }
    public boolean full()
    {
        if(currentSize == capacity){
            return true;
        }
        return false;
    }
    
    // print queue elements 
    public void queueDisplay() 
    { 
        int i; 
        if (front == rear) { 
            System.out.printf("Queue is Empty\n"); 
            return; 
        } 
   
        // traverse front to rear and print elements 
        for (i = front; i < rear; i++) { 
            System.out.printf(" "+ queue.get(i)+" \n"); 
        } 
        return; 
    } 

    @Override
    public void enqueue() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
           
    
}
