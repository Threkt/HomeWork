package day06;

import org.junit.Test;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.Callable;

/**
 * 编写一个程序，将当前目录下所有的员工文件进行读取，并解析出所有员工为Emp
 * 对象并存入Map。其中key为该员工的名字，value为该员工的emp对象。
 * 然后，要求用户输入一个员工名字，若该员工存在，则输出该员工的名字，年龄，工资，以及入职20周年的纪念日当周的周六的日期。
 * 即:输入名字"张三"
 * 若该员工存在，则输出如下格式:
 * 张三,25,5000,2006-02-14
 * 入职20周年纪念日派对日期: 2026-02-14  （注:若入职日期为:2006-02-14）
 * 若该员工不存在，则输出:"查无此人"
 * @author Bonnie
 *
 */
public class Test12 {
    @Test
    public void tese01() throws IOException, ClassNotFoundException, ParseException {
        File file = new File(".");
        String[] list = file.list();
        int flag=0;
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        Map<String,Emp> map = new HashMap<>();
        for (String s : list) {
            if (s.contains(".")){String[] split = s.split("\\.");
                if (split[1].equals("emp")){
                    flag++;
                    Emp emp = new Emp();
                    BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(s)));
                    String line = br.readLine();
                    String[] split1 = line.split("\\,");
                    emp.setName(split1[0]);
                    emp.setAge(Integer.valueOf(split1[1]));
                    emp.setGender(split1[2]);
                    emp.setSalary(Integer.valueOf(split1[3]));
                    emp.setHiredate(sf.parse(split1[4]));
                    map.put(split1[0],emp);
                }}

        }
        if (flag==0){
            System.out.println("该目录下没有emp文件");
        }
        System.out.println("请输入员工名字");
        Scanner console = new Scanner(System.in);
        String name= console.next();
        Set<String> set = map.keySet();
        int flag2=0;
        Calendar instance = Calendar.getInstance();
        for (String s : set) {
            if (s.equals(name)){
                flag2++;
                System.out.println(map.get(s).toString());
                Date hiredate = map.get(s).getHiredate();
                instance.setTime(hiredate);
                instance.add(Calendar.YEAR,20);
                instance.set(Calendar.DAY_OF_WEEK,Calendar.SATURDAY);
                System.out.println("入职20周年纪念日派对日期:"+sf.format(instance.getTime()));
            }
        }
        if (flag2==0){
            System.out.println("查无此人");
        }

    }
}
