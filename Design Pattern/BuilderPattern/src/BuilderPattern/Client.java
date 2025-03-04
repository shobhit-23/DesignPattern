package BuilderPattern;


public class Client {
	
	public static void main (String args[] )
	{
		Director enginnerStudentDirector=new Director(new EngineeringStudentBuilder());
		Director mbaStudentDirector= new Director(new MBAStudentBuilder());
		
		Student engingeerStudent =enginnerStudentDirector.createStudent();
		Student mbaStudent= mbaStudentDirector.createStudent();
		
		System.out.println(engingeerStudent.toString());
		System.out.println(mbaStudent.toString());
	}
}
