package Liskov_Substution_Principle;

abstract class Employee
{
	public int id;
	public String name;
	Employee(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	abstract int getSalary();
	abstract int getBonus();
}
class MLS extends Employee
{
	MLS(int id,String name)
	{
		super(id,name);
	}
	public int getSalary()
	{
		return 200000;
	}
	public int getBonus()
	{
		return 50000;
	}
}
class MTS extends Employee
{
	MTS(int id,String name)
	{
		super(id,name);
	}
	public int getSalary()
	{
		return 100000;
	}
	public int getBonus()
	{
		return 10000;
	}
}
class Intern extends Employee
{
	Intern(int id,String name)
	{
		super(id,name);
	}
	public int getSalary()
	{
		return 15000;
	}
	public int getBonus()
	{
		return 0;
	}
}
public class LiskovSubstitionPrinciple {

	public static void main(String[] args) {
		Employee emp1=new MLS(1,"XYZ");
		Employee emp2=new MTS(2,"ABC");
		Employee emp3=new Intern(3,"YYYY");
		int salaryMLS=emp1.getSalary()+emp1.getBonus();
		int salaryMTS=emp2.getSalary()+emp2.getBonus();
		int salaryINTERN=emp3.getSalary()+emp3.getBonus();
		System.out.println("EMP NAME-"+emp1.name+"SALARY "+salaryMLS);
		System.out.println("EMP NAME-"+emp2.name+"SALARY "+salaryMTS);
		System.out.println("EMP NAME-"+emp3.name+"SALARY "+salaryINTERN);
	}

}
