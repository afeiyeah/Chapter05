package staticdemo;

public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1=new Circle();
		c1.setRadius(2);
		c1.show();
		//�ı�Բ���ʵ�����
		Circle.pi=3.1415926;
		c1.show();
		//�����ڶ���Բ�Ķ���
		Circle c2=new Circle();
		c2.setRadius(4);
		c2.show();
		Circle.display();

	}

}
