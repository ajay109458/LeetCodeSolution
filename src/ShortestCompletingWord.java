import java.util.Arrays;

public class ShortestCompletingWord {
	
	public static void main(String[] args) {
		String[] words = {"measure","other","every","base","according","level","meeting","none","marriage","rest"};
		String licence = "GrC8950";
		
		System.out.println(shortestCompletingWord(licence, words));
	}

	public static String shortestCompletingWord(String licensePlate, String[] words) {

		int minLength = Integer.MAX_VALUE;
		String minWord = "";
		
		int[] cache = new int[26];
		
		licensePlate = licensePlate.toLowerCase();
		
		for (int i = 0; i < licensePlate.length(); i++) {
			char ch = licensePlate.charAt(i);
			
			if (Character.isAlphabetic(ch))
				cache[ch-'a']++;
		}
		
		
		for(String word : words) {
			
			if (isWordContainsChar(word, cache) && word.length() < minLength) {
				minLength = word.length();
				minWord = word;
			}
			
		}
		
		return minWord;
	}

	public static boolean isWordContainsChar(String word, int[] cache) {
		
		word = word.toLowerCase();
		
		int[] wCache = new int[26];
		
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			
			if (cache[ch-'a'] > 0)
				wCache[ch - 'a']++;
		}
		
		System.out.println("-------------------- : " + word);
		
		for (int i = 0; i < 26; i++) {
			
			System.out.println(((char)('a'+i)) + " : " + cache[i] + " -> " + wCache[i]);
			
			if (cache[i] > 0 && cache[i] > wCache[i])
				return false;
		}
		
		return true;
	}

}
