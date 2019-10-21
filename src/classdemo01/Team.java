package classdemo01;

public class Team {

	private String name;
	//Coach�����͵����ԡ�����coach��洢����Coach���͵�һ������
	private Coach coach;
	//����һ�����ԣ�������Ա���͵�����
	private FootBallPlayer[] player;
	
	Team(){
		
	}
	
	Team(String name, Coach coach, FootBallPlayer[] player){
		this.name=name;
		this.coach=coach;
		this.player=player;
	}
	String getName(){
		return name;
	}
	Coach getCoach(){
		return coach;
	}
	void setName(String name){
		this.name=name;
	}
	void setCoach(Coach coach){
		this.coach=coach;
	}
	void setPlayer(FootBallPlayer[] player){
		this.player=player;
	}
	//��show�����������Ա��Ϣ��������Լ��������Ա���������
	void showInfo(){
		System.out.println("��ӵ�������"+name);
		coach.display();
		System.out.println("��Ա����Ϊ"+player.length);
		for(FootBallPlayer k:player){
			k.showInfo();
		}
	}
	
}
