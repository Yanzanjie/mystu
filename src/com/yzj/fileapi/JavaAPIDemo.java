package com.yzj.fileapi;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

/**
 * 作者: yzj
 * 日期: 2019/9/19
 */
public class JavaAPIDemo {
    public static void main(String[] args) throws IOException {
//        File file = new File("D:"+File.separator+"IDEA"+File.separator+"stu"+File.separator+"textIO.txt");
//
//        if(!file.getParentFile().exists()){
//            file.getParentFile().mkdirs();
//        }
//        if(file.exists()){
//            file.delete();
//        }else{
//            System.out.println(file.createNewFile());
//        }

        File file = new File("D:"+File.separator+"IDEA"+File.separator+
                "stu"+File.separator+"ob.jpg");

        System.out.println("文件是否可读"+file.canRead());
        System.out.println("文件是否可写"+file.canWrite());
        System.out.println("文件大小"+file.length() / (double) 1024);
        System.out.println("文件最后修改时间"+new SimpleDateFormat("yyy-MM-dd HH:mm:ss").format(file.lastModified()));
        System.out.println("是目录吗"+file.isAbsolute());
        System.out.println("是文件吗"+file.isFile());

        System.out.println("是文件吗"+file.isFile());


    }

}
