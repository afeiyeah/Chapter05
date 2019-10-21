package classdemo01;

public class Triangle2 {
	//三角形的三个边
	//封装
	private int sideNo1;
	private int sideNo2;
	private int sideNo3;
	
	//三角形的颜色
	private String color;
	
	//类里面有参数构造器和无参数构造器并存现象称为构造器重载现象
	//重载：构造器名称都一样，但是各个构造器的输入参数和输入类型不一样
	
	//如果一个类里面只有一个无参构造器，不存在有参数构造器，无参数构造器默认情况下可以不显示声明
	//创建一个无输入参数的构造器
	Triangle2(){
		System.out.println("现在进行三角形测试");
	}
	//如果类里没有显式地声明无参数构造器，直接声明了有参数构造器，则类默认构造器变成了有参数构造器
	//创建一个有四个参数的构造器
	Triangle2(int insideNo1, int insideNo2, int insideNo3, String incolor){
		boolean f1=insideNo1>0 && insideNo2>0 &&insideNo3>0;

		boolean f2=insideNo1<insideNo2+insideNo3 && insideNo2<insideNo1+insideNo2 && insideNo3<insideNo1+insideNo2;

		if(f1&&f2){
			sideNo1=insideNo1;
			sideNo2=insideNo2;
			sideNo3=insideNo3;
			color=incolor;
			
		}
		else{
			System.out.println("无法创建三角形，输入值不合法");
		}
		
//		if(a){
////			System.out.println("三角形的三个边为"+sideNo1+", "+"sideNo2"+", "+"sideNo3");
////			System.out.println("三角形的颜色为"+color);
//			System.out.println("输入值合法");
//		}
		
	}
	//属性读取器
	int getSideNo1(){
		return sideNo1;
	}
	int getSideNo2(){
		return sideNo2;
	}
	int getSideNo3(){
		return sideNo3;
	}
	String getColor(){
		return color;
	}
	
	void setSideNo1(int inSideNo1){
		sideNo1= inSideNo1;
	}
	void setSideNo2(int inSideNo2){
		sideNo2= inSideNo2;
	}
	void setSideNo3(int inSideNo3){
		sideNo3= inSideNo3;
	}
	void setColor(String inColor){
		color= inColor;
	}
	
}

	
