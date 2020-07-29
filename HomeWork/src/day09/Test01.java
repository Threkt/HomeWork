package day09;
/**
 * 使用线程方式一创建两个线程:分别输出1000次，你好和再见
 * @author Bonnie
 *
 */
public class Test01 {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();

        Thread t1 = new Thread(myThread1,"线程1");
        Thread t2 = new Thread(myThread2, "线程2");

        t1.start();
        t2.start();

    }

}
class MyThread1 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName()+"你好"+i);
        }
    }
}
class MyThread2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName()+"再见"+i);
        }
    }
}