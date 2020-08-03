package day06;

import java.io.*;

/**
 * 创建一个"raf.dat"的文件，并在其中写出一个int的最大值，long的最大值，
 * 然后将其分别读取出来并输出
 * @author Bonnie
 *
 */
public class Test08 {
    public static void main(String[] args) throws IOException {
        Writer writer = new OutputStreamWriter(new FileOutputStream("raf.dat",true));
        writer.write(Integer.MAX_VALUE+"");
        writer.write(Long.MAX_VALUE+"");
    }
}
