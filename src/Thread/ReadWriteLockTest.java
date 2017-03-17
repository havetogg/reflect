package Thread;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by admin on 2017/3/2.
 */
public class ReadWriteLockTest {
    public static void main(String[] args) {

    }
}
class Date{
    private int data;
    private ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    public void set(int data){
        readWriteLock.writeLock().lock();
        try{
            System.out.println(Thread.currentThread().getName()+"准备写入数据");
            try{
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.data = data;
            System.out.println(Thread.currentThread().getName()+"写入"+this.data);
        }finally {
            readWriteLock.writeLock().unlock();
        }
    }

    public int get(){
        readWriteLock.readLock().lock();// 取到读锁
        try {
            System.out.println(Thread.currentThread().getName() + "准备读取数据");
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "读取" + this.data);
            return this.data;
        } finally {
            readWriteLock.readLock().unlock();// 释放读锁
        }
    }
}
