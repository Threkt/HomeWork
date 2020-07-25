package day02;

import java.util.Scanner;

/**
 * 输入一个IP地址，然后将4段数字分别输出
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) {
        String guifan = "^[0-9]{0,3}\\.[0-9]{0,3}\\.[0-9]{0,3}\\.[0-9]{0,3}$";
        System.out.println("请输入一段ip地址（xxx.xxx.xxx.xxx）");
        Scanner console = new Scanner(System.in);
        String str = console.next();
        if (str.matches(guifan)){
            String[] split = str.split("\\.");
            for (String s : split) {
                System.out.println(s);
            }
        }else {
            System.out.println("地址格式输入错误");
        }
    }
}
