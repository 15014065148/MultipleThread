package MultipleThread.threadLocal;

/**
 * Created by sai.luo on 2017-8-8.
 */
public class ThreadLocal线程本地变量 {

    /**
     * 每个线程一个变量 ,保证每个线程拥有自己的变量，而不会共用。
     */
    private static final ThreadLocal<Integer> threadLocal = new ThreadLocal();
    public  Integer getNum(){
        Integer integer = threadLocal.get();
        if (integer==null){
            integer = 0 ;
            threadLocal.set(integer);
        }
        integer++ ;
        return integer;
    }
    public  void setNum(Integer num){
        threadLocal.set(num);
    }
}
