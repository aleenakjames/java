package program1;
import java.util.*;
class employee
{
	String name;
	int age,mob;
	String address;
	float Salary;
void Print_Salary()

{
System.out.print(Salary);
}
class officer extends employee
{
	String specilization;
}
class manager extends employee
{
	String department;
}
	public class swapnumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		officer o = new officer();
		manager m = new manager();
		System.out.println("Enter the officer name:/n");
		o.name=sc.next();
		System.out.println("Enter Address:/n");
		o.address=sc.next();
		System.out.println("Enter Age:/n");
		o.age=sc.nextInt();
		System.out.println("Enter Speciliztion:/n");
		o.specilization=sc.next();
		System.out.println("Enter Mobile number:/n");
		o.mob=sc.nextInt();
		System.out.println("Enter Salary:/n");
		o.Salary=sc.nextFloat();
		System.out.println("Enter the Manager details:/n");
		System.out.println("Enter the Manager name:/n");
		m.name=sc.next();
		System.out.println("Enter Address:/n");
		m.address=sc.next();
		System.out.println("Enter Age:/n");
		m.age=sc.nextInt();
		System.out.println("Enter Department:/n");
		m.department=sc.next();
		System.out.println("Enter Mobile number:/n");
		m.mob=sc.nextInt();
		System.out.println("Enter Salary:/n");
		m.Salary=sc.nextFloat();
	System.out.println("\nOFFICER DETAILS:");
	System.out.println("\nAddress:" +o.address);
	System.out.println("\nage:" +o.age);
	System.out.println("\nMobile number:" +o.mob);
	System.out.println("\nSpecilization:" +o.specilization);
	System.out.println("\nSalary:" +o.Salary);
	o.Print_Salary();
	System.out.println("\n");
	System.out.println("\nMANAGER DETAILS");
			System.out.println("\nAddress:" +m.address);
			System.out.println("\nage:" +m.age);
			System.out.println("\nMobile number:" +m.mob);
			System.out.println("\nDepartment:" +m.department);
			System.out.println("\nSalary:" +m.Salary);
			o.Print_Salary();
			System.out.println("\n");
	}
	}
}
