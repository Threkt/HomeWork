package day02;

import java.util.Date;
import java.util.Scanner;

/**
 * 实现文件重命名。
 * 要求用户输入一个文件名称，例如:abc.jpg
 * 然后对该名字进行重新命名，输出的格式为:系统时间毫秒值.jpg
 * 例如:1465266796279.jpg
 * @author Bonnie
 *
 */
public class Test05 {
	public static void main(String[] args) {
		String regex = "^\\w+\\.jpg$";
		System.out.println("请输入一个文件名称（xxx.jpg）");
		Scanner console = new Scanner(System.in);
		String str = console.next();
		if (str.matches(regex)){
			String[] split = str.split("\\.");
			System.out.println(System.currentTimeMillis()+"."+split[1]);
		}else {
			System.out.println("格式不对");
		}
	}
}
