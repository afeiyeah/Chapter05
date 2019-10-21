package staticdemo;

public class Circle {
	private double radius;
	public static double pi=3.14;
	
	public double calPer(){
		double per=2*radius*pi;
		return per;
	}
	public void setRadius(double radius){
		this.radius=radius;
	}
	public void show(){
		System.out.println("圆形半径是"+radius);
		System.out.println("圆形周长是"+calPer());
		System.out.println("圆周率是"+pi);
	}
	public static void display(){
		System.out.println("这是一个圆形");
		//静态方法不能访问非静态属性
		//此时radius所属的对象尚未产生
		//System.out.println("圆形半径是"+radius);
		//静态属性不依赖于对象，静态方法可以正常访问静态属性
		//类里的非静态属性也被叫做实例属性，实例(instance)就是对象(object)
		//类里的非静态方法也被叫做实例方法
		//静态方法不能访问实例属性和实力方法，只能访问静态属性和静态方法
		//静态属性和静态方法通常用于做一些所有代码公用的工具类和相应的工具方法
		System.out.println("圆周率是"+pi);
	}
}
