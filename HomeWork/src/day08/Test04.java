package day08;

import org.junit.Test;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * 使用异常捕获机制完成下述读取操作
 * 读取emp.txt文件，并将每个员工信息读取出来，以一个Emp实例保存，然后将
 * 这些Emp实例存入到一个Map集合中。其中key为字符串，是该员工名字，而value
 * 是该Emp实例。
 * 存入后，要求用户输入一个员工的名字,如:张三
 * 若该员工存在则输出该员工所有信息(Emp的toString方法返回的字符串)
 * 输入的员工名若是英文，不要求区分大小写。
 * 若输入的员工名字不存在，则显示"查无此人"
 * 
 * @author Bonnie
 *
 */
public class Test04 {
    @Test
    public  void test(){
        BufferedReader br=null;
        int flag =0;
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\Administrator\\Desktop\\java\\ideaworks\\zhi-zheng\\HomeWork\\src\\day08\\emp.txt")));
            String str ;
            Map<String,Emp> map = new HashMap<>();
            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
            while ((str=br.readLine())!=null){
                Emp emp = new Emp();
                String[] split = str.split("\\,");
                emp.setName(split[0]);
                emp.setAge(Integer.valueOf(split[1]));
                emp.setGender(split[2]);
                emp.setSalary(Integer.valueOf(split[3]));
                emp.setHiredate(sf.parse(split[4]));
                map.put(split[0],emp);
            }
            System.out.println("请输入员工姓名");
            Scanner console = new Scanner(System.in);
            String name = console.next();
            Set<String> set = map.keySet();
            for (String s : set) {
                if (s.equalsIgnoreCase(name)){
                    System.out.println(map.get(s).toString());
                    flag++;
                    break;
                }
            }
            if (flag==0){
                System.out.println("查无此人");
            }


        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }finally {
            if (br!=null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
