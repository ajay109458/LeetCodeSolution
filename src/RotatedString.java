
public class RotatedString {

	public static boolean isRotated(String A, String B) {

		int n = A.length();

		if (A.equals(B))
			return true;

		if (A.length() != B.length())
			return false;

		for (int i = 0; i < n; i++) {

			B = B.substring(1, B.length()) + B.charAt(0);

			if (A.equals(B))
				return true;
			
		}

		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(isRotated("abcde", "cdeab"));
	}

}
