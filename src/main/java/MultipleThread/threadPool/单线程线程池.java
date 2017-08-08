package MultipleThread.threadPool;

import MultipleThread.MyRunner;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by sai.luo on 2017-8-8.
 */
public class 单线程线程池 {
    private static ExecutorService executorService = Executors.newSingleThreadExecutor();
    public static void 没有返回值的多线程任务(){
        for (int i=0;i<100;i++){
            executorService.submit(new MyRunner(i));
        }
    }
}
