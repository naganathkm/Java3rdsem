package crud;
import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import test.hibernatecrud.Employee;

public class Operations {

	SessionFactory sf;
	Session s;
	
		public void connect() {
			
		Configuration cfg=new Configuration();
		cfg.configure("cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
				
		s=sf.openSession();
		s.beginTransaction();	
	}
		
		public void insert() {
			connect();
			//Creating the Employee table and inserting values
			Employee emp=new Employee();
			emp.setEmpId(32);
			emp.setEmpName("Ram");
			emp.setEmpDept("TI");
			emp.setEmpSal(15000.00);
			System.out.println(emp);
			
			s.save(emp);
			s.getTransaction().commit();
			
		}
		
		public void delete() {
			connect();
			Employee emp=new Employee();
			emp.setEmpId(2);
			s.delete(emp);
			System.out.println(emp);
		
			s.getTransaction().commit();
			System.out.println("DELETED");
		}
		
		public void update() {
			
			connect();
			Employee emp=new Employee();
			emp.setEmpId(3);
			emp.setEmpName("Nikhil");
			emp.setEmpDept("sales");
			emp.setEmpSal(50000.00);
			
			s.update(emp);
			s.getTransaction().commit();
			System.out.println("UPDATED");
			
			
		}
		public void retrive() {
			connect();
			Employee emp=s.get(Employee.class, 1);
			System.out.println(emp.getEmpId());
			System.out.println(emp.getEmpName());
			System.out.println(emp.getEmpDept());
			System.out.println(emp.getEmpSal());
			
			s.getTransaction().commit();
			System.out.println("DATA RETRIEVED SUCCESFULLY");
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);

			
			
			Operations op=new Operations();
			
			while(true) {
				System.out.println("1.CREATE\n2.DELETE\n3.UPDATE\n4.DELETE\nENTER YOUR CHOICE\n");
				int ch=sc.nextInt();
				switch(ch) {
				case 1:
					op.insert();
					break;
				
				case 2:
					op.delete();
					break;
					
				case 3:
					op.update();
					break;
					
				case 4:
					op.retrive();
					break;
					
				case 5:
					break;
				
				}
			}
			
				
}
}
