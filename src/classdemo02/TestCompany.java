package classdemo02;

public class TestCompany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������˾���ϰ�͹�Ա����
		Company c=new Company();
		Prog gates=new Prog();
		Prog p1= new Prog();
		Prog p2=new Prog();
		Prog p3= new Prog();
		//��Ա��ɵ�����
		Prog[] emps={p1,p2,p3};
		
		String[] skills={"Basic","Dos","C++"};
		String[] csharp={".Net","ADO","winform"};
		String[] js={"jquery","VUE"};
		String[] cplus={"c++","c","Linux"};
		
		
		p1.setName("����");
		p1.setSkills(csharp);
		
		p2.setName("����");
		p2.setSkills(js);
		
		p3.setName("����");
		p3.setSkills(skills);
		
		
		gates.setName("�Ǵ�");
		gates.setSkills(skills);
		
		//���ϰ���󡢹�Ա������Ϊ�������ݸ���˾����
		c.setBoss(gates);
		c.setEmps(emps);
		c.setName("΢��");
		//��ʾ��˾��Ϣ
		c.showInfo();
		
 
	}

}
