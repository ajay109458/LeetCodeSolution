import java.util.Arrays;

public class NumberOfLines {

	public static int[] numberOfLines(int[] widths, String S) {

		int lineCount = 0;
		
		
		int lineLength = 0;
		for(int i = 0; i < S.length(); i++) {
			
			char ch = S.charAt(i);
			
			if (lineLength + widths[ch-'a'] > 100) {
				lineCount++;
				
				lineLength = 0;
			}
			
			lineLength = lineLength + widths[ch-'a'];
			
			System.out.println(lineLength);
		}

		if (lineLength > 0) {
			lineCount++;
		}
		
		return new int[] {lineCount, lineLength};
	}
	
	public static void main(String[] args) {
		int[] widths = {4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
		
		String S = "bbbcccdddaaa";
		
		System.out.println(Arrays.toString(numberOfLines(widths, S)));
	}

}
