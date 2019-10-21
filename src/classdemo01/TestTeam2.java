package classdemo01;

public class TestTeam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Team team=new Team();
		Coach coach1=new Coach("lipi","Italy",70);
		Coach coach2=new Coach("peilan","France",44);
		FootBallPlayer[] player=new FootBallPlayer[2];
		player[0]= new FootBallPlayer("武磊",24,4000,'男');
		player[1]= new FootBallPlayer("王霜",22, 3000,'女');
		
		Team team=new Team("一队",coach1,player);
		
		
		team.showInfo();
		//打印出的是存储team的内存地址
		//类的对象是引用型的对象
		//System.out.println(team);

	}

}
