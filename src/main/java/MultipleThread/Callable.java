package MultipleThread;

/**
 * Created by sai.luo on 2017-8-8.
 */
public class Callable implements java.util.concurrent.Callable {

    public Object call() throws Exception {
        System.out.println("线程名："+ Thread.currentThread().getName());
        return  Thread.currentThread().getName()+ "回调方法返回的数据";
    }
}
