package day06;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Scanner;

/**
 * 创建一个文件"note.txt",然后通过控制台输入的每一行字符串都按行写入到
 * note.txt中。当输入的字符串为"exit"时退出程序。
 * @author Bonnie
 *
 */
public class Test09 {
    public static void main(String[] args) throws IOException {
        Writer writer = new OutputStreamWriter(new FileOutputStream("note.txt", true));
        Scanner console = new Scanner(System.in);
        while (true){
            System.out.println("请输入字符串");
            String str = console.next();
            if (str.equals("exit")){
                writer.write(str);
                writer.close();
                break;
            }else{
                writer.write(str);
                writer.flush();
            }
        }
    }
}
