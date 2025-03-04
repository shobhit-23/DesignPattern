package SingletonPattern;

public class SimpleSingleton2 {
	
	// Private constructor to prevent instantiation
	private SimpleSingleton2() {}
	
	// Static inner class that holds the instance
	private static class Singletonhelper{
		private static final SimpleSingleton2 INSTANCE = new SimpleSingleton2();
	}
	
	// Public method to get the instance
	public static SimpleSingleton2 getInstance() {
		return Singletonhelper.INSTANCE;
	}
}
