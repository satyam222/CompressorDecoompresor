/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com_decom;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

/**
 *
 * @author satya
 */
public class decompressor {
     public static void method (File file) throws IOException{
        String fileDirectory=file.getParent();//for saving compressed file in same file
        FileInputStream fis=new FileInputStream(file);//breadth of input file and read the byte file
        GZIPInputStream gzip=new GZIPInputStream(fis);//take input from gz file because input file is compressed
        FileOutputStream fos=new FileOutputStream(fileDirectory+"/DeCompressedFile");//it write the compressed file in simple way
        byte[] buffer=new byte[1024];//by the help of buffer array i can read or fetch the data from input stream 
        int len;
         while((len=gzip.read(buffer))!=-1)//read buffer until end of file ,when length is not equal to -1
        {
            fos.write(buffer, 0, len);//writing in fos file in compressed way from buffer array
            
        }
         gzip.close();
         fos.close();
         fis.close();
     }
    public static void main(String[]args) throws IOException{
        File path=new File("‪D:\\compressdecompressProjTest\\CompressedFile");
        method(path);
        
        
        
    }
}
