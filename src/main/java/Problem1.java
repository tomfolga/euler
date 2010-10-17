import java.util.Set;

import com.google.common.base.Joiner;
import com.google.common.collect.Sets;

public class Problem1 {

	public Set<Integer> getMultipliersBelowLimit(int argument, int limit) {
		Set<Integer> numbers = Sets.newLinkedHashSet();
		int number = argument;
		while (number < limit) {
			numbers.add(number);
			number = number + argument;
		}
		return numbers;
	}

	public static void main(String[] args) {
		Problem1 problem1 = new Problem1();
		Set<Integer> multipliersOf3or5 = problem1.getMultipliersBelowLimit(5,
				1000);
		multipliersOf3or5.addAll(problem1.getMultipliersBelowLimit(3, 1000));
		Set<Integer> sorted = Sets.newTreeSet();
		sorted.addAll(multipliersOf3or5);
		int accumulator = 0;
		for (int value : multipliersOf3or5) {
			accumulator += value;
		}
		System.out.println(Joiner.on(",").join(sorted));
		System.out.println(accumulator);
	}

}
