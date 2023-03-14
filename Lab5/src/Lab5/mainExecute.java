package Lab5;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainExecute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context1= new ClassPathXmlApplicationContext("bean.xml");
		ApplicationContext context2= new ClassPathXmlApplicationContext("bean.xml");

		student s1=(student)context1.getBean("stud");
		college c1=(college)context2.getBean("clg");

		String name,course,college;
		int age,ch;
		Scanner sc=new Scanner(System.in).useDelimiter("\n");
		System.out.println("---------------------Welcome Student------------------------------");
		
		while(true) {
			System.out.println("\n0.Exit \n1.Add \n2.display");
			ch=sc.nextInt();
			if(ch==1) {
					System.out.println("Enter Name :");
					name=sc.next();
					System.out.println("Enter Age :");
					age=sc.nextInt();
					System.out.println("Enter Course :");
					course=sc.next();
					System.out.println("Enter College :");
					college=sc.next();
					s1.setName(name);
					s1.setAge(age);
					c1.setCourse(course);
					c1.setCollege(college);
					s1.setC2(c1);
//					System.out.println(s1);
				}
			else if(ch==2) {
				System.out.println(s1);
			}
			else if(ch==0) {
					break;
				}
		}
		}
	}

