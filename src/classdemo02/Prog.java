package classdemo02;

public class Prog {

	private String name;
	private String [] skills;
	
	void setName(String name){
		this.name=name;
	}
	
	void setSkills(String [] skills){
		this.skills=skills;
	}
	
	void introduce(){
		System.out.println("�ҵ�������"+name);
		System.out.println("�һ�Ŀ���������");
		for(String x:skills){
			System.out.print(x+" ");
		}
		System.out.println();
	}

}
