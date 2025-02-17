package BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class EngineeringStudentBuilder extends StudentBuilder{
	
	@Override
	public StudentBuilder setSubject() {
		List<String> subject = new ArrayList<>();
		subject.add("DSA");
		subject.add("OS");
		subject.add("Computer Network");
		
		this.subject=subject;
		return this;
	}
}
