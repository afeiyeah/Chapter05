package classdemo01;

public class Team {

	private String name;
	//Coach类类型的属性。将来coach里存储的是Coach类型的一个对象
	private Coach coach;
	//增加一个属性：体现球员类型的数组
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
	//在show方法里，增加球员信息的输出，以及球队中球员人数的输出
	void showInfo(){
		System.out.println("球队的名字是"+name);
		coach.display();
		System.out.println("球员总数为"+player.length);
		for(FootBallPlayer k:player){
			k.showInfo();
		}
	}
	
}
