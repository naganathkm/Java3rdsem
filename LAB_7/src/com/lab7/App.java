package com.lab7;
import java.util.*;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(); 
		context.scan("com.lab7");
		context.refresh();
		studentService stud_ser = (studentService) context.getBean("studentService");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----MENU----");
		System.out.println("1. INSERT");
		System.out.println("2. DISPLAY");
		System.out.println("3. UPDATE");
		System.out.println("4. DELETE");
		System.out.println("5. EXIT");
		
		while(true)
		{
			System.out.print("Enter your choice : ");
			int ch = sc.nextInt();
			
			if(ch==1)
			{
				
				
				System.out.print("Enter the ID : ");
				int id = sc.nextInt();
				System.out.print("Enter the Name : ");
				String name = sc.next();
				
				stud_ser.Save(id,name);
			
			}
			else if(ch==2)
			{
				
				
				List<student> allStud = stud_ser.getStudList();
				for(student s : allStud)
				{
					System.out.println("ID : " + s.getId());
					System.out.println("Name : " + s.getName());
					
				}
			}
			else if(ch==3)
			{
				
				
				System.out.print("Enter the ID : ");
				int id = sc.nextInt();
				System.out.print("Enter the Name : ");
				String name = sc.next();
				
				stud_ser.update(id,name);
			}
			else if(ch==4)
			{
			
				System.out.print("Enter the ID : ");
				int id = sc.nextInt();
				stud_ser.delete(id);
			}
			else if(ch==5)
				break;
			else
				System.out.println("Invalid Choice");
		}
	}

}
