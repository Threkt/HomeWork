package day04;

import day02.Person;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary,hiredate;name,age,gender,salary,hiredate;....
 * 例如:
 * 张三,25,男,5000,2006-02-15;李四,26,女,6000,2007-12-24;...
 * 然后将每个员工信息解析成Emp对象。并存入到一个集合中。
 * 然后循环集合，输出每一个员工信息(输出使用toString返回的字符串)
 * 然后输出每个员工的转正仪式日期。
 * 转正仪式日期为:入职3个月的当周周五
 * 
 * @author Bonnie
 *
 */
public class Test09 {
    public static void main(String[] args) throws ParseException {
        List<Emp> list = new ArrayList<>();
        System.out.println("请按照格式输入员工信息（name,age,gender,salary,hiredate;name,age,gender,salary,hiredate;....）");
        Scanner console = new Scanner(System.in);
        String str = console.next();
        String[] split1 = str.split("\\;");
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        for (int z = 0; z < split1.length; z++) {
            String[] split = split1[z].split("\\,");
            int i =0;
            Emp emp = new Emp();
            emp.setName(split[i++]);
            emp.setAge(Integer.valueOf(split[i++]));
            emp.setGender(split[i++]);
            emp.setSalary(Integer.valueOf(split[i++]));
            emp.setHiredate(sf.parse(split[i]));
            list.add(emp);
        }
        for (Emp emp : list) {
            System.out.println(emp.toString());
        }
        Calendar calendar = Calendar.getInstance();
        for (int i = 0; i < list.size(); i++) {
            calendar.setTime(list.get(i).getHiredate());
            calendar.add(Calendar.MONTH,3);
            calendar.set(Calendar.DAY_OF_WEEK,calendar.FRIDAY);
            System.out.println(list.get(i).getName()+"的转正日期为："+sf.format(calendar.getTime()));
        }
    }
}
