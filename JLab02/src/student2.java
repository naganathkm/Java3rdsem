import java.util.Iterator;
import java.util.List;

public class student2 {
	String name,usn,age;
	student2(String name,String usn,String age)
	{
		this.name=name;
		this.usn=usn;
		this.age=age;
	}
	public static void display(List<student2> list)
	{
		Iterator<student2> itr=list.iterator();
		while(itr.hasNext())
		{
			student2 ar=itr.next();
			System.out.println("Name:"+ar.name+"\nusn:"+ar.usn+"\nage:"+ar.age);
		}
	}
	

}