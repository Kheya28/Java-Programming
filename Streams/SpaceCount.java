/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Streams;

import java.io.*;
import java.util.*;
public class SpaceCount 
 {   
     public static void main(String args[]) throws IOException 
     {     // Write output to a file.     
         InputStreamReader in=new InputStreamReader(System.in);
         BufferedReader br=new BufferedReader(in);
         int coun=0;
         
         String s=br.readLine();
         System.out.println(s);
         
         for(int i=0;i<s.length();i++)
         {
             if(s[i]==" ")
             {
                 coun++;
             }
                 
         }
         
         System.out.println(coun);
    }
}
