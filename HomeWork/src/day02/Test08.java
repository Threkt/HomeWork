package day02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary;name,age,gender,salary;....
 * 例如:
 * 张三,25,男,5000;李四,26,女,6000;...
 * 然后将每个员工信息解析成Person对象。并存入到一个数组中。
 * 然后循环数组，输出每一个员工信息(输出使用toString返回的字符串)
 *
 * @author Bonnie
 */
public class Test08 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("请按照格式输入员工信息（name,age,gender,salary;name,age,gender,salary;....）");
        String str = console.next();
        String[] split1 = str.split("\\;");
        List<Person> list = new ArrayList<>();
        for (int z = 0; z < split1.length; z++) {
            String[] split = split1[z].split("\\,");
            int i = 0;
            Person person = new Person();
            person.setName(split[i++]);
            person.setAge(Integer.valueOf(split[i++]));
            person.setGender(split[i++]);
            person.setSalary(Integer.valueOf(split[i++]));
            list.add(person);
        }
        for (Person person : list) {
            System.out.println(person.toString());
        }
    }
}
