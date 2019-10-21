package classdemo01;
//矩形类
//类名一般用名词，首字母大写
public class Rectangle2 {

	//长度
	//属性一旦加上private关键字，则不可以再从其他类的代码中访问该私有属性
	//私有属性只能在本类中访问
	//属性一般用名词，单个名词全部字母小写。如果是名词组合，第二个名词首字母大写
	private int length;
	//宽度
	private int width;
	//颜色
	private char color;
	
	//声明构造器
	//(条件){逻辑过程}
	Rectangle2(){
		System.out.println("创造了一个矩形对象");
	}
	//一个类里面可以有多个构造器，构造器的名字可以相同，但是参数不能相同
	Rectangle2(int inlength, int inwidth, char incolor){
		if(inwidth>0&&inlength>0){
			length=inlength;
			width=inwidth;
			color=incolor;
			System.out.println("输入的长度和宽度数值合法");
		}
		else{
			System.out.println("输入的长度或宽度数值不合法");
			
		}
//		System.out.println("矩形的长度为"+length);
//		System.out.println("矩形的宽度为"+width);
		
	}
	//属性读取器：本质上是一种方法
	int getLength(){
		return length;
	}
	int getWidth(){
		return width;
	}
	char getColor(){
		return color;
	}
	//java方法命名：动词+名词，动词小写，名词首字母大写
	//如果是单个动词，动词全部字母小写
	//计算周长的方法
	int calPer(){
		int per=2*(length+width);
		return per;
	}
	//计算面积的方法
	int calArea(){
		int area=length*width;
		return area;
	}
	//当方法的输入参数和类的属性同名时
	//方法内部如使用了类的属性，则同名的输入参数会隐蔽掉泪的同名属性
	//方法的输入参数就是方法内部的局部变量
	void setLength(int inLength){
		length=inLength;
	}
	//解决办法：在同名属性前面加上this关键字。这样可以把同名属性和输入参数区分开
	//this指类Rectangle2在运行过程中产生的对象z
	void setLength2(int length){
		this.length=length;
	}
	void setWidth(int width){
		this.width=width;
	}
	void setColor(char color){
		this.color=color;
	}
	
	void showInfo(){
		System.out.println("矩形的长度是"+getLength());
		System.out.println("矩形的宽度是"+getWidth());
		System.out.println("矩形的颜色是"+getColor());
		System.out.println("矩形的周长是"+calPer());
		System.out.println("矩形的面积是"+calArea());

	}
	

}
