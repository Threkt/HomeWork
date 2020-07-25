package day02;

import java.util.Scanner;

/**
 * 测试正则表达式，并尝试编写规则: 电话号码可能有3-4位区号，
 * 7-8位号码:0415-5561111
 *
 * @author Bonnie
 */
public class Test06 {
    public static void main(String[] args) {
        String regex = "^[0-9]*\\-[0-9]{7,8}$";
        String regex2 = "^[0-9]{3,4}\\-[0-9]{7,8}$";
        String regex3 = "^[0-9]{7,8}$";
        System.out.println("请输入一段电话号码");
        Scanner console = new Scanner(System.in);
        String str = console.next();
        if (str.matches(regex)) {
            if (str.matches(regex2)) {
                System.out.println("符合正则表达式");
            } else {
                System.out.println("不符合");
            }
        } else if (str.matches(regex3)) {
            System.out.println("符合正则表达式");
        } else {
            System.out.println("不符合");
        }
    }
}
