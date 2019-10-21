package classdemo01;

public class TestRec2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//类名  对象名=new 该类的构造器();
		//调用构造器
		Rectangle2 x=new Rectangle2();
		//The field Rectangle2.length is not visible
		//属性一旦加上private关键字，则不可以再从其他类的代码中访问该私有属性
		//私有属性只能在本类中访问
		//x.length=100;
		Rectangle2 y=new Rectangle2(-1,2,'B');
		Rectangle2 z=new Rectangle2(1,2,'B');
		
		z.setLength(3);
		z.setWidth(4);
		z.setColor('R');
		
		z.showInfo();
		
	}

}
