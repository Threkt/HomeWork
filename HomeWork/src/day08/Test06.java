package day08;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 使用异常捕获机制完成下述IO操作
 * 编写程序，要求下面的类实现功能:
 * 添加新员工
 * 要求用户输入一个员工信息，格式如下:
 * jackson,25,男,5000,2008-12-22
 * 用户输入后需要做下述验证:
 * 要求用户名长度在1-20个字符之间且必须是英文
 * 年龄在0-100之间的整数
 * 性别只能是:"男"或"女"
 * 当发现用户输入有不符合规定时，提醒用户
 * 相关内容输入不符合要求，并要求重新输入。
 * 都输入正确后，将该员工添加到emp.txt文件
 * 的最后一行。
 *
 * @author Bonnie
 */
public class Test06 {
    public static void main(String[] args) {
        while (true) {
            PrintWriter pw = null;
            try {
                System.out.println("请输入员工信息");
                String xinming = "^[a-zA-Z]{1,20}$";
                String xinbie = "[男女]{1}";
                Scanner console = new Scanner(System.in);
                String str = console.next();
                pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\Administrator\\Desktop\\java\\ideaworks\\zhi-zheng\\HomeWork\\src\\day08\\emp.txt", true)), true);
                String[] split = str.split("\\,");
                if (split[0].matches(xinming) && Integer.valueOf(split[1]) >= 0 && Integer.valueOf(split[1]) <= 100 && split[2].matches(xinbie)) {
                    pw.write(str);
                    break;
                } else {
                    if (!split[0].matches(xinming)) {
                        System.out.println("姓名输入有误，请重新输入");
                    }
                    if (!(Integer.valueOf(split[1]) >= 0 && Integer.valueOf(split[1]) <= 100)) {
                        System.out.println("年龄输入有误，请重新输入");
                    }
                    if (!split[2].matches(xinbie)) {
                        System.out.println("性别输入有误，请重新输入");
                    }
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }finally {
                if (pw!=null){
                    pw.close();
                }
            }
        }


    }
}
