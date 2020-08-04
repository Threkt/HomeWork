package day07;

import org.junit.Test;

import java.io.*;

/**
 * 使用字符流复制当前程序的源文件到当前项目根目录下。
 * @author Bonnie
 *
 */
public class Test05 {
    @Test
    public void test01() throws IOException {
        File f1 = new File(".");
        File f2 = new File("..");
        String path = f1.getAbsolutePath();
        String path1 = f2.getAbsolutePath();
        Reader reader = new InputStreamReader(new FileInputStream(path+"/src/day07/Test05.java"));
        Writer writer = new OutputStreamWriter(new FileOutputStream(path+"/Test05.java"));
        int len;
        char[] chars = new char[1024];
        while ((len = reader.read(chars))!=-1){
            writer.write(chars,0,len);
            writer.flush();
        }

        writer.close();
        reader.close();
    }
}
