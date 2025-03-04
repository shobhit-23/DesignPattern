package SingletonPattern;

public class StaticBlockSingleton {
	
	private static StaticBlockSingleton instance;
	
	private StaticBlockSingleton() {}
	
	static { // will be executed only single when the class will be loaded by java class loader
		try {
			instance= new StaticBlockSingleton();
		} catch (Exception e) {
			throw new RuntimeException("Exception occured in creating singleton instance");
		}
	}
	
	public static StaticBlockSingleton getInstance() {
		return instance;
	}
}
