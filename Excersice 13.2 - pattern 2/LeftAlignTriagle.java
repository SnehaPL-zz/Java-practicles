import java.util.Arrays;
import java.util.Scanner;

class LeftAlign implements TrianglePatt{
	public void triangle(int row){
		String finalPattern = "";
		for(int i=1; i<=row; i++){
			finalPattern = finalPattern.concat(toFillStar(i));
			finalPattern = finalPattern.concat("\n");
		}
		System.out.println(finalPattern);
	}
	
	public static String toFillStar(int row){
		char[] arr = new char[row];
		Arrays.fill(arr, '*');
		String str2 = new String(arr);
		return str2;
	}
}

public class LeftAlignTriagle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter number of lines");
		int rows = input.nextInt();
		input.close();
		LeftAlign lf = new LeftAlign();
		lf.triangle(rows);
	}

}
