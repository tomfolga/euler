
public class Problem2 {

	public int nextFibb(int first, int second) {
		return first + second;
	}

	public long solve() {
		int fibb1 = 1;
		int fibb2 = 2;
		long sumOfFibbs = 2;
		while (true) {
			int nextFibb = nextFibb(fibb1, fibb2);
			if (nextFibb >= 4000000) {
				break;
			}
			if (nextFibb % 2 == 0 ) {
				sumOfFibbs += (long)nextFibb;
			}
			
			fibb1 = fibb2;
			fibb2 = nextFibb;
			
		}
		return sumOfFibbs;
		

	}
	
	public static void main(String[] args) {
		Problem2 problem2 = new Problem2();
		
		System.out.println(problem2.solve());
	}

}