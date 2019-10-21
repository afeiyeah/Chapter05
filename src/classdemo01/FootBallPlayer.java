package classdemo01;
import com.data.DataTool;
public class FootBallPlayer {
	private String name;
	private int num;
	private double sal;
	private char gender;
	
	FootBallPlayer(){
		
	}
	FootBallPlayer(String inname, int innum, double insal, char ingender){
		name=inname;
		num=innum;
		sal=insal;
		gender=ingender;
	}
	
	String getName(){
		return name;
	}
	int getNum(){
		return num;
	}
	double getSal(){
		return sal;
	}
	char getGender(){
		return gender;
	}
	
	double calTax(){
		double tax;
		if(sal<2000){
			tax=0;
		}
		else if(sal<3000){
			tax=sal*0.01;
		}
		else if(sal<4000){
			tax=sal*0.02;
		}
		else if(sal<5000){
			tax=sal*0.04;
		}
		else{
			tax=sal*0.1;
		}
		return tax;
	}
	//������Ա������ķ���
	//������һ�������������һ������
	double netIncome(){
		double net=sal-calTax();
		return net;
	}
	//��Ա���ݽ������õ��Ľ���
	double calBonus(int goal){
		double bonus;
		if(goal>0){
			switch(goal){
			case 10: 
				bonus=sal*0.2;
				break;
			case 9:
				bonus=sal*0.15;
				break;
			case 8:
			case 7:
			case 6:
			case 5:
				bonus=sal*0.1;
				break;
			case 4:
			case 3:
			case 2:
			case 1:
				bonus=sal*0.05;
				break;
			default:
				bonus=sal*0.3;
				break;
				
			}
		}
		else{
			bonus=0;
		}
		
		return bonus;
	}
	boolean draw(){
		boolean flag=false;
		int rnd=DataTool.inputRnd();
		int input=0;
		int sum=0;
		while(input<3){
			int accept=DataTool.inputInt();
			sum+=accept;
			input++;
		}
		if(rnd==sum){
			flag=true;
		}
		return flag;
		
	}
	
	
	//����ֵ����������
	//����ֵ�Ƕ�������
	//����ֵ�Ƕ���������
	//��������������
	//�����Ƕ�������
	//�����Ƕ�����������
	
	//����������
	//ֻ���޸�����ֵ�����践��ֵ
	void setNum(int innum){
		num=innum;
		//�Ӳ���return������
		//return;
	}
	void setSal(double insal){
		sal=insal;
	}
	
	//����ֵ��void����ͨ����
	//�����Ϣ��ӡ����Ĺ��̣�����Ҫ����ֵ
	void showInfo(){
		System.out.println("��Ա����"+getName()+", ���º���"+getNum()+", ����"+getSal()+", �Ա�"+getGender());
		System.out.println("��ԱӦ��˰"+calTax());
		System.out.println("��Ա������"+netIncome());
//		System.out.println(getName()+"�����ս�Ϊ"+calBonus(3));
//		System.out.println(getName()+"�����ս�Ϊ"+calBonus(10));
//		System.out.println(draw()?getName()+"�н��ˣ�":getName()+"û�н�");
	}

}
