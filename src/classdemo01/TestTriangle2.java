package classdemo01;

public class TestTriangle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ʼ��һ��������
		Triangle2 x= new Triangle2();
		Triangle2 y= new Triangle2(2,3,4,"��ɫ");
		y.setSideNo1(3);
		y.setSideNo2(4);
		y.setSideNo3(5);
		
		System.out.println("�����ε�������Ϊ"+y.getSideNo1()+", "+y.getSideNo2()+", "+y.getSideNo3());
		System.out.println("�����ε���ɫΪ"+y.getColor());
		
	}

}
