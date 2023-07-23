public class ThreadSynchronization {
    public static void main(String args[])
     {
    MyThread thread1 = newMyThread("thread1: ");
    MyThread thread2 = newMyThread("thread2: ");
    thread1.start();
    thread2.start();
    boolean thread1IsAlive = true;
    boolean thread2IsAlive = true;
    do {
    if (thread1 Is Alive && !thread1.isAlive()) {
     thread1 Is Alive = false;
    System.out.println("Thread 1 is dead.");
     }
    if (thread2 Is Alive && !thread2.isAlive()) {
     thread2IsAlive = false;
    System.out.println("Thread 2 is dead.");
     }
     } while(thread1IsAlive || thread2IsAlive);
     }
    }
    classMyThreadextends Thread
    {
    static String message[] =
    { "Eat", "Well", "Sleep", "Well", "Do", "WELL."};
    publicMyThread(String id)
     {
    super(id);
     }
    publicvoid run()
     {
    SynchronizedOutput.displayList(getName(),message);
     }
    voidrandomWait()
     {
    try {
    sleep((long)(3000*Math.random()));
     } catch (InterruptedException x) {
    System.out.println("Interrupted!");
     }
     }
    }
    classSynchronizedOutput
    {
    publicstaticsynchronizedvoiddisplayList(String name,String list[])
    {
    for(inti=0;i<list.length;++i) {
    MyThread t = (MyThread) Thread.currentThread();
    t.randomWait();
    System.out.println(name+list[i]);
    }
    }
    }


