package classdemo02;

public class Company {
	private String name;
	private Prog boss;
	private Prog[] emps;
	
	void setName(String name){
		this.name=name;
	}
	void setBoss(Prog boss){
		this.boss=boss;
	}
	//不需要for循环？
	void setEmps(Prog[] emps){
		this.emps=emps;
	}
	void showInfo(){
		System.out.println("公司名字"+name);
		//返回（字符串+void类型）不合法
		//System.out.println("老板的信息："+boss.introduce());
		System.out.println("老板的信息：");
		boss.introduce();
		System.out.println("显示全体雇员的信息");
		for(Prog p:emps){
			p.introduce();
		}
	}

}
