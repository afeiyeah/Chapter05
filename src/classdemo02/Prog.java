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
		System.out.println("我的名字是"+name);
		System.out.println("我会的开发技能有");
		for(String x:skills){
			System.out.print(x+" ");
		}
		System.out.println();
	}

}
