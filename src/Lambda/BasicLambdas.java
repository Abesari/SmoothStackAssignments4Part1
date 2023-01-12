package Lambda;
import java.util.Arrays;

public class BasicLambdas {

	public static void main(String[] args) {
		
		
		String [] bdo = new String[] {"Messi", "Ronaldo", "Kaka"};
		//1
		Arrays.sort(bdo, (String b1, String b2) -> b1.length() -b2.length());
		
		//2
		Arrays.sort(bdo, (String b2, String b1) -> b2.length() -b1.length());
		
		//3
		Arrays.sort(bdo, (String b1, String b2) -> b1.charAt(0) - b2.charAt(0));
		
		//4
		Arrays.sort(bdo, (String b1, String b2) -> {
		    if (b1.contains("e") && !b2.contains("e")) {
		        return -1;
		    } else if (!b1.contains("e") && b2.contains("e")) {
		        return 1;
		    } else {
		        return 0;
		    }
		});
	}
		
		
}
