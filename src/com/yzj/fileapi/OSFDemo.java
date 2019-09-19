package com.yzj.fileapi;

import java.io.*;

/**
 * 作者: yzj
 * 日期: 2019/9/19
 */
public class OSFDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("D:"+File.separator+"5"+File.separator+"stu"+File.separator+ "ob.txt");

        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        OutputStream output = new FileOutputStream(file,true);
        String str = "www.baidu.com\r\n";
        output.write(str.getBytes());
        output.close();
    }
}
