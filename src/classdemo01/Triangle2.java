package classdemo01;

public class Triangle2 {
	//�����ε�������
	//��װ
	private int sideNo1;
	private int sideNo2;
	private int sideNo3;
	
	//�����ε���ɫ
	private String color;
	
	//�������в������������޲������������������Ϊ��������������
	//���أ����������ƶ�һ�������Ǹ���������������������������Ͳ�һ��
	
	//���һ��������ֻ��һ���޲ι��������������в������������޲���������Ĭ������¿��Բ���ʾ����
	//����һ������������Ĺ�����
	Triangle2(){
		System.out.println("���ڽ��������β���");
	}
	//�������û����ʽ�������޲�����������ֱ���������в���������������Ĭ�Ϲ�����������в���������
	//����һ�����ĸ������Ĺ�����
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
			System.out.println("�޷����������Σ�����ֵ���Ϸ�");
		}
		
//		if(a){
////			System.out.println("�����ε�������Ϊ"+sideNo1+", "+"sideNo2"+", "+"sideNo3");
////			System.out.println("�����ε���ɫΪ"+color);
//			System.out.println("����ֵ�Ϸ�");
//		}
		
	}
	//���Զ�ȡ��
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

	
