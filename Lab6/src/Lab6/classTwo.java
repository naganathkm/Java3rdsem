package Lab6;

import java.io.Serializable;

public class classTwo implements Serializable{
	
	private String course,college;

	
	private static final long serialVersionUID = 1L;
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	
	@Override
	public String toString() {
			return "\nCourse : \t"+course+
					"\nCollege : \t"+college;
	}
}
