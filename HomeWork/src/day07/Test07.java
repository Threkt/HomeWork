package day07;

import org.junit.Test;

import java.io.*;
import java.util.Scanner;

/**
 * 要求用户输入一个文件，该文件应当是Test07程序生成的文件，然后将该文件中所有字符读取
 * 出来，并以UTF-8编码写入到另一个文件中，实现文件转码工作，该文件取名格式:原文件名_utf.txt。
 * @author Bonnie
 *
 */
public class Test07 {
    @Test
    public void test01() throws IOException {
        System.out.println("请输入要转码的文件名");
        Scanner console = new Scanner(System.in);
        String name = console.next();
        File file = new File(".");
        String[] list = file.list();
        int flag=0;
        for (String s : list) {
            if (s.equals(name)){
                flag++;
                String[] split = name.split("\\.");
                Writer writer = new OutputStreamWriter(new FileOutputStream(split[0]+"_utf.txt"),"UTF-8");
                Reader reader = new InputStreamReader(new FileInputStream(name));
                int len;
                char[] chars = new char[1024];
                while ((len = reader.read(chars))!=-1){
                    writer.write(chars,0,len);
                }
            }
        }
        if (flag==0){
            System.out.println("文件不存在");
        }

    }
}
