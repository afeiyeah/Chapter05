package classdemo04;

public class Mother {
	public void seeFatherincome(Father f){
		//The field Father.gold is not visible
		//˽�����Բ��ܱ��ⲿ�����
		//f.gold;
		//Ĭ�����Կ��Ա�ͬһ����������������
		System.out.println(f.money);
		System.out.println(f.money2);
		//����ͬһ��������Է����ܱ���������
		System.out.println(f.chair);
	}

}
