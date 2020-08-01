package day06;

import org.junit.Test;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

/**
 * 获取并输出当前目录下所有文件的名字
 * @author Bonnie
 *
 */
public class Test06 {
    @Test
    public void Test01() {
        File file = new File(".");
        File[] files = file.listFiles(f -> f.isFile());
        for (File file1 : files) {
            String name = file1.getName();
            System.out.println(name);
        }
    }
}
