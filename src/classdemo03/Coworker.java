package classdemo03;
import classdemo04.Father;
public class Coworker {
	void seeFatherMoney(Father f){
		//第三方类无法直接访问另一个类的私有属性
		//如果第三方类和父亲不在一个包里，则无法访问默认属性和默认方法
		//System.out.println(f.gold);
		//System.out.println(f.money);
		//如果属性或方法使用了public，意味着所有的其他类都可以访问
		System.out.println(f.money2);
		//f.chair不在同一个包里的类，不能访问protected的类
	}

}
