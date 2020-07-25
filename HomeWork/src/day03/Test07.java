package day03;

import day02.Person;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 要求用户首先输入员工数量，然后输入相应员工信息，格式为：
 * name,age,gender,salary,hiredate
 * 例如:
 * 张三,25,男,5000,2006-02-15
 * 每一行为一个员工信息，然后将每个员工信息解析成Emp对象。并存入到一个集合中。
 * 在解析成Emp对象后要先查看当前集合是否包含该员工，若包含则提示该用于已存在，
 * 否则才存入集合。
 * 然后输出集合查看每个员工信息.
 *
 * @author Bonnie
 */
public class Test07 {
    public static void main(String[] args) throws ParseException {
        System.out.println("请输入员工数量");
        Scanner console = new Scanner(System.in);
        int NUM = console.nextInt();
        String[] strings = new String[NUM];
        for (int i = 0; i < NUM; i++) {
            System.out.println("请按照格式输入员工的信息（name,age,gender,salary,hiredate）");
            strings[i] = console.next();
        }

        List<Emp> list = new ArrayList<>();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        int flag = 0;
        a1:
        for (String string : strings) {
            String[] split = string.split("\\,");
            if (flag > 0) {
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getName().equals(split[0])) {
                        System.out.println("该员工已存在");
                        break a1;
                    }
                }
            }
            Emp emp = new Emp();
            emp.setName(split[0]);
            emp.setAge(Integer.valueOf(split[1]));
            emp.setGender(split[2]);
            emp.setSalary(Integer.valueOf(split[3]));
            emp.setHiredate(sf.parse(split[4]));
            list.add(emp);
            flag++;
        }
        for (Emp emp : list) {
            System.out.println(emp.toString());
        }


    }
}
