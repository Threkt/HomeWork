package day07;

import com.sun.tools.javac.Main;
import day06.Emp;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * 要求用户控制台输入想输入的员工人数（至少5个），然后依序输入员工信息，每行为
 * 一条员工信息，格式如:张三,25,男,5000,2006-3-18
 * 然后将该对象写入到文件<name>.obj并保存到当前项目根目录中，例如:张三.obj。
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) throws IOException, ParseException {
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
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(split[0]+".emp"));
            if (i==num-1){
                oos.writeObject(emp.toString());
                oos.close();
                break;
            }
            oos.writeObject(emp.toString());
            oos.flush();
        }
    }
}
