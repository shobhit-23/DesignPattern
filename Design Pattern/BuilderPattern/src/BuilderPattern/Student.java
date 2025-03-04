package BuilderPattern;

import java.util.List;

// Here you can see that we will have to create 2^6 constructors 
//we want to create different type of constructors that why Builder pattern comes into the picture


public class Student {
	int rollNumber; //mendatory
	int age;	//optional
	String name;	//mendatory
	String fatherName; //optional
	String motherName;  //optional
	List<String> subject;  //optional
	
	public Student(StudentBuilder builder)
	{
		this.rollNumber=builder.rollNumber;
		this.age=builder.age;
		this.name=builder.name;
		this.fatherName=builder.fatherName;
		this.motherName=builder.motherName;
		this.subject=builder.subject;
	}

	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", age=" + age + ", name=" + name + ", fatherName=" + fatherName
				+ ", motherName=" + motherName + ", subject=" + subject + "]";
	}
	
}
