
public class Problem5 {

	private static boolean isDivisibleBy2to20(long number) {
		for (int i = 2; i<=20; i++) {
			if (number % i != 0) {
				return false;
			}
		}
		return true;		
	}
	
	public static void main(String args[]) {
		for (int i=1; i<2000000000; i++) {
			if (isDivisibleBy2to20(i)) {
				System.out.println(i);
				break;
			}
		}
		
	}
	
}
