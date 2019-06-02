package segmentfault.mercyblitz.lesson1.thread;

/**
 * @Author tongning
 * @Date 2019/6/1 0001
 * function:<
 * <p>
 * >
 */
public class ThreadWaitAndNotifyDemo {
    public static void main(String[] args) throws InterruptedException {
        //如果没有传递 Runnable 空执行
        Thread t1 = new Thread(ThreadWaitAndNotifyDemo::sayHollowWorld);
        t1.setName("t1");
        t1.start();

        Thread t2 = new Thread(ThreadWaitAndNotifyDemo::sayHollowWorld);
        t2.setName("t2");
        t2.start();

        // Object.wait() 与 Thread.join() 效果类似
        // 实际上 Thread.join() 就是 Thread 对象 wait(int) 方法

        //调用 wait() 的对象的 wait(),在调用 notify() 方法必须是同一对象

        // Lock 场景：T1 T2  互斥访问资源 R
        // wait() 语义 ： 在同步（互斥场景下）
        // T1 获取 L(T1) -> T2 获取 L(T2)
        // T1 获取 L(T1) -> T2 获取 L(T2)

    }

    public static void sayHollowWorld() {
        Thread currentThread = Thread.currentThread();

        Object monitor = ThreadWaitAndNotifyDemo.class;

        synchronized (monitor) {
            try {
                System.out.printf("线程[%s] 进入等待状态...\n", currentThread.getName());
                monitor.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.printf("线程 [ Id : %s 恢复执行... ]\n", currentThread.getName());
//        System.out.printf("线程 [ Id : %s  Hollow,World ]", Thread.currentThread().getId());

    }

}
