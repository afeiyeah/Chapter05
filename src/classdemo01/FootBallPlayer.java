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
	//计算球员净收入的方法
	//可以在一个方法里调用另一个方法
	double netIncome(){
		double net=sal-calTax();
		return net;
	}
	//球员根据进球数拿到的奖金
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
	
	
	//返回值是数组类型
	//返回值是对象类型
	//返回值是对象型数组
	//属性是数组类型
	//属性是对象类型
	//属性是对象数组类型
	
	//属性设置器
	//只需修改属性值，不需返回值
	void setNum(int innum){
		num=innum;
		//加不加return都可以
		//return;
	}
	void setSal(double insal){
		sal=insal;
	}
	
	//返回值是void的普通方法
	//完成信息打印输出的过程，不需要返回值
	void showInfo(){
		System.out.println("球员姓名"+getName()+", 球衣号码"+getNum()+", 收入"+getSal()+", 性别"+getGender());
		System.out.println("球员应上税"+calTax());
		System.out.println("球员净收入"+netIncome());
//		System.out.println(getName()+"的年终奖为"+calBonus(3));
//		System.out.println(getName()+"的年终奖为"+calBonus(10));
//		System.out.println(draw()?getName()+"中奖了！":getName()+"没中奖");
	}

}
