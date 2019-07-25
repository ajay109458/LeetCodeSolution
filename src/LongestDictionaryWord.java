import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestDictionaryWord {

	public static String longestWord(String[] words) {

		Set<String> wordsSet = new HashSet<>();
		
		for (int i = 0; i < words.length; i++) {
			wordsSet.add(words[i]);
		}
		
		List<String> results = new ArrayList<String>();
		
		int maxLengthWord = 0;
		
		for (int i = 0; i < words.length; i++) {
			
			String currentWord = words[i];
			int len = currentWord.length();
			
			boolean isAllSubStringExists = true;
			
			for (int j = 1; j < len ; j++) {
				
				System.out.println("* " + currentWord.substring(0, j));
				
				if (!wordsSet.contains(currentWord.substring(0, j))) {
					isAllSubStringExists = false;
					break;
				} 
				
			}
			
			if (isAllSubStringExists) {
				
				System.out.println(currentWord);
				
				if (currentWord.length() > maxLengthWord) {
					results.clear();
					results.add(currentWord);
					maxLengthWord = currentWord.length();
				} else if (currentWord.length() == maxLengthWord) {
					results.add(currentWord);
				}
				
			}
			
		}
		Collections.sort(results);

		if (results.size() > 0)
			return results.get(0);
		
		return null;
	}
	
	public static void main(String[] args) {
		String[] words = {"a","banana","app","appl","ap","apply","apple"};
		
		System.out.println("-------------");
		
		System.out.println(longestWord(words));
	}

}
