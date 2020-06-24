import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*package whatever //do not write package name here */

class Test {

	public static void main(String[] args) {

	
		
		List<String> numbers = Arrays.asList("1", "34", "3", "98", "9", "76","45","4" );

		// sort using a custom function object
		Collections.sort(numbers, (a, b) -> (b + a).compareTo(a + b));

		// print the sorted sequence
		numbers.stream().forEach(System.out::print);
	}
}
