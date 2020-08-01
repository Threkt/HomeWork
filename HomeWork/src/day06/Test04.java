package day06;

import org.junit.Test;

import java.io.File;

/**
 * 获取并输出当前目录下的所有文件和目录的名字
 * @author Bonnie
 *
 */
public class Test04 {
    @Test
    public void Test01() {
        File file = new File(".");
        System.out.println(file.getAbsoluteFile());
        String[] list = file.list();
        for (String s : list) {
            System.out.println(s);
        }
    }

}
