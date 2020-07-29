package day09;
/**
 * 使用匿名内部类方式创建两个线程:分别输出1000次，你好和再见
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) {
        Thread t1 = new Thread("线程1"){
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println(Thread.currentThread().getName()+"你好"+i);
                }
            }
        };
        Thread t2 = new Thread("线程2"){
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println(Thread.currentThread().getName()+"再见"+i);
                }
            }
        };
        t1.start();
        t2.start();
    }
}
