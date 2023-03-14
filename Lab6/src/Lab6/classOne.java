package Lab6;

import java.io.Serializable;

public class classOne implements Serializable{

	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private classTwo c2;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public classTwo getC2() {
		return c2;
	}
	
	public void setC2(classTwo c2) {
		this.c2 = c2;
	}
	
	@Override
	public String toString() {
			return "Name : \t"+name+
					"\nAge : \t"+age+
					c2;
	}
}
