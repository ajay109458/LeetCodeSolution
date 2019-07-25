
public class NextGreatestCharcter {

	public static char nextGreatestLetter(char[] letters, char target) {

		int left = 0;
		int right = letters.length-1;
		
		int mid = -1;
		
		while (left <=  right) {
			
			mid = (left + right) / 2;
			
			System.out.println(left + " : " + right + " -> " + mid + " : " + letters[mid]);
			
			if (mid > 0 && letters[mid] > target && target >= letters[mid-1]) {
				return letters[mid];
			} else if (mid+1 < letters.length && letters[mid] <= target && letters[mid+1] > target ) {
				return letters[mid +1];
			}
			else  if (target >= letters[mid]) {
				left = mid + 1;
			} else {
				right = mid -1;
			}

		}
		
		System.out.println("here");
		
		return letters[0];
		
	}
	
	public static void main(String[] args) {
		
		char[] letters = {'e','e','e','e','e','e','n','n','n','n'};
		
		System.out.println(nextGreatestLetter(letters, 'e'));
		
	}

}
