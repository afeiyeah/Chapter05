package classdemo01;

public class TestCuboid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle2 area=new Rectangle2(4,3,'B');
		Cuboid cuboid=new Cuboid(5,area);
		cuboid.showInfo();

	}

}
