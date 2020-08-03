package day06;

import java.io.*;
import java.util.Scanner;

/**
 * 要求用户输入一个文件名，并复制当前目录中该文件，并取名为"原文件名_copy.后缀名"
 * 定义两个方法分别使用单字节形式复制，以及字节数组形式复制
 * @author Bonnie
 *
 */
public class Test07 {
	public static void main(String[] args) throws IOException {
		System.out.println("请输入文件名");
		Scanner console = new Scanner(System.in);
		String str = console.next();
		copy1(str);
		copy2(str);
	}
	/**
	 * 使用单字节方式复制
	 * @param name 要复制的文件名
	 */
	public static void copy1(String name) throws IOException {
		int i;
		InputStream is = new FileInputStream(name);
		String[] split = name.split("\\.");
		OutputStream os = new FileOutputStream(split[0]+"_copy."+split[1]);
		while ((i=is.read())!=-1){
			os.write(i);
		}

	}
	/**
	 * 使用字节数组形式复制
	 * @param name 要复制的文件名
	 */
	public static void copy2(String name) throws IOException {
		int length;
		InputStream is = new FileInputStream(name);
		String[] split = name.split("\\.");
		OutputStream os = new FileOutputStream(split[0]+"_copy."+split[1]);
		byte[] bytes = new byte[1024];
		while ((length=is.read())!=-1){
			os.write(bytes,0,length);
		}
	}
}
