package InterpreterDesignPatter;

import java.util.spi.AbstractResourceBundleProvider;

public class Client {
	public static void main(String[] args)
	{
		//Initialize the context
		Context context= new Context();
		context.put("a", 2);
		context.put("b", 3);
		context.put("c", 4);
		context.put("d", 5);

		//(a*b)+(c*d)
		
		AbstractExpression expression= new BinaryNonTerminalExpression(
				new BinaryNonTerminalExpression(
						new NumberTerminalExpression("a"),
						new NumberTerminalExpression("b"), '*'),
				new BinaryNonTerminalExpression(
						new NumberTerminalExpression("c"),
						new NumberTerminalExpression("d"), '*'),
				'+');
		
		System.out.println(expression.interpret(context));
	}
}
