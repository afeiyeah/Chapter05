package classdemo01;

public class TestTeam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Team team=new Team();
		Coach coach1=new Coach("lipi","Italy",70);
		Coach coach2=new Coach("peilan","France",44);
		FootBallPlayer[] player=new FootBallPlayer[2];
		player[0]= new FootBallPlayer("����",24,4000,'��');
		player[1]= new FootBallPlayer("��˪",22, 3000,'Ů');
		
		Team team=new Team("һ��",coach1,player);
		
		
		team.showInfo();
		//��ӡ�����Ǵ洢team���ڴ��ַ
		//��Ķ����������͵Ķ���
		//System.out.println(team);

	}

}
