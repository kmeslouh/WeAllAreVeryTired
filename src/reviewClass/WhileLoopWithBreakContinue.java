package reviewClass;

public class WhileLoopWithBreakContinue {

	public static void main(String[] args) {

		int i = 10;

		while (i < 15) {
			if (i < 15) {
				System.out.println("Infinite");
				continue;
			} else {
				System.out.println("Hi"); // nothing
			}
			i++;
		}
	}
}
