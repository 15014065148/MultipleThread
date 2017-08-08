package MultipleThread;

import MultipleThread.threadPool.缓存线程池;
import junit.framework.TestCase;

/**
 * Created by sai.luo on 2017-8-8.
 */
public class 测试缓存线程池 extends TestCase {

    public void test没有返回值的多线程任务(){
        缓存线程池.没有返回值的多线程任务();
    }
    public void test有返回值的多线程任务(){
        缓存线程池.有返回值的多线程任务();

    }
    public void test等待所有任务完成执行其他任务(){
        缓存线程池.等待所有任务完成执行其他任务();
    }
}
