
public class AsteriskLogger implements Logger{

	@Override
	public void log(String input) {
		System.out.println("***" + input + "***");
	}

	@Override
	public void error(String input) {
		String boxMid = "***Error: " + input + "***";
		String boxEnd = "";
		for (int i = 0; i < boxMid.length(); i++) {
			boxEnd += "*";
		}
		System.out.println(boxEnd);
		System.out.println(boxMid);
		System.out.println(boxEnd);
	}
	
}
