/*
Q5. Write program to create POJO class name as Employee with id,name and salary attribute and
store data in object and retrieve data from object
*/
import java.util.*;
public class Empmanage{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		System.out.println("Enter employee id, name, and salary");
		int id = sc.nextInt();
		String name =sc.next();
		int salary = sc.nextInt();
		
		emp.setId(id);
		emp.setName(name);
		emp.setSalary(salary);
		emp.addEmployee(emp);
		emp.showEmployee(); 
	}
}

class Employee{
	private int id;
	private String name;
	private int salary;
	
	public void setId(int id){
		this.id = id;
	}
	public int getId()
	{
		return id;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	
	public void setSalary(int salary){
		this.salary = salary;
	}
	public int getSalary(){
		return salary;
	}
	
	Employee e;
	void addEmployee(Employee e){
		this.e = e;
	}
	void showEmployee(){
		System.out.println("id\tname\tsalary");
		System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSalary());
	}
	
}	