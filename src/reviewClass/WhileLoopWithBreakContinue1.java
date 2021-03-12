package reviewClass;

public class WhileLoopWithBreakContinue1 {

	public static void main(String[] args) {

		int n = 10;

		while (n < 15) {
			if (n < 15) {
				System.out.println("Infinite");
				break;
			} else {
				System.out.println("Hi"); 
			}
			n++;
		}
	}

}
