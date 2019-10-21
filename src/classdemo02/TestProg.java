package classdemo02;

public class TestProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] java={"JavaSE","Servlet","MySQL","MyBatis","Spring","SpringSVC"};
		String [] embed={"C语言","Linux","ARM","C++"};
		
		Prog p1=new Prog();
		p1.setName("张三");
		p1.setSkills(java);
		p1.introduce();
		System.out.println();
		System.out.println("过了几年p1跳槽转行了");
		p1.setSkills(embed);
		p1.introduce();

	}

}
