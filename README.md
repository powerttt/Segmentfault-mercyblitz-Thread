# Segmentfault-mercyblitz-Thread
Segmentfault课程，小马哥[一入java深似海]系列
## Thread

- 为什么弃用(*deprecated*) :   
  `Thread.stop()`

  ​      把线程锁释放，导致其他线程再去获取锁时中间状态不一致

  > [javaSE8关于线程弃用方法文档][https://docs.oracle.com/javase/8/docs/technotes/guides/concurrency/threadPrimitiveDeprecation.html]
  >
  > 因为它本质上是不安全的。停止线程会导致它解锁已锁定的所有监视器。（当ThreadDeath异常传播到堆栈中时，监视器将被解锁。）如果先前受这些监视器保护的任何对象处于不一致状态，则其他线程现在可以以不一致的状态查看这些对象。据说这些物体已被 损坏。当线程对受损对象进行操作时，可能会导致任意行为。这种行为可能很微妙并且难以检测，或者可能是明显的。与其他未经检查的异常不同，它会 ThreadDeath默默地杀死线程; 因此，用户没有警告他的程序可能被破坏。腐败可以在实际损害发生后的任何时间显现，甚至在未来几小时或几天。

