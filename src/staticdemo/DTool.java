package staticdemo;

import java.util.Scanner;

public class DTool {
	public static int inputInt(){
		//System:系统类
		//System.out:out是System类的一个属性。该属性代表系统输出流
		//System.in:in是System类的一个属性，代表系统输入流
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个整数");
		int i=sc.nextInt();
		return i;
	}

}
