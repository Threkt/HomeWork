package day06;

import org.junit.Test;

import java.io.File;
import java.util.Scanner;

/**
 * 要求用户输入一个目录名并使用File在当前目录下创建出来。
 * 若该目录已经存在，则提示用户该目录已经存在。并创建副本，原则与第二题一致。
 * @author Bonnie
 *
 */
public class Test03 {
    @Test
    public void Test01(){
        System.out.println("请输入一个目录名");
        Scanner console = new Scanner(System.in);
        String str = console.next();
        File file = new File(str);
        int i = 1;
        while (true) {
            if (file.exists()){
                System.out.println("该目录已存在");
                String[] split = str.split("\\.");
                if (split[0].endsWith("_副本"+(i-1))){
                    String[] s = split[0].split("_");
                    str= s[0]+"_副本"+i+"."+split[1];
                }else{
                    str = split[0] +"_副本"+i+"."+split[1];
                }
                file = new File(str);
                i++;
            } else {
                file.mkdir();
                break;
            }
        }
    }
}
