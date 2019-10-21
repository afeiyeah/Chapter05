package classdemo02;

public class TestCompany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//声明公司，老板和雇员对象
		Company c=new Company();
		Prog gates=new Prog();
		Prog p1= new Prog();
		Prog p2=new Prog();
		Prog p3= new Prog();
		//雇员组成的数组
		Prog[] emps={p1,p2,p3};
		
		String[] skills={"Basic","Dos","C++"};
		String[] csharp={".Net","ADO","winform"};
		String[] js={"jquery","VUE"};
		String[] cplus={"c++","c","Linux"};
		
		
		p1.setName("张三");
		p1.setSkills(csharp);
		
		p2.setName("李四");
		p2.setSkills(js);
		
		p3.setName("王五");
		p3.setSkills(skills);
		
		
		gates.setName("盖茨");
		gates.setSkills(skills);
		
		//把老板对象、雇员数组作为参数传递给公司对象
		c.setBoss(gates);
		c.setEmps(emps);
		c.setName("微软");
		//显示公司信息
		c.showInfo();
		
 
	}

}
