package day06;

import org.junit.Test;

import java.io.*;
import java.security.spec.ECParameterSpec;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 编写一个程序，将当前目录下所有员工文件进行读取，并解析出所有员工为Emp
 * 对象并存入集合。然后排序该集合，按照员工的年龄排序，年龄大的靠前，年龄小
 * 的靠后。排序完毕后输出结果。
 * @author Bonnie
 *
 */
public class Test11 {
    @Test
    public void tese01() throws IOException, ClassNotFoundException, ParseException {
        File file = new File(".");
        String[] list = file.list();
        int flag=0;
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        List<Emp> list1 = new ArrayList<>();
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
                    list1.add(emp);
                }}

        }
        if (flag==0){
            System.out.println("该目录下没有emp文件");
        }
        list1.sort(new Comparator<Emp>() {
            @Override
            public int compare(Emp o1, Emp o2) {
                return o2.getAge()-o1.getAge();
            }
        });
        for (Emp emp : list1) {
            System.out.println(emp.toString());
        }

    }
}
