
public class GoatLatin {

	public String toGoatLatin(String S) {

		String result = "";
		
		String[] arr = S.split(" ");
		
		String suffix = "";
		
		for(String word : arr) {
			
			word = word.toLowerCase();
			suffix = suffix + "a";
			
			
			if (!isVowelStartedWord(word)) {
				word = word.substring(1, word.length() - 1) + word.charAt(0) ;
			}
			
			word = word + "ma" + suffix;
			result = result + word + " ";
		}
		
		
		
		return result.trim();
	}
	
	public boolean isVowelStartedWord(String input) {
		
		if (input == null)
			return false;
		
		if ("".equals(input))
			return false;
		
		char ch = input.charAt(0);
		
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			return true;
		
		return false;
		
	}
	
	

}
