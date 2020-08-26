/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
package Streams;


import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.IOException;

 
public class ByteStream 
{   
    public static void main(String args[]) throws IOException
    {  
        FileInputStream in=null;
        FileOutputStream out=null;
        
        in=new FileInputStream("input.txt");
        out=new FileOutputStream("output.txt");
        
        int c;
        
        while((c=in.read())!=-1)
        {
            System.out.println(in.read());
            out.write(c);
        }
        
        out.close();
        in.close();
        
    }
}