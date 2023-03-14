package Lab5;

import java.io.Serializable;

public class student implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private college c2;

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

	public college getC2() {
		return c2;
	}

	public void setC2(college c2) {
		this.c2 = c2;
	}

	@Override
	public String toString() {
		return "Name:\t" + name + "\nAge:\t" + age + c2;
	}
}
