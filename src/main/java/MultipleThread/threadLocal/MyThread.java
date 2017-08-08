package MultipleThread.threadLocal;

/**
 * Created by sai.luo on 2017-8-8.
 */
public class MyThread extends  Thread{

    private ThreadLocal线程本地变量 threadLocal线程本地变量 ;
    public MyThread(ThreadLocal线程本地变量 threadLocal线程本地变量){
        this.threadLocal线程本地变量 = threadLocal线程本地变量 ;
    }

    @Override
    public void run() {
        for (int i =0 ;i<10;i++){
            Integer num = threadLocal线程本地变量.getNum();
            System.out.println("当前线程"+Thread.currentThread().getName()+"变量 "+num);
            threadLocal线程本地变量.setNum(num++);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadLocal线程本地变量 threadLocal线程本地变量 = new ThreadLocal线程本地变量();
        MyThread a = new MyThread(threadLocal线程本地变量);
        MyThread b = new MyThread(threadLocal线程本地变量);
        a.start();
        b.start();
        b.join();

    }
}
