package Lab6;

import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class mainExecute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context1=new AnnotationConfigApplicationContext(Config.class);
		ApplicationContext context2=new AnnotationConfigApplicationContext(Config.class);

		classOne one=(classOne)context1.getBean(classOne.class);
		classTwo two=(classTwo)context2.getBean(classTwo.class);

		String name,course,college;
		int age,ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome Student");
		while(true) {
			System.out.println("\n1)Start\t\t2)Exit");
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
					one.setName(name);
					one.setAge(age);
					two.setCourse(course);
					two.setCollege(college);
					one.setC2(two);
					System.out.println(one);
				}
			else if(ch==2) {
					break;
				}
		}
		System.out.println("------------Thank You------------");
		}
	}

