package classdemo01;

public class Cuboid {
	private int height;
	private Rectangle2 baseArea;
	
	Cuboid(int height, Rectangle2 baseArea){
		this.height=height;
		this.baseArea=baseArea;
	}
	
	int getHeight(){
		return height;
	}
	Rectangle2 getBaseArea(){
		return baseArea;
	}
	void setHeight(int height){
		this.height=height;
	}
	void setBaseArea(Rectangle2 baseArea){
		this.baseArea=baseArea;
	}
	//����Ҫ�������
	int calVolume(){
		int volume=baseArea.calArea()*height;
		return volume;
	}
	void showInfo(){
		System.out.println("������ĸ���"+height);
		baseArea.showInfo();
		System.out.println("������������"+calVolume());
	}
	

}
