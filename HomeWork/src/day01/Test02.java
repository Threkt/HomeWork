package day01;
/**
 * 将"大家好!"修改为:"大家好!我是程序员!"并输出。
 * 然后将"大家好!我是程序员!"修改为:"大家好!我是优秀的程序员!"并输出
 * 然后再修改为:"大家好!我是牛牛的程序员!"并输出
 * 然后在修改为:"我是牛牛的程序员!"并输出
 * @author Bonnie
 * 使用StringBuilder完成
 */
public class Test02 {
	public static void main(String[] args) {
		String str ="大家好!";
		StringBuilder sb = new StringBuilder(str);
		//将"大家好!"修改为:"大家好!我是程序员!"并输出。
		System.out.println(sb.append("我是程序员!"));
		//然后将"大家好!我是程序员!"修改为:"大家好!我是优秀的程序员!"并输出
		System.out.println(sb.insert(6,"优秀的"));
		//然后再修改为:"大家好!我是牛牛的程序员!"并输出
		System.out.println(sb.replace(6,8,"牛牛"));
		//然后在修改为:"我是牛牛的程序员!"并输出
		System.out.println(sb.delete(0,4));







		System.out.println(84);
		System.out.println(44);
		System.out.println(9);
	}
}
