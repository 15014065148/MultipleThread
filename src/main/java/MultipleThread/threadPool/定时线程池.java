package MultipleThread.threadPool;

import MultipleThread.MyRunner;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/**
 * Created by sai.luo on 2017-8-8.
 */
public class 定时线程池 {
    private static ScheduledExecutorService executorService = Executors.newScheduledThreadPool(5);
    public static void 执行一次(){
        executorService.schedule(new MyRunner(1),5, TimeUnit.SECONDS);
    }

    /**
     * delay 一个任务执行完到下一个任务执行开始的时间间隔
     */
    public static void 延迟固定时间定时执行(){
        executorService.scheduleWithFixedDelay(new MyRunner(1), 5, 8, TimeUnit.SECONDS);
    }

    /**
     * period 一个任务开始执行到下一个任务开始执行的时间 如果一个任务在该时间内没有完成，则延迟开始执行新任务
     */
    public static void 定时执行(){
        executorService.scheduleAtFixedRate(new MyRunner(1), 5, 8, TimeUnit.SECONDS);
    }
}
