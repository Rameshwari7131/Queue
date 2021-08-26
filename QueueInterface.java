/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rameshwari.j;


public interface QueueInterface {
    
   
    
    /**
      this method is used to add element in the queue
     * @param element
     * @throws IllegalStateException
     **/
    void enqueue();
    
    /**
      This method removes an element from the front of the queue
      @throws IndexOutOfBoundsException
     **/
    void dequeue();
    
    /**
      This method is use to check if element is full or not
      
      @return boolean 
     **/
    boolean full();
    
    /**This method is use to check if element is empty or not
      @return boolean
    **/
    boolean empty();
    
    /**
      This method is use to display all elements in the queue
      
      @return queue
     **/
    void queueDisplay();
    
    /**
      This method is use to return front most element from the queue
      
      @return front element
     **/
    void frontElement();
}
