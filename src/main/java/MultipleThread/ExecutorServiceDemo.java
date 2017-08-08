package MultipleThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by sai.luo on 2017-8-8.
 */
public class ExecutorServiceDemo {

    public void 测试任务全部完成() throws InterruptedException {
//        ExecutorService executorService = Executors.newCachedThreadPool();
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i=0;i<100;i++){
            executorService.submit(new MyRunner(i));
        }
        executorService.shutdown();
        System.out.println("执行完毕了吗？");
        executorService.awaitTermination(10, TimeUnit.MINUTES);
        System.out.println("执行完毕了");
    }

}
