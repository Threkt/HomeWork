package day02;

import java.util.Scanner;

/**
 * 输入一个数学计算表达式，如:1+2
 * 然后输出计算后的结果:1+2=3
 * 这里计算表达式只计算一次即可，可以使用加减乘除任意一个,可以进行小数运算。
 * @author Bonnie
 *
 */
public class Test07 {
    public static void main(String[] args) {
        System.out.println("输入一个计算表达式");
        Scanner console = new Scanner(System.in);
        String str = console.next();
        int i = parseInt(str);
        System.out.println(i);
    }
    public static int parseInt(String str){
        // 最后要生成的数字
        int num = 0;
        if (str.contains("+")){
            String[] split = str.split("\\+");
            num = Integer.valueOf(split[0])+Integer.valueOf(split[1]);

        }else if (str.contains("-")){
            String[] split = str.split("\\-");
            num = Integer.valueOf(split[0])-Integer.valueOf(split[1]);

        }else if (str.contains("*")){
            String[] split = str.split("\\*");
            num = Integer.valueOf(split[0])*Integer.valueOf(split[1]);

        }else if (str.contains("/")){
            String[] split = str.split("\\/");
            num = Integer.valueOf(split[0])/Integer.valueOf(split[1]);

        }
        return num;
    }
}
