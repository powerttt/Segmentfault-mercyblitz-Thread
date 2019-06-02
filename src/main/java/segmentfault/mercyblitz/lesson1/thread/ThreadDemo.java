package segmentfault.mercyblitz.lesson1.thread;

/**
 * @Author tongning
 * @Date 2019/6/1 0001
 * function:<
 * <p>
 * >
 */
public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        //如果没有传递 Runnable 空执行
        Thread thread = new Thread(ThreadDemo::sayHollowWorld);
        thread.start();
        thread.join();

        // Lock 场景：T1 T2  互斥访问资源 R
        // wait() 语义 ： 在同步（互斥场景下）
        // T1 获取 L(T1) -> T2 获取 L(T2)

    }

    public static void sayHollowWorld() {

        Object monitor =
        System.out.printf("线程 [ Id : %s  Hollow,World ]", Thread.currentThread().getId());

    }

}
