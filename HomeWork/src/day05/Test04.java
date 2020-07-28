package day05;

import java.awt.image.ImageProducer;
import java.util.*;

/**
 *创建一个Map，保存某个学生的成绩:
 *在控制台输入该学生成绩，格式:
 *科目:成绩;科目:成绩;...
 *例如:  
 *语文:99;数学:98;英语:97;物理:96;化学:95
 *然后输出物理的成绩。
 *然后将化学的成绩设置为96
 *然后删除英语这一项。
 *然后遍历该Map分别按照遍历key，Entry，value
 *的形式输出该Map信息。
 * @author Bonnie
 *
 */
public class Test04 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        Scanner console = new Scanner(System.in);
        System.out.println("请输入5门学生成绩，例：语文:99;数学:98;英语:97;物理:96;化学:95");
        String str = console.next();
        String[] split = str.split("\\;");
        for (int i = 0; i < split.length; i++) {
            String[] split1 = split[i].split("\\:");
            map.put(split1[0],Integer.valueOf(split1[1]));
        }
        System.out.println(map.get("物理") );
        map.put("化学",96);
        map.remove("英语");


        //1.遍历key
        Set<String> set = map.keySet();
        for (String s : set) {
            System.out.println(s+":"+map.get(s));
        }

        System.out.println("===========================");

        //2.遍历Entry
        Set<Map.Entry<String, Integer>> set1 = map.entrySet();
        for (Map.Entry<String, Integer> entry : set1) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

        System.out.println("===========================");

        //3.遍历value
        Collection<Integer> values = map.values();
        for (Integer value : values) {
            System.out.println(value);
        }

    }

}
