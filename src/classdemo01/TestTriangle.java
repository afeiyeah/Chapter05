package classdemo01;

public class TestTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//初始化一个三角形
		Triangle x= new Triangle();
		x.color="黑色";
		x.sideNo1=10;
		x.sideNo2=20;
		x.sideNo3=30;
		System.out.println("三角形的三个边分别为"+x.sideNo1+", "+x.sideNo2+", "+x.sideNo3);
		System.out.println("三角形的颜色为"+x.color);

	}

}
