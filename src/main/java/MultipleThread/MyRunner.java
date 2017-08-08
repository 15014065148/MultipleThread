package MultipleThread;

/**
 * Created by sai.luo on 2017-8-8.
 */
public class MyRunner implements Runnable{
    private int i ;

    public MyRunner(int i){
        this.i = i ;
    }
    public void run() {
        System.out.println("任务执行中-----"+i+" 线程名："+ Thread.currentThread().getName());
    }
}
