package day05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary,hiredate;name,age,gender,salary,hiredate;....
 * 例如:
 * 张三,25,男,5000,2006-02-15;李四,26,女,6000,2007-12-24;...
 * 然后将每个员工信息解析成Emp对象。并存入到一个List集合中。
 * 并对集合排序，然后输出每个员工信息。
 * 
 * 再根据员工的入职时间排序，入职晚的在前，早的在后并
 * 输出每个员工的信息。
 * @author Bonnie
 *
 */
public class Test03{
    public static void main(String[] args) throws ParseException {
        List<day05.Emp> list = new ArrayList<>();
        System.out.println("请按照格式输入员工信息（name,age,gender,salary,hiredate;name,age,gender,salary,hiredate;....）");
        Scanner console = new Scanner(System.in);
        String str = console.next();
        String[] split1 = str.split("\\;");
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        for (int z = 0; z < split1.length; z++) {
            String[] split = split1[z].split("\\,");
            int i =0;
            day05.Emp emp = new day05.Emp();
            emp.setName(split[i++]);
            emp.setAge(Integer.valueOf(split[i++]));
            emp.setGender(split[i++]);
            emp.setSalary(Integer.valueOf(split[i++]));
            emp.setHiredate(sf.parse(split[i]));
            list.add(emp);
        }
        Collections.sort(list);
        for (Emp emp : list) {
            System.out.println(emp.toString());
        }

        System.out.println("================================================");
        Collections.sort(list, new Comparator<Emp>() {
            @Override
            public int compare(Emp o1, Emp o2) {
                return o1.getHiredate().getTime()<o2.getHiredate().getTime() ? 1:-1;
            }
        });

        for (Emp emp : list) {
            System.out.println(emp.toString());
        }
    }


}
