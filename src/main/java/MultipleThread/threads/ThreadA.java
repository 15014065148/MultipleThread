package MultipleThread.threads;

/**
 * Created by sai.luo on 2017-8-8.
 */
public class ThreadA extends Thread {
    private String name ;

    public ThreadA(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            System.out.println("线程"+name+"开始执行");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("我是线程: " +name+"结束");

    }
}
