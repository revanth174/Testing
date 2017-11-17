import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO,generator = "stu_id")
	@SequenceGenerator(name="stu_id",initialValue=123)
	int studentid;
	String name;
	int marks;
	int age;
	 @Temporal(TemporalType.DATE)
	 Date date;
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	public int getStudentid() {
		return studentid;
	}
	
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [s_id=" + studentid + ", name=" + name + ", marks=" + marks + "]";
	}

}
