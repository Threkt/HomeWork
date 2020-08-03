package day08;

import java.io.*;
import java.util.Scanner;

/**
 * 使用异常捕获完成下述操作
 * 将控制台输入的每一行字符串使用缓冲字符输出流PrintWriter
 * 按行以GBK编码写入到文件note.txt中
 * @author Bonnie
 *
 */
public class Test02 {
    public static void main(String[] args) {
        System.out.println("请输入字符串（输入exit即可推出）");
        Scanner console = new Scanner(System.in);
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(new OutputStreamWriter(new FileOutputStream("note.txt",true),"gbk"),true);
            while (true){
                String str = console.next();
                if (str.equals("exit")){
                    writer.println(str);
                    break;
                }
                writer.println(str);
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            if (writer!=null){
                writer.close();
            }
        }

    }
}
