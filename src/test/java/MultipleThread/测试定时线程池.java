package MultipleThread;

import MultipleThread.threadPool.定时线程池;
import junit.framework.TestCase;

/**
 * Created by sai.luo on 2017-8-8.
 */
public class 测试定时线程池 extends TestCase {
    public void test测试执行一次() throws InterruptedException {
        定时线程池.执行一次();
        Thread.sleep(20000);
    }
    public void test定时执行() throws InterruptedException {
        定时线程池.定时执行();
        Thread.sleep(20000);


    }
    public void test延迟固定时间定时执行() throws InterruptedException {
        定时线程池.延迟固定时间定时执行();
        Thread.sleep(20000);

    }
}
