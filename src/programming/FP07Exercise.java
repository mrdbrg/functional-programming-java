package programming;

import java.util.List;

/*
 * Square every number in a list and find the sum of squares
 */

public class FP07Exercise {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		
		int result = numbers.stream()
					.map(number -> number * number)
					.reduce(0, Integer::sum);
	
		System.out.println(result);
		
	}
}
