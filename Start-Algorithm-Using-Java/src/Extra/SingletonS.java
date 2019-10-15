package Extra;

public class SingletonS {
	
	private String name = "thisisnew";
	
	public String getName() {
		return name;
	}

	private static SingletonS singleObj = null;
	
	private SingletonS() {}
	
	public static SingletonS getInstance() {
		if(singleObj == null) {
			singleObj = new SingletonS();
		}
		
		return singleObj;
	}
	
}
