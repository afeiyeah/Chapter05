package classdemo01;

public class TestRec2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����  ������=new ����Ĺ�����();
		//���ù�����
		Rectangle2 x=new Rectangle2();
		//The field Rectangle2.length is not visible
		//����һ������private�ؼ��֣��򲻿����ٴ�������Ĵ����з��ʸ�˽������
		//˽������ֻ���ڱ����з���
		//x.length=100;
		Rectangle2 y=new Rectangle2(-1,2,'B');
		Rectangle2 z=new Rectangle2(1,2,'B');
		
		z.setLength(3);
		z.setWidth(4);
		z.setColor('R');
		
		z.showInfo();
		
	}

}
