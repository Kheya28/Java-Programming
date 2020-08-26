/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Streams;

import java.io.*;

/**
 *
 * @author User
 */
public class Parse {
     public static void main (String[] args) throws IOException  
    {  
        InputStreamReader inStream = new InputStreamReader( System.in ) ;     
        BufferedReader stdin = new BufferedReader( inStream );      
        String inData; 
 
        System.out.println("Enter the data:");      
        inData = stdin.readLine();   // reading a full line from the user 
        //String s = stdin.readLine();         //stdin is a BufferedReader  
        int x = Integer.parseInt(inData);
 
        System.out.println("You entered:" + x );   
    }  
     
}
