package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by admin on 2017/3/1.
 */
public class Thread1 {
    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(3);
        for(int i=0;i<4;i++){
            final int taskId = i;
            threadPool.execute(new Runnable() {
                @Override
                public void run() {
                    for(int j=1;j<5;j++){
                        try{
                            Thread.sleep(20);
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                        System.out.println("第"+taskId+"个任务第"+j+"次执行");
                    }
                }
            });
        }
        threadPool.shutdown();
    }
}
