/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Streams;

/**
 *
 * @author User
 */
import java.util.Scanner; 
 
public class FindLine 
{   
    public static void main(String args[]) 
    {     
        Scanner sc = new Scanner("Name: Tom Age: 28 ID: 77");
        sc.findInLine("ID:"); 
 
        if (sc.hasNext())       
            System.out.println(sc.next());     
        else      
            System.out.println("Error!");
     } 
 
} 
