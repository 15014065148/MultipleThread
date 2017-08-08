package MultipleThread.threadPool;

import MultipleThread.Callable;
import MultipleThread.MyRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by sai.luo on 2017-8-8.
 */
public class 缓存线程池 {
    private static ExecutorService executorService = Executors.newCachedThreadPool();

    public static void 没有返回值的多线程任务(){
        for (int i=0;i<100;i++){
            executorService.submit(new MyRunner(i));
        }
    }

    public static void 有返回值的多线程任务(){
        List<Future<String >> futures = new ArrayList<>();
        for (int i=0;i<100;i++){
            Future submit = executorService.submit(new Callable());
            futures.add(submit);
        }
        //获取返回的值
        futures.forEach(future->{
                    try {
                        String o = future.get();
                        System.out.println(o);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (ExecutionException e) {
                        e.printStackTrace();
                    }

                }
        );
    }

    public static void 等待所有任务完成执行其他任务(){
        for (int i=0;i<100;i++){
            executorService.submit(new MyRunner(i));
        }
        /**
         * 执行器去执行任务，不接受新任务
         */
        executorService.shutdown();
        try {
            System.out.println("--------------------------");
            /**
             * 等待任务执行完成
             */
            executorService.awaitTermination(10, TimeUnit.MINUTES);
            System.out.println("开始执行其他任务 。。。。");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
