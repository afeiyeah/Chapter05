package classdemo01;

public class TestFootBallPlayer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义一个球员对象
		FootBallPlayer Wulei=new FootBallPlayer("武磊",24,4000,'男');
		Wulei.setNum(10);
		Wulei.setSal(1000);
		//Wulei=new FootBallPlayer("武磊",10,1000,'男');

		FootBallPlayer Wangshuang=new FootBallPlayer("王霜",22, 3000,'女');
		
		Wulei.showInfo();
		Wangshuang.showInfo();
		
		
		
	
	
	
	}

}
