package staticdemo;

public class Circle {
	private double radius;
	public static double pi=3.14;
	
	public double calPer(){
		double per=2*radius*pi;
		return per;
	}
	public void setRadius(double radius){
		this.radius=radius;
	}
	public void show(){
		System.out.println("Բ�ΰ뾶��"+radius);
		System.out.println("Բ���ܳ���"+calPer());
		System.out.println("Բ������"+pi);
	}
	public static void display(){
		System.out.println("����һ��Բ��");
		//��̬�������ܷ��ʷǾ�̬����
		//��ʱradius�����Ķ�����δ����
		//System.out.println("Բ�ΰ뾶��"+radius);
		//��̬���Բ������ڶ��󣬾�̬���������������ʾ�̬����
		//����ķǾ�̬����Ҳ������ʵ�����ԣ�ʵ��(instance)���Ƕ���(object)
		//����ķǾ�̬����Ҳ������ʵ������
		//��̬�������ܷ���ʵ�����Ժ�ʵ��������ֻ�ܷ��ʾ�̬���Ժ;�̬����
		//��̬���Ժ;�̬����ͨ��������һЩ���д��빫�õĹ��������Ӧ�Ĺ��߷���
		System.out.println("Բ������"+pi);
	}
}
