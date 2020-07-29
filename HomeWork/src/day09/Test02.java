package day09;
/**
 * 使用线程方式二创建两个线程:分别输出1000次，你好和再见
 * @author Bonnie
 *
 */
public class Test02 {
    public static void main(String[] args) {
        MyThread3 myThread3 = new MyThread3("线程1");
        MyThread4 myThread4 = new MyThread4("线程2");

        myThread3.start();
        myThread4.start();
    }
}
class MyThread3 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName()+"你好"+i);
        }
    }

    public MyThread3(String name) {
        super(name);
    }
}
class MyThread4 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName()+"再见"+i);
        }
    }

    public MyThread4(String name) {
        super(name);
    }
}