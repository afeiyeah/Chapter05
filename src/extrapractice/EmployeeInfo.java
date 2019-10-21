package extrapractice;

public class EmployeeInfo {
	//设计一个员工类，该类有员工编号、姓名、部门编号、职位和工资五个属性，
	//并有一个可以输出员工全部信息的方法
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
