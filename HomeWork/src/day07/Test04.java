package day07;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 读取当前项目根目录下所有后缀为.obj的文件，将这些Emp对象读取出来
 * 并存入到一个List集合中，然后按照员工工资从多到少的顺序依次输出员工信息
 * @author Bonnie
 *
 */
public class Test04 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Emp> list = new ArrayList<>();
        File file = new File(".");
        File directory = new File("");
        String courseFile = directory.getCanonicalPath();
        ObjectInputStream ois = null;
        String[] list1 = file.list();
        for (String s : list1) {
            String[] split = s.split(".");
            System.out.println(s);
            if (split[1].equals("obj")){
                ois = new ObjectInputStream(new FileInputStream(courseFile+"/"+s));
                Emp emp =(Emp)ois.readObject();
                list.add(emp);
            }
        }
        list.sort(new Comparator<Emp>() {
            @Override
            public int compare(Emp o1, Emp o2) {
                return o2.getSalary()-o1.getSalary();
            }
        });


    }
}
