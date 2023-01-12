package Lambda;

import java.util.List;
import java.util.stream.Collectors;

public class threeLetterString {

	public static void main(String[] args) {
		List<String> ArgPlayers = List.of("MacAllister", "Di Maria", "Mess", "Lautaro","De Paul");
        System.out.println(getThreeLetterAStrings(ArgPlayers));

	}

	public static List<String> getThreeLetterAStrings(List<String> words) {
        return words.stream()
                .filter(s -> s.startsWith("a") && s.length() == 3)
                .collect(Collectors.toList());
    }
}
