package program1;
import java.util.*;
class Employee
{
    String name;
    int age;
    int phno;
    String address;
    float salary;
    void print_Salary()
    {
        System.out.print(salary);
    }
}
class Officer extends Employee
{
    String specialization;
}
class Manager extends Employee
{
    String department;
}
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Officer o=new Officer();
        Manager m=new Manager();
        System.out.print("Enter the officer's name: ");
        o.name=sc.next();
        System.out.print("Enter Address: ");
        o.address=sc.next();
        System.out.print("Enter Age: ");
        o.age=sc.nextInt();
        System.out.print("Enter Phone Number: ");
        o.phno=sc.nextInt();
        System.out.print("Enter Specialization: ");
        o.specialization=sc.next();
        System.out.print("Enter Salary: ");
        o.salary=sc.nextFloat();
        System.out.println("Enter the manager's Detail: ");
		System.out.print("Enter the manager's name: ");
		m.name=sc.next();
		System.out.print("Enter Address: ");
		m.address=sc.next();
		System.out.print("Enter Age: ");
	    m.age=sc.nextInt();
		System.out.print("Enter PhoneNumber: ");
		m.phno=sc.nextInt();
		System.out.print("Enter Department: ");
		m.department=sc.next();
		System.out.print("Enter Salary:");
		m.salary=sc.nextFloat();
		System.out.println("\nOFFICER DETAILS");
        System.out.println("Officer's name: "+o.name);
        System.out.println("Address: "+o.address);
        System.out.println("Age: "+o.age);
        System.out.println("PhoneNumber: "+o.phno);
        System.out.println("\nSpecialization: "+o.specialization);
       	System.out.print("Salary= ");
        o.print_Salary();
        System.out.println();
		System.out.println("MANAGERS DETAILS");
		System.out.println("Manager's name: "+m.name);
		System.out.println("Address: "+m.address);
		System.out.println("Age: "+m.age);
		System.out.println("Phone Number: "+m.phno);
		System.out.println("Department: "+m.department);
		System.out.print("Salary= ");
		m.print_Salary();
        
    }
}
