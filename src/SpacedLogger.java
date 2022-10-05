
public class SpacedLogger implements Logger{

	@Override
	public void log(String input) {
		for (int i = 0; i < input.length(); i++) {
			if (i != input.length() - 1) {
				System.out.print(input.charAt(i) + " ");
			} else {
				System.out.println(input.charAt(i));
			}
			
		}
	}

	@Override
	public void error(String input) {
		System.out.print("ERROR: ");
		for (int i = 0; i < input.length(); i++) {
			if (i != input.length() - 1) {
				System.out.print(input.charAt(i) + " ");
			} else {
				System.out.println(input.charAt(i));
			}
			
		}
	}
	
}
