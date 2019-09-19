package com.yzj.fileapi;

import java.io.File;
import java.io.IOException;

/**
 * 作者: yzj
 * 日期: 2019/9/19
 */
public class JavaAPIDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\IDEA\\stu\\textIO.txt");
        System.out.println(file.createNewFile());
    }

}
