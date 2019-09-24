package com.yzj.threadstu.charpter6;

/**
 * 作者: yzj
 * 日期: 2019/9/24
 */
public class ShareData {
    private final char[] buffer;

    private final ReadWriterLock lock = new ReadWriterLock();

    public ShareData(int size){
        this.buffer = new char[size];
        for(int i = 0; i < size; i++){
            buffer[1] = '*';
        }

    }

    public char[] read() throws InterruptedException {
        try {
            lock.readLock();
            return this.doRead();
        }finally {
            lock.readUnlock();
        }
    }

    public void write(char c) throws InterruptedException {
        try {
            lock.writeLock();
            this.doWrite(c);
        }finally {
            lock.writeUnlock();
        }
    }

    private void doWrite(char c) {
        for(int i = 0; i<buffer.length;i++){
            buffer[i] = c;
            slowly(10);
        }
    }

    private char[] doRead() {
        char[] newBuf = new char[buffer.length];
        for(int i = 0; i < buffer.length ; i++){
            newBuf[i] = buffer[i];
        }
        slowly(50);
        return newBuf;
    }

    private void slowly(int i) {
        try {
            Thread.sleep(i);
        } catch (InterruptedException e) {
        }
    }
}
