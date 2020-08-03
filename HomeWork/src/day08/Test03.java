package day08;

import java.io.*;

/**
 * 使用异常捕获机制完成下述读取操作。
 * 使用缓冲流读取note.txt文件，并将每行字符串输出到控制台上
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) {
        BufferedReader br=null;
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream("note.txt")));
            String str;
            while ((str=br.readLine())!=null){
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (br!=null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
