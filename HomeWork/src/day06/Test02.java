package day06;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 要求用户输入一个文件名并使用File在当前目录下创建出来。
 * 若该文件已经存在，则提示用户该文件已经存在。并创建该文件副本：
 * 例如:用户输入"test.txt".若该文件已存在，提示用户存在后，创建名为：test_副本1.txt 的文件
 * 若该文件也存在了，则创建名为:test_副本2.txt 的文件，以此类推
 * @author Bonnie
 *
 */
public class Test02 {
    @Test
    public void Test01() throws IOException {
        System.out.println("请输入一个文件名");
        Scanner console = new Scanner(System.in);
        String str = console.next();
        File file = new File(str);
        int i = 1;
        while (true){
            if (file.exists()){
                System.out.println("该文件已存在");
                String[] split = str.split("\\.");
                if (split[0].endsWith("_副本"+(i-1))){
                    String[] s = split[0].split("_");
                    str= s[0]+"_副本"+i+"."+split[1];
                }else{
                    str = split[0] +"_副本"+i+"."+split[1];
                }
                file = new File(str);
                i++;
            }else{
                file.createNewFile();
                break;
            }
        }
    }
}
