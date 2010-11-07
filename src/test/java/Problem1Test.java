import java.util.Set;

import org.junit.Test;

import com.google.common.collect.Sets;

import static org.junit.Assert.*;

public class Problem1Test {

	@Test
	public void getMultipliersBelowLimitIsCOrrent() {
		Problem1 problem1 = new Problem1();
		Set<Integer> multipliers = problem1.getMultipliersBelowLimit(3, 10);
		assertEquals(Sets.newHashSet(3, 6, 9), multipliers);

	}

}
