package classdemo02;

public class TestProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] java={"JavaSE","Servlet","MySQL","MyBatis","Spring","SpringSVC"};
		String [] embed={"C����","Linux","ARM","C++"};
		
		Prog p1=new Prog();
		p1.setName("����");
		p1.setSkills(java);
		p1.introduce();
		System.out.println();
		System.out.println("���˼���p1����ת����");
		p1.setSkills(embed);
		p1.introduce();

	}

}
