/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rameshwari.j;

import java.util.Scanner;

/**
 *
 * @author Rameshwari
 */
public class QueueMain {
    public static void main(String [] args)
    {
        queueUsingArr<Integer> q1 = new queueUsingArr<>() {
            
    };
        
        while(true)
        {
            System.out.println("***************QUEUE****************");
            System.out.println("1. FOR adding elements in the queue ");
            System.out.println("2. FOR delete element from the queue");
            System.out.println("3. FOR getting front element from the queue ");
            System.out.println("4. FOR display the queue");
            System.out.println("5. For exit");
            
            System.out.println("Enter Choice : ");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            
            switch(choice){
                case 1: 
                    System.out.println("Enter the element");
                    int element = sc.nextInt();
                    q1.enqueue(element);
                    break;
                case 2 :
                    q1.dequeue();
                    break;
                case 3 :
                    q1.frontElement();
                    break;
                case 4:
                    q1.queueDisplay();
                    break;
                case 5:
                    System.out.println("Thank You !!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong Choice !!");
            }
            
        }
    }
}
