package day03;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建一个集合，存放字符串"one","two"，"three"
 * 然后输出该集合的元素个数。
 * 然后输出该集合是否包含字符串"four"
 * 然后输出集合是否不含有任何元素
 * 然后清空集合
 * 然后输出该集合的元素个数
 * 然后输出集合是否不含有任何元素
 * @author Bonnie
 *
 */
public class Test06 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        System.out.println(list.size());
        System.out.println(list.contains("four"));
        System.out.println(list.isEmpty());
        list.clear();
        System.out.println(list.size());
        System.out.println(list.isEmpty());
    }
}
