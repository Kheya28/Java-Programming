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

 
public class File_Reader 
{   
    public static void main(String args[]) throws IOException
    {  
        FileReader in=null;
        FileWriter out=null;
        
        in=new FileReader("input.txt");
        out=new FileWriter("output.txt");
        
        int c;
        
        while((c=in.read())!=-1)
        {
            //System.out.println(in.read());
            out.write(c);
        }
        
        out.close();
        in.close();
        
    }
}