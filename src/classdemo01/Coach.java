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
		System.out.println("��������"+name+",����������"+age);
	}
	
}
