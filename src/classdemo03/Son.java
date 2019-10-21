package classdemo03;

import classdemo04.Father;

public class Son extends Father {
	public void seeFather(Father f){
		//System.out.print(f.chair);
		//受保护的属性被子类所继承，子类对象可以直接访问
		System.out.print(this.chair);
		
	}

}
