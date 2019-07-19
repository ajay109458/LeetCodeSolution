import java.util.HashSet;
import java.util.Set;

public class TransformationCode {

	public static void main(String[] args) {

		String[] words = {"gin", "zen", "gig", "msg"};
		System.out.println(uniqueMorseRepresentations(words));
		
	}

	public static int uniqueMorseRepresentations(String[] words) {
        
        String[] transformationCodes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        Set<String> transformWords = new HashSet<>();
        
        for(String word : words) {
        	
        	String code = "";
        	
        	for(int i = 0; i < word.length(); i++) {
        		char ch = word.charAt(i);
        		code += transformationCodes[ch - 'a'];
        	}
        	
        	transformWords.add(code);
        	
        }
        
        return transformWords.size();
    }

}
