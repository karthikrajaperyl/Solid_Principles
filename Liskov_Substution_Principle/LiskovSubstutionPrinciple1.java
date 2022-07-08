package Liskov_Substution_Principle;
interface IEmployee
{
	String getName();
	int getSalary();
}
interface IEmployeeBonus
{
	int getBonus();
}
abstract class Employee implements IEmployee,IEmployeeBonus
{
	public int id;
	public String name;
	Employee(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	abstract public String getName();
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
	public String getName()
	{
		return name;
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
	public String getName()
	{
		return name;
	}
}
class Intern implements IEmployee
{
	public int id;
	public String name;
	Intern(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public int getSalary()
	{
		return 100000;
	}
}

public class LiskovSubstutionPrinciple {

	public static void main(String[] args) {
	List<IEmployee> employeeList=new ArrayList<>();
	employeeList.add(new MLS(5,"xyz"));
	employeeList.add(new MTS(6,"ABC"));
	employeeList.add(new Intern(10,"ASD"));


	}

}
