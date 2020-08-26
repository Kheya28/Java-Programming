/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;
import java.io.*;
/**
 *
 * @author Kheya
 */
public class Echo1 {
     public static void main (String[] args) throws IOException  { 
         
       FileReader fileReader = new FileReader("temp.txt") ;   
       BufferedReader stdin = new BufferedReader( fileReader ); 
       String inData; 
 
       System.out.println("Enter the data:"); 
       inData = stdin.readLine();   // reading a full line from the user 
 
       System.out.println("You entered:" + inData ); 
    }
    
}
