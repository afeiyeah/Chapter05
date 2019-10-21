package classdemo04;

public class Father {
	//私房钱
	//私有属性或方法只能本类自己访问，其他类无法访问
	private int gold;
	//默认访问权限：工资
	//默认属性或方法只能同一个包里的类进行访问，其他包不能访问
	int money;
	//如果属性或方法使用了public权限，则所有其他类都可以访问
	public int money2;
	//受保护的属性
	protected String chair;
	
}
