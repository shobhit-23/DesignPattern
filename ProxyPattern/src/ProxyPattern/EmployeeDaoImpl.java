package ProxyPattern;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public void create(String client, Employee obj) throws Exception {
		
		//create a new Row
		System.out.println("Created a new row in ");
	}

	@Override
	public void delete(String client, int employeeId) throws Exception {
		
		//delete a row
		System.out.println("Deleted row with employeeId: "+employeeId);
	}

	@Override
	public Employee get(String client, int employeeId) throws Exception {
		//fetch row
		System.out.println("fetching data from the DB");
		return new Employee();
	}

}
