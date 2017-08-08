package MultipleThread;

import MultipleThread.threads.ThreadA;
import MultipleThread.threads.ThreadB;
import junit.framework.TestCase;

/**
 * Created by sai.luo on 2017-8-8.
 */
public class 测试Thread多线程 extends TestCase{


    public void testA等待B线程结束() throws InterruptedException {
        ThreadA a = new ThreadA("A");
        ThreadB b = new ThreadB("B",a);
        a.start();
        b.start();
        b.join();
        a.interrupt();
        System.out.println("等待线程结束");
    }
}
