package InterpreterDesignPatter;

import java.util.HashMap;
import java.util.Map;

public class Context {
	
	Map<String,Integer> contextMap= new HashMap<>();
	
	public void put(String s, int val)
	{
		contextMap.put(s, val);
	}
	public int get(String s)
	{
		return contextMap.get(s);
	}
}
