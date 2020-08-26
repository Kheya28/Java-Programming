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
import java.io.*;
import java.util.*; 
 
public class Scanner3 
{   
    public static void main(String args[]) throws IOException 
    {     // Write output to a file.     
        FileWriter fout = new FileWriter("test.txt");     
        fout.write("int: 1  double 1.0  boolean true 6");     
        fout.close(); 
 
        FileReader fin = new FileReader("Test.txt"); 
 
        Scanner src = new Scanner(fin); 
        int coun=0;
        while (src.hasNext()) 
        {       
            if (src.hasNextInt()) 
            {         
                System.out.println("int: " + src.nextInt());
            }       
            else if (src.hasNextDouble()) 
            {         
                System.out.println("double: " + src.nextDouble());
            }        
            else if (src.hasNextBoolean()) 
            {         
                System.out.println("boolean: " + src.nextBoolean());
            }        
            else 
            {         
                System.out.println(src.next());
            }
            coun++;
        }   
        System.out.println(coun-1);
        fin.close();   
    } 
}
