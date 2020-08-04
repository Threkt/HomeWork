package day07;

import org.junit.Test;

import java.io.*;
import java.util.Scanner;

/**
 * 记事本功能，首先要求用户输入一个文件名，并将该文件创建出来，
 * 然后通过控制台输入的每一行字符串都按行写入到该文件中，并
 * 使用GBK编码保存。当输入的字符串为"exit"时退出程序。
 * @author Bonnie
 *
 */
public class Test06 {
    @Test
    public void test01() throws IOException {
        Scanner console = new Scanner(System.in);
        System.out.println("请输入文件名");
        String name = console.next();
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream(name,true),"GBK"),true);
        System.out.println("请输入内容（exit退出）");
        while (true){
            String str = console.next();
            if (str.equals("exit")){
                pw.println(str);
                pw.close();
                break;
            }
            pw.println(str);

        }
    }
}
