package lab3;

import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class Mainclass {
	
	employee e1 = new employee();
	
	
	
	public void insert(String empid,String name, int age, int salary)
	{
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		e1.setEmpid(empid);
		e1.setName(name);
		e1.setAge(age);
		e1.setSalary(salary);
		session.save(e1);
		t.commit();
		System.out.println("Data Inserted Successfully");
	}
	
	public void update(String empid, String name,  int age, int salary)
	{
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		e1.setEmpid(empid);
		e1.setName(name);
		e1.setAge(age);
		e1.setSalary(salary);
		session.saveOrUpdate(e1);
		t.commit();
		System.out.println("Data Updated Successfully");
	}
	
	public void delete(String empid)
	{
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		e1.setEmpid(empid);
		session.delete(e1);
		t.commit();
		System.out.println("Data Deleted Successfully");
	}
	
	public void display()
	{
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		Query q = session.createQuery("from employee");
		List l = q.getResultList();
		Iterator i = l.iterator();
		while(i.hasNext())
		{
		employee e1 = (employee) i.next();
		System.out.println("\nEmpid: "+e1.getEmpid()+
							"\nName :"+e1.getName()+
							"\nAge: "+e1.getAge()+
							"\nSalary: "+e1.getSalary());
		}
		
	}
	
	public static void main(String[] args) {
		
		String empid,name;
		int age,salary;
		
		Mainclass m = new Mainclass();
		
		while(true)
		{
			Scanner s = new Scanner(System.in);
			System.out.println("\n 0. Exit \n 1. Insert \n 2. Update \n 3. Delete \n 4. Display \n\n Enter Your Choice");
			int ch = s.nextInt();
			if(ch==0)
				System.exit(0);
			
			else if(ch==1)
			{
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter Empid");
				empid = sc.nextLine();
				System.out.println("Enter Name");
				name = sc.nextLine();
				System.out.println("Enter Age");
				age = sc.nextInt();
				System.out.println("Enter Salary");
				salary = sc.nextInt();
				m.insert(empid, name, age, salary);
			}
			
			else if(ch==2)
			{
				Scanner scs = new Scanner(System.in);
				System.out.println("Enter Empid");
				empid = scs.nextLine();
				System.out.println("Enter Name");
				name = scs.nextLine();
				System.out.println("Enter Age");
				age = scs.nextInt();
				System.out.println("Enter Salary");
				salary = scs.nextInt();
				m.update(empid, name, age, salary);
			}
			
			else if(ch==3)
			{
				Scanner scc = new Scanner(System.in);
				System.out.println("Enter Empid");
				empid = scc.nextLine();
				m.delete(empid);
			}
			
			else if(ch==4)
				m.display();
			
			else
				System.out.println("Invalid Choice");

		}
		
		
	}

}
