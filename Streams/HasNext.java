/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Streams;
import java.util.*;
/**
 *
 * @author User
 */
public class HasNext {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print ("Enter first int: "); 
        while (sc.hasNextInt()) 
        {  
          int i = sc.nextInt();  
          System.out.println("You entered " + i);  
          System.out.print ("Enter another int: ");
        }
  }
}
