package com.yzj.fileapi;

import java.io.*;

/**
 * 作者: yzj
 * 日期: 2019/9/19
 */
public class ISDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("D:"+File.separator+"5"+File.separator+"stu"+File.separator+ "ob.txt");
        InputStream input = new FileInputStream(file);
        byte data [] =new byte[2048];
        int len = input.read(data);
//        byte data []= input.readAllBytes();
        System.out.println("{"+new String(data)+"}");
        input.close();
    }
}
