
import java.util.*;


public class main1 {

	public static void main(String[] args) {
		String name,usn,age;
		List<student1> list1=new ArrayList<student1>();


		Scanner sc=new Scanner(System.in);
		System.out.println("1:add student details\n 2:Update details\n 3:reemove element\n 4:size of list\n 5:display\n 6:clear all elements\n");
		while(true)
		{
			System.out.println("enter your choice:");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("enter num of students to be added");
				int n=sc.nextInt();
				for(int i=0;i<n;i++)
				{
					System.out.println("Enter name");
					name=sc.next();
					System.out.println("enter usn");
					usn=sc.next();
					System.out.println("enter age");
					age=sc.next();
					student1 s1= new student1(name,usn,age);

					list1.add(s1);
				}
				break;
			case 2:
				System.out.println("enter index to be updated");
				int i=sc.nextInt();
				System.out.println("enter name");
				name=sc.next();
				System.out.println("enter usn");
				usn=sc.next();
				System.out.println("enter age");
				age=sc.next();
				student1 s2=new student1(name,usn,age);
				list1.set(i, s2);
				break;
			case 3:
				System.out.println("enter index");
				int m=sc.nextInt();
				list1.remove(m);
				break;
			case 4:
				int size=list1.size();
				System.out.println("size of list"+size);

				break;
			case 5:
				student1.display(list1);
				break;
			case 6:
				list1.clear();
				break;





			}
		}
	}

}