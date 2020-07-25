package day01;

import java.util.Scanner;

/**
 * 要求用户输入一个计算表达式，可以使用加减乘除。
 * 只处理一次运算的，不要有连续加减乘除的表达式,且不做小数计算。(例:1+2+3)
 * 例如:
 * 1+2
 * 然后经过处理计算结果并输出:1+2=3
 * @author Bonnie
 *
 */
public class Test06 {
	public static void main(String[] args) {
		System.out.println("输入一个计算表达式，可以使用加减乘除(只处理一次运算的，不要有连续加减乘除的表达式,且不做小数计算。(例:1+2+3))");
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








