package ProxyPattern;

public class Client {
	public static void main(String[] args)
	{
		try {
			EmployeeDao  employeeObj= new EmployeeDaoProxy();
			employeeObj.create("USER", new Employee());
			System.out.println("Operation Successful");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
