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
public class File {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           String fname =args[0]; 
  
        //pass the filename or directory name to File object 
        File f = new File(temp.txt); 
  
        //apply File class methods on File object 
        System.out.println("File name :"+f.getName()); 
        System.out.println("Path: "+f.getPath()); 
        System.out.println("Absolute path:" +f.getAbsolutePath()); 
        System.out.println("Parent:"+f.getParent()); 
        System.out.println("Exists :"+f.exists()); 
        if(f.exists()) 
        { 
            System.out.println("Is writeable:"+f.canWrite()); 
            System.out.println("Is readable"+f.canRead()); 
            System.out.println("Is a directory:"+f.isDirectory()); 
            System.out.println("File Size in bytes "+f.length()); 
        } 
    } 
} 
    }
    
}
