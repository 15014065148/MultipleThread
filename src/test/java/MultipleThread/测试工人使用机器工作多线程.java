package MultipleThread;

import MultipleThread.threads.Machine;
import MultipleThread.threads.Worker;
import junit.framework.Test;
import junit.framework.TestCase;

/**
 * Created by sai.luo on 2017-8-9.
 */
public class 测试工人使用机器工作多线程  extends TestCase {

    public void test两个工人各自完成工作时没有并发问题() throws InterruptedException {
        Machine machine = new Machine();
        Worker a = new Worker(machine,10);
        Worker b = new Worker(machine,10);
        Thread A = new Thread(()->a.workAlone(), "A");
        Thread B = new Thread(()->b.workAlone(), "B");
        A.start();
        B.start();
        B.join();
    }
    public void test两个工人共同完成工作时成员变量并发问题() throws InterruptedException {

        Machine machine = new Machine();
        Worker a = new Worker(machine,0);
        Worker b = new Worker(machine,0);
        Thread A = new Thread(()->a.workingTogether(), "A");
        Thread B = new Thread(()->b.workingTogether(), "B");

        A.start();
        B.start();
        B.join();

    }
    public void test两个工人共同完成工作时成员变量并发问题_解决方案_Sychronized方法() throws InterruptedException {

        Machine machine = new Machine();
        Worker a = new Worker(machine,0);
        Worker b = new Worker(machine,0);
        Thread A = new Thread(()->a.synchronizedWork(), "A");
        Thread B = new Thread(()->b.synchronizedWork(), "B");

        A.start();
        B.start();
        B.join();
    }
    public void test两个工人共同完成工作时成员变量并发问题_解决方案_ReentrantLock() throws InterruptedException {

        Machine machine = new Machine();
        Worker a = new Worker(machine,0);
        Worker b = new Worker(machine,0);
        Thread A = new Thread(()->a.workingByLock(), "A");
        Thread B = new Thread(()->b.workingByLock(), "B");

        A.start();
        B.start();
        B.join();
    }
    public void test两个工人共同完成工作时成员变量并发问题_解决方案_synchrozedLockObject() throws InterruptedException {

        Machine machine = new Machine();
        Worker a = new Worker(machine,0);
        Worker b = new Worker(machine,0);
        Thread A = new Thread(()->a.synchrozedWorkingByLockObject(), "A");
        Thread B = new Thread(()->b.synchrozedWorkingByLockObject(), "B");
        A.start();
        B.start();
        B.join();
    }
}
