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
import java.io.FileReader; 
import java.io.FileWriter; 
import java.io.IOException; 
import java.util.Scanner; 
 
public class Delimeter 
{   
    public static void main(String args[]) throws IOException 
    { 
 
       FileWriter fout = new FileWriter("test.txt");     
       fout.write("2,3.4,    5,6, 7.4, 9.1, 10.5, done");     
       fout.close(); 
 
       FileReader fin = new FileReader("Test.txt");     
       Scanner src = new Scanner(fin);     // Set delimiters to space and comma.     
// ", *" tells Scanner to match a comma and zero or more spaces as delimiters. 
 
    src.useDelimiter(", *"); 
 
    // Read and sum numbers.     
     while (src.hasNext()) 
     {       
        if (src.hasNextDouble()) 
        {         
            System.out.println(src.nextDouble());       
        } 
        else 
        {         
            break;       
        }     
     }     
     fin.close();   
    } 
} 
