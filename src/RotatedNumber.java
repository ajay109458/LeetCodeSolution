
public class RotatedNumber {

	public static boolean isValid(int num) {
		
		int temp = num;
		
		int rotatedNum = 0;
		int count = 0;
		
		while(temp != 0) {
			
			int digit = temp%10;
			
			int rotatedDigit;
			
			
			switch(digit) {
				
				case 0: 
				case 1:
				case 8:
					rotatedDigit = digit;
					break;
				
				case 2:
					rotatedDigit = 5;
					break;
					
				case 5:
					rotatedDigit = 2;
					break;
					
				case 6:
					rotatedDigit = 9;
					break;
					
				case 9:
					rotatedDigit = 6;
					break;
				
				default:
					return false;
			
			}
			
			System.out.println(rotatedNum + " : " + rotatedDigit);
			
			rotatedNum = (rotatedNum  + rotatedDigit * (int) Math.pow(10, count)) ;
			
			count = count + 1;
			
			temp = temp/10;
		}
		
		System.out.println(num + " : " + rotatedNum);
		return rotatedNum != num;
		
	}
	
	public static int countValidRotatedNums(int limit) {
		int count = 0;
		
		for (int i = 1; i <= limit; i++) {
			
			if (isValid(i))
				count++;
			
		}
		
		return count;
	}
	
	
	public static void main(String[] args) {
		System.out.println(isValid(856));
	}
}
