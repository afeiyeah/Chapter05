package classdemo01;

public class TestRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//类名  对象名=new 类名();
		Rectangle x=new Rectangle();
		//对象名.属性名
		System.out.println(x.color);
		System.out.println(x.length);
		System.out.println(x.width);
		//给矩形对象x的属性赋值
		x.color='红';
		x.length=100;
		x.width=30;
		//打印赋值后的属性
		System.out.println("矩形的颜色是"+x.color);
		System.out.println("矩形的长度是"+x.length);
		System.out.println("矩形的宽度是"+x.width);
		
	}

}
