package extrapractice;

public class EmployeeInfo {
	//���һ��Ա���࣬������Ա����š����������ű�š�ְλ�͹���������ԣ�
	//����һ���������Ա��ȫ����Ϣ�ķ���
	private int empno;
	private String ename;
	private int deptno;
	private String job;
	private double sal;
	
	EmployeeInfo(int inempno,String inename,int indeptno,String injob,double insal){
		empno=inempno;
		ename=inename;
		deptno=indeptno;
		job=injob;
		sal=insal;
	}
	int getEmpno(){
		return empno;
	}
	String getEname(){
		return ename;
	}
	int getDeptno(){
		return deptno;
	}
	String getJob(){
		return job;
	}
	double getSal(){
		return sal;
	}
	

}
