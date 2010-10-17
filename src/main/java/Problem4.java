import java.util.Set;
import java.util.TreeSet;

import com.google.common.collect.Sets;

public class Problem4 {

	public static boolean is6DigitPalindrom(long number) {
		StringBuilder sb = new StringBuilder(Long.valueOf(number).toString());

		return sb.toString().equals(sb.reverse().toString());
	}

	public static void main(String[] args) {
		TreeSet<Long> palindormNumber = Sets.newTreeSet();
		for (int firstNumber = 999; firstNumber > 99; firstNumber--) {

			for (int secondNumber = 999; secondNumber > 99; secondNumber--) {
				if (is6DigitPalindrom(firstNumber * secondNumber)) {
					palindormNumber.add((long)firstNumber * secondNumber);
				}
			}
			
		}
		System.out.println(palindormNumber.descendingIterator().next());

	}

}
