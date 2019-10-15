package Extra;

public class SingletonC {
	
	public static void main(String[] args) {
		
		SingletonS singleObj = SingletonS.getInstance();
		
		String name = singleObj.getName();
		
		System.out.println(name);
	}
	
}
