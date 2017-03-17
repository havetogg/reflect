package Thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by admin on 2017/3/1.
 */
public class LockTest {
    public static void main(String[] args) {
        OutPutter outPutter = new OutPutter();
        new Thread(){
            @Override
            public void run() {
                outPutter.outPut("zhangsan");
            };
        }.start();
        new Thread(){
            @Override
            public void run() {
                outPutter.outPut("lisi");
            };
        }.start();
    }

}
class OutPutter{
    private Lock lock = new ReentrantLock();
    public void outPut(String name){
        lock.lock();
        try{
            for(int i=0;i<name.length();i++){
                System.out.println(name.charAt(i));
            }
        }finally {
            lock.unlock();
        }
    }
}
