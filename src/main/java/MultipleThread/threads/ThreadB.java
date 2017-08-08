package MultipleThread.threads;

/**
 * Created by sai.luo on 2017-8-8.
 */
public class ThreadB extends Thread {
    private String name ;
    private ThreadA a ;
    public ThreadB(String name,ThreadA a) {
        this.name = name;
        this.a = a ;
    }

    @Override
    public void run() {
        System.out.println("线程"+name+"开始执行");
        try {
            a.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("我是线程: " +name+"结束");

    }
}
