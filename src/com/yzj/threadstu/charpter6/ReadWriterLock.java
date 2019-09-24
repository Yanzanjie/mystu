package com.yzj.threadstu.charpter6;

import java.awt.print.Pageable;

/**
 * 作者: yzj
 * 日期: 2019/9/24
 */
public class ReadWriterLock {

    private int readingReaders = 0;
    private int waitingReaders = 0;
    private int writingWriters = 0;
    private int waitingWriters = 0;
    private boolean preferWriter = true;

    public ReadWriterLock() {
        this(true);
    }

    public ReadWriterLock(boolean preferWriter) {
        this.preferWriter = preferWriter;
    }

    public synchronized void readLock() throws InterruptedException {

        this.waitingReaders++;
        try {
            while (writingWriters > 0 || (preferWriter&&waitingWriters>0) ) {
                this.wait();
            }
            this.readingReaders++;
        } finally {
            this.waitingReaders--;
        }

    }

    public synchronized void readUnlock() {
        this.readingReaders--;
        this.notifyAll();
    }

    public synchronized void writeLock() throws InterruptedException {
        this.waitingWriters++;
        try {
            while (readingReaders > 0 || writingWriters > 0) {
                this.wait();
            }
            this.writingWriters++;
        } finally {
            this.waitingWriters--;
        }
    }

    public synchronized void writeUnlock() {
        this.writingWriters--;
        this.notifyAll();
    }
}
