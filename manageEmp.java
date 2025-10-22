/*
Q5. Write program to create POJO class name as Employee with id,name and salary attribute and
store data in object and retrieve data from object.
*/
import java.util.*;
public class manageEmp{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		Employee []e = new Employee[5];// array of objects
		System.out.println("Enter id, name, salary");
		for(int i=0; i<e.length; i++)
		{
			int id = sc.nextInt();
			String name = sc.next();
			int salary = sc.nextInt();
			e[i] = new Employee();//creating new object to store new values
			e[i].setId(id);
			e[i].setName(name);
			e[i].setSalary(salary);
		}
		Employee emps = new Employee(); //object of Employee class
		emps.addEmployee(e);
		emps.ShowEmployees();
	}
}
class Employee{
	private int id;
	private String name;
	private int salary;
	
	void setId(int id){
		this.id = id;
	}
	
	void setName(String name){
		this.name = name;
	}
	
	void setSalary(int salary){
		this.salary = salary;
	}
	
	int getId(){
		return id;
	}
	
	String getName(){
		return name;
	}
	int getSalary(){
		return salary;
	}
		
	Employee []employees;
	void addEmployee(Employee ...employees)
	{
		this.employees = employees;
	}
	
	void ShowEmployees()
	{
		System.out.println("id\tname\tsalary");
		for(Employee employee : employees)// Enhanced for loop
		{
			System.out.println(employee.getId()+"\t"+employee.getName()+"\t"+ employee.getSalary());
		}
	}
}