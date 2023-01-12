package Lambda;

import java.util.List;
import java.util.stream.Collectors;

public class BasicLambda5 {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(23, 74, 12, 2, 74);
        System.out.println(getString(numbers));
		

	}

	
	public static String prefixNum (Integer n) {
		if(n%2 == 0) return "e"+n;
	    else return "o"+n;

	}
	
	 public static String getString(List<Integer> numbers) {
	        return numbers.stream()
	                      .map(BasicLambda5::prefixNum)
	                      .collect(Collectors.joining(","));
	    }
}
