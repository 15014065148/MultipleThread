package MultipleThread;

import MultipleThread.threadPool.单线程线程池;
import junit.framework.TestCase;

/**
 * Created by sai.luo on 2017-8-8.
 */
public class 测试单线程池 extends TestCase {
    public void test单线程没有返回值(){
        单线程线程池.没有返回值的多线程任务();
    }
}
