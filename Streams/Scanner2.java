/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Streams;


 import java.util.Scanner; 
 public class Scanner2 
 {   
     public static void main(String args[]) 
     {     
         Scanner conin = new Scanner(System.in);
         int count = 0; 
        System.out.println("Enter numbers"); 
        while (conin.hasNext()) 
        {       
          //if (conin.hasNext()) 
          //{         
             System.out.println(conin.next());          
             count++;       
          //}       
          if(count == 3)
          {         
             System.exit(0);               
          }     
        } 
    } 
     
   } 
