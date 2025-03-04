package BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class MBAStudentBuilder extends StudentBuilder{
	@Override
	public StudentBuilder setSubject() {
		List<String> subject = new ArrayList<>();
		subject.add("Micro Economics");
		subject.add("Biology");
		subject.add("Chemistry");
		
		this.subject=subject;
		return this;
	}
}
