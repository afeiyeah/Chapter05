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
	//����Ҫforѭ����
	void setEmps(Prog[] emps){
		this.emps=emps;
	}
	void showInfo(){
		System.out.println("��˾����"+name);
		//���أ��ַ���+void���ͣ����Ϸ�
		//System.out.println("�ϰ����Ϣ��"+boss.introduce());
		System.out.println("�ϰ����Ϣ��");
		boss.introduce();
		System.out.println("��ʾȫ���Ա����Ϣ");
		for(Prog p:emps){
			p.introduce();
		}
	}

}
