/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com_decom;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

/**
 *
 * @author satya
 */
public class compressor {
    public static void method (File file) throws IOException{
        String fileDirectory=file.getParent();//for saving compressed file in same file
        FileInputStream fis=new FileInputStream(file);//breadth of input file and read the byte file
        FileOutputStream fos=new FileOutputStream(fileDirectory+"/CompressedFile");//output file comes with extension .gz because it is compatable with GZIP algo
        GZIPOutputStream gzip=new GZIPOutputStream(fos);//i want compressed output file so using gzip algo and gzip helpout to read compressed data
        byte[] buffer=new byte[1024];//by the help of buffer array i can read or fetch the data from input stream 
        int len;//length of file input stream
        while((len=fis.read(buffer))!=-1)//read buffer until end of file ,when length is not equal to -1
        {
            gzip.write(buffer, 0, len);//writing in gizip file in compressed way from buffer array
            
        }
        gzip.close();
        fos.close();
        fis.close();
        
        
        
        
        
    }
    public static void main(String[]args) throws IOException{
        File path=new File("‪D:\\compressdecompressProjTest\\DeCompressedFile.gz");
        method(path);
        
        
        
    }
    
}
