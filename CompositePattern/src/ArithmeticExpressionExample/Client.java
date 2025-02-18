package ArithmeticExpressionExample;

public class Client {
	public static void main(String args[])
	{
		//2*(1+7)
		
		Number two= new Number(2);
		Number one= new Number(1);
		Number seven= new Number(7);
		
		ArithmeticExpression addExpression= new Expression(one, seven,Operation.ADD);
		
		ArithmeticExpression parentExpression=new Expression(two, addExpression, Operation.MULTIPLY);
		
		System.out.println(parentExpression.evaluate());
	}
}
