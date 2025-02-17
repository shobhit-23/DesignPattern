package SingletonPattern;

public class SImpleSigleton {
	
	//The single instance, created immediately
	private static final SImpleSigleton instance = new SImpleSigleton();
	
	// Private constructor to prevent instantiation
	private SImpleSigleton() {}
	
	// Public method to get the instance
	public static SImpleSigleton getInstance() {
		return instance;
	}
}	
