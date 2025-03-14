package BuilderPattern;

public class Director {
	StudentBuilder studentBuilder;
	
	public Director(StudentBuilder studentBuilder) {
		this.studentBuilder=studentBuilder;
	}
	
	public Student createStudent() {
		if(studentBuilder instanceof EngineeringStudentBuilder)
			return createEngineeringStudent();
		else if(studentBuilder instanceof MBAStudentBuilder)
			return createMBAStudent();
		else 
			return null;
	}
	
	private Student createEngineeringStudent() {
		return studentBuilder
				.setRollNumber(1)
				.setAge(22)
				.setName("A")
				.setFatherName("X")
				.setSubject()
				.build();
	}
	
	private Student createMBAStudent() {
		return studentBuilder
				.setRollNumber(2)
				.setAge(23)
				.setName("B")
				.setMotherName("Y")
				.setSubject()
				.build();
	}
}
