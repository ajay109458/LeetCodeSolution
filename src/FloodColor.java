import java.util.Arrays;

public class FloodColor {

	public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

		int currentColor = image[sr][sc];
		
		
		if (currentColor == newColor)
			return image;

		return floodFill(image, sr, sc, newColor, currentColor);

	}

	public static int[][] floodFill(int[][] image, int sr, int sc, int newColor, int oldColor) {

		if (sr < 0 || sr >= image.length)
			return image;

		if (sc < 0 || sc >= image[0].length)
			return image;

		System.out.println(sr + " : " + sc);
		
		if (oldColor != image[sr][sc]) {
			return image;
		}
		
		image[sr][sc] = newColor;

		floodFill(image, sr - 1, sc, newColor, oldColor);
		floodFill(image, sr + 1, sc, newColor, oldColor);
		floodFill(image, sr, sc - 1, newColor, oldColor);
		floodFill(image, sr, sc + 1, newColor, oldColor);

		return image;
	}

	public static void main(String[] args) {
		int[][] image = {{0,0,0},{0,1,1}};

		image = floodFill(image, 1, 1, 1);

		for (int[] arr : image) {
			System.out.println(Arrays.toString(arr));
		}
	}

}
