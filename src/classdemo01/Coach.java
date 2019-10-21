package classdemo01;

public class Coach {
	private String name;
	private String country;
	private int age;
	
	Coach(String name,String country,int age){
		this.name=name;
		this.country=country;
		this.age=age;
	}
	
	void display(){
		System.out.println("教练姓名"+name+",教练国籍是"+age);
	}
	
}
