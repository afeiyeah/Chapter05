package staticdemo;

import java.util.Scanner;

public class DTool {
	public static int inputInt(){
		//System:ϵͳ��
		//System.out:out��System���һ�����ԡ������Դ���ϵͳ�����
		//System.in:in��System���һ�����ԣ�����ϵͳ������
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ������");
		int i=sc.nextInt();
		return i;
	}

}
