
public class App {

	public static void main(String[] args) {
		
		Logger logger1 = new AsteriskLogger();
		logger1.log("This is a test");
		System.out.println();
		logger1.error("Really Really Really big Box");
		
		System.out.println();
		
		Logger logger2 = new SpacedLogger();
		logger2.log("This is a test");
		System.out.println();
		logger2.error("This is a test");
		
	}

}
