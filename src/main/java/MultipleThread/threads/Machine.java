package MultipleThread.threads;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by sai.luo on 2017-8-9.
 */
public class Machine {
    private static int taskCount = 20;
    private static  final ReentrantLock reentrantLock = new ReentrantLock();
    /**
     * 机器工作。。。
     * 有20个任务 A B 分别做10个任务 实例变量taskCount 有并发问题，而方法内局部变量并发时不会有问题。
     * @throws InterruptedException
     */
    public void workingAlone(int taskCount) throws InterruptedException {
        long start = System.currentTimeMillis();
        System.out.println(Thread.currentThread().getName()+"开始工作了");
        Thread.sleep(10);
        for (int i=taskCount;i>0;i--){
            System.out.println(Thread.currentThread().getName()+"工作中。。。");
            Thread.sleep(100);
            taskCount -- ;
            System.out.println(Thread.currentThread().getName()+"的任务数量减少为：" +taskCount);
        }
        System.out.println(Thread.currentThread().getName()+"工作完成了" +"总耗时时间 单位毫秒"+(System.currentTimeMillis()-start));
    }

    /**
     * 机器工作。。。
     * 有20个任务 A B 分别做10个任务 实例变量taskCount 有并发问题，而方法内局部变量并发时不会有问题。
     * @throws InterruptedException
     */
    public void workingTogether() throws InterruptedException {
        System.out.println(Thread.currentThread().getName()+"开始工作了");
        long start = System.currentTimeMillis();
        Thread.sleep(10);
        while (taskCount>0){
            System.out.println(Thread.currentThread().getName()+"工作中。。。");
            Thread.sleep(100);
            taskCount -- ;
            System.out.println(Thread.currentThread().getName()+"的任务数量减少为：" +taskCount);
        }
        System.out.println(Thread.currentThread().getName()+"工作完成了" +"总耗时时间 单位毫秒"+(System.currentTimeMillis()-start));
    }

    /**
     * 机器工作。。。
     * 有20个任务 A B 分别做10个任务 实例变量taskCount 有并发问题，而方法内局部变量并发时不会有问题。
     * @throws InterruptedException
     */
    public synchronized void  synchrozedWorking() throws InterruptedException {
        System.out.println(Thread.currentThread().getName()+"开始工作了");
        long start = System.currentTimeMillis();
        Thread.sleep(10);
        while (taskCount>0){
            System.out.println(Thread.currentThread().getName()+"工作中。。。");
            Thread.sleep(100);
            taskCount -- ;
            System.out.println(Thread.currentThread().getName()+"的任务数量减少为：" +taskCount);
        }
        System.out.println(Thread.currentThread().getName()+"工作完成了" +"总耗时时间 单位毫秒"+(System.currentTimeMillis()-start));
    }

    /**
     * 机器工作。。。
     * reentrantLock 比sychronized 更灵活的应用锁。更细粒度。 ReentrantReadWriteLock 读写锁
     * @throws InterruptedException
     */
    public  void  workingByLock() throws InterruptedException {
        System.out.println(Thread.currentThread().getName()+"开始工作了");
        long start = System.currentTimeMillis();
        Thread.sleep(10);
        while (taskCount>0){
            System.out.println(Thread.currentThread().getName()+"工作中。。。");
            Thread.sleep(100);
            reentrantLock.lock();//锁住
            if (taskCount==0) break;
            taskCount -- ;
            System.out.println(Thread.currentThread().getName()+"的任务数量减少为：" +taskCount);
            reentrantLock.unlock();//解锁
        }
        System.out.println(Thread.currentThread().getName()+"工作完成了" +"总耗时时间 单位毫秒"+(System.currentTimeMillis()-start));
    }

    /**
     * 机器工作。。。
     * 有20个任务 A B 分别做10个任务 实例变量taskCount 有并发问题，而方法内局部变量并发时不会有问题。
     * @throws InterruptedException
     */
    public  void  synchrozedWorkingByLockObject() throws InterruptedException {
        System.out.println(Thread.currentThread().getName()+"开始工作了");
        long start = System.currentTimeMillis();
        Thread.sleep(10);
        synchronized (this){
            while (taskCount>0){
            System.out.println(Thread.currentThread().getName()+"工作中。。。");
            Thread.sleep(100);
                taskCount -- ;
                System.out.println(Thread.currentThread().getName()+"的任务数量减少为：" +taskCount);
            }
        }
        System.out.println(Thread.currentThread().getName()+"工作完成了" +"总耗时时间 单位毫秒"+(System.currentTimeMillis()-start));
    }

}
