package day06;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * 要求用户输入一个员工信息，格式为：
 * name,age,gender,salary,hiredate
 * 例如:
 * 张三,25,男,5000,2006-02-15
 * 然后将输入的员工信息解析成Emp对象。
 * 然后将该Emp对象的toString返回的字符串写入到文件中，该文件的
 * 名字为:name.emp,以上面的例子，那么该文件名为:张三.emp
 * 至少运行5次该程序，输入五个员工信息，并生成5个文件。

 * @author Bonnie
 *
 */
public class Test10 {
    public static void main(String[] args) throws ParseException, IOException {
        System.out.println("请输入员工的数量(大于等于5)");
        Scanner console = new Scanner(System.in);
        int num = console.nextInt();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        for (int i = 0; i < num; i++) {
            Emp emp = new Emp();
            System.out.println("请输入员工的信息(name,age,gender,salary,hiredate)");
            String str = console.next();
            String[] split = str.split("\\,");
            emp.setName(split[0]);
            emp.setAge(Integer.valueOf(split[1]));
            emp.setGender(split[2]);
            emp.setSalary(Integer.valueOf(split[3]));
            emp.setHiredate(sf.parse(split[4]));
            Writer writer = new OutputStreamWriter(new FileOutputStream(split[0]+".emp"));
            if (i==num-1){
                writer.write(emp.toString());
                writer.close();
                break;
            }
            writer.write(emp.toString());
            writer.flush();
        }
    }
}
