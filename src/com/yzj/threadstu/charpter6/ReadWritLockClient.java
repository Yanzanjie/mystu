package com.yzj.threadstu.charpter6;

/**
 * 作者: yzj
 * 日期: 2019/9/24
 * 读写操作
 */
public class ReadWritLockClient {
    public static void main(String[] args) {
        final ShareData shareData = new ShareData(10);
        new ReaderWocker(shareData).start();
        new ReaderWocker(shareData).start();
        new ReaderWocker(shareData).start();
        new ReaderWocker(shareData).start();
        new ReaderWocker(shareData).start();
        new WriterWorker(shareData,"qwerrrttyyuitufg").start();
        new WriterWorker(shareData,"QWERRRTTYYUITUFG").start();
    }
}
