package com.yzj.fileapi;

import java.io.File;

/**
 * 作者: yzj
 * 日期: 2019/9/19
 */
public class FileDemo {
    public static void main(String[] args){
        File file = new File("D:"+File.separator);
        listDir(file);
    }
    public static void listDir(File file){
        if(file.isDirectory()){
            File results [] = file.listFiles();
            if(results != null){
                for(int x = 0; x<results.length;x++){
                    listDir(results[x]);
                }
            }

        }
        System.out.println(file);
    }
}
