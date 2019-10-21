package classdemo04;

public class Mother {
	public void seeFatherincome(Father f){
		//The field Father.gold is not visible
		//私有属性不能被外部类访问
		//f.gold;
		//默认属性可以被同一个包里的其他类访问
		System.out.println(f.money);
		System.out.println(f.money2);
		//对于同一个包里，可以访问受保护的属性
		System.out.println(f.chair);
	}

}
