package junit.runner;

/**
 * This class defines the current version of JUnit
 */
public class Version {
	private Version() {
		// don't instantiate
	}

	public static String id() {
		return "4.13.2-SNAPSHOT";
	}
	
	public static void main(String[] args) {
		//this line should be commented out
		System.out.println(id());
	}
}
