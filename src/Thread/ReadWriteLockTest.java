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
            System.out.println(Thread.currentThread().getName()+"׼��д������");
            try{
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.data = data;
            System.out.println(Thread.currentThread().getName()+"д��"+this.data);
        }finally {
            readWriteLock.writeLock().unlock();
        }
    }

    public int get(){
        readWriteLock.readLock().lock();// ȡ������
        try {
            System.out.println(Thread.currentThread().getName() + "׼����ȡ����");
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "��ȡ" + this.data);
            return this.data;
        } finally {
            readWriteLock.readLock().unlock();// �ͷŶ���
        }
    }
}
