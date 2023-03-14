import java.util.*;


public class student1 {
	String name,usn,age;
	student1(String name,String usn,String age)
	{
		this.name=name;
		this.usn=usn;
		this.age=age;
	}
	public static void display(List<student1> list)
	{
		Iterator<student1> itr=list.iterator();
		while(itr.hasNext())
		{
			student1 ar=itr.next();
			System.out.println("Name:"+ar.name+"\nusn:"+ar.usn+"\nage:"+ar.age);
		}
	}
	

}