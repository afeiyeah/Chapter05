package classdemo01;

public class TestRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����  ������=new ����();
		Rectangle x=new Rectangle();
		//������.������
		System.out.println(x.color);
		System.out.println(x.length);
		System.out.println(x.width);
		//�����ζ���x�����Ը�ֵ
		x.color='��';
		x.length=100;
		x.width=30;
		//��ӡ��ֵ�������
		System.out.println("���ε���ɫ��"+x.color);
		System.out.println("���εĳ�����"+x.length);
		System.out.println("���εĿ����"+x.width);
		
	}

}
