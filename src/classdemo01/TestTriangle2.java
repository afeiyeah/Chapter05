package classdemo01;

public class TestTriangle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//初始化一个三角形
		Triangle2 x= new Triangle2();
		Triangle2 y= new Triangle2(2,3,4,"白色");
		y.setSideNo1(3);
		y.setSideNo2(4);
		y.setSideNo3(5);
		
		System.out.println("三角形的三个边为"+y.getSideNo1()+", "+y.getSideNo2()+", "+y.getSideNo3());
		System.out.println("三角形的颜色为"+y.getColor());
		
	}

}
