package SingletonPattern;

public class DoubleCheckedSingleton {
	// The single instance, initially null, marked as volatile
	//The volatile keyword in Java is used to ensure visibility and ordering of changes to variables across threa
    private static volatile DoubleCheckedSingleton instance;
    
    private DoubleCheckedSingleton() {}
    
    public static DoubleCheckedSingleton getInstance() {
    	
    	// first check (not synchronized)
    	if(instance==null)
    	{
    		// syncronized on the class object
    		synchronized (DoubleCheckedSingleton.class) {
    			// second check (syncronized)
				if(instance==null)
				{
					instance=new DoubleCheckedSingleton();
				}
			}
    	}
    	return instance;
    }
}
