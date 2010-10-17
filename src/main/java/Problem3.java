public class Problem3 {
	
	public long divideOut(long number, long factor) {
		long dividedNum = number;
		while (dividedNum % factor == 0) {
			dividedNum = dividedNum / factor;
		}
		return dividedNum;
	}
	
	public long solve() {
		long number = 600851475143l;
		
		for (long i=2; i< number ; i++ ){
			number = divideOut(number, i);
				
		}
		return number;
	}
	
	public static void main(String[] args) {
		Problem3 problem3 = new Problem3();
		long largestPrimeFactor = problem3.solve();
		System.out.println(largestPrimeFactor);		
	}
	
}
