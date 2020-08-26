/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Streams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Sum 
 {   
     public static void main(String args[]) throws IOException 
     {     // Write output to a file.     
         FileWriter fout = new FileWriter("test.txt");     
         fout.write("2 3 5");     
         fout.close(); 
         FileReader fin = new FileReader("Test.txt"); 
         Scanner src = new Scanner(fin); 
        // Read and sum numbers.   
        int sum=0;
        while (src.hasNextInt()) 
        {          
            sum=sum+src.nextInt();
        }  
        System.out.println(sum);
        fin.close();
    }
}
