package classdemo01;
//������
//����һ�������ʣ�����ĸ��д
public class Rectangle2 {

	//����
	//����һ������private�ؼ��֣��򲻿����ٴ�������Ĵ����з��ʸ�˽������
	//˽������ֻ���ڱ����з���
	//����һ�������ʣ���������ȫ����ĸСд�������������ϣ��ڶ�����������ĸ��д
	private int length;
	//���
	private int width;
	//��ɫ
	private char color;
	
	//����������
	//(����){�߼�����}
	Rectangle2(){
		System.out.println("������һ�����ζ���");
	}
	//һ������������ж���������������������ֿ�����ͬ�����ǲ���������ͬ
	Rectangle2(int inlength, int inwidth, char incolor){
		if(inwidth>0&&inlength>0){
			length=inlength;
			width=inwidth;
			color=incolor;
			System.out.println("����ĳ��ȺͿ����ֵ�Ϸ�");
		}
		else{
			System.out.println("����ĳ��Ȼ�����ֵ���Ϸ�");
			
		}
//		System.out.println("���εĳ���Ϊ"+length);
//		System.out.println("���εĿ��Ϊ"+width);
		
	}
	//���Զ�ȡ������������һ�ַ���
	int getLength(){
		return length;
	}
	int getWidth(){
		return width;
	}
	char getColor(){
		return color;
	}
	//java��������������+���ʣ�����Сд����������ĸ��д
	//����ǵ������ʣ�����ȫ����ĸСд
	//�����ܳ��ķ���
	int calPer(){
		int per=2*(length+width);
		return per;
	}
	//��������ķ���
	int calArea(){
		int area=length*width;
		return area;
	}
	//������������������������ͬ��ʱ
	//�����ڲ���ʹ����������ԣ���ͬ����������������ε����ͬ������
	//����������������Ƿ����ڲ��ľֲ�����
	void setLength(int inLength){
		length=inLength;
	}
	//����취����ͬ������ǰ�����this�ؼ��֡��������԰�ͬ�����Ժ�����������ֿ�
	//thisָ��Rectangle2�����й����в����Ķ���z
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
		System.out.println("���εĳ�����"+getLength());
		System.out.println("���εĿ����"+getWidth());
		System.out.println("���ε���ɫ��"+getColor());
		System.out.println("���ε��ܳ���"+calPer());
		System.out.println("���ε������"+calArea());

	}
	

}
