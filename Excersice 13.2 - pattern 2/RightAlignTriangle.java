import java.util.Scanner;

class RightAlign implements TrianglePatt{
	public void triangle(int row){
		String finalPattern = "";
		for(int i=1; i<=row; i++){
			finalPattern = finalPattern.concat(toRightFillStar(row, i));
			finalPattern = finalPattern.concat("\n");
		}
		System.out.println(finalPattern);
	}
	
	public static String toRightFillStar(int row, int lines){
		char[] arr = new char[row];
		int i = row - lines;
		for(int j=0; j<=i; j++){
			arr[j] = ' ';
		}
		for(int k=i; k<row; k++){
			arr[k] = '*';
		}
		String str2 = new String(arr);
		return str2;
	}
}

public class RightAlignTriangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter number of lines");
		int rows = input.nextInt();
		input.close();
		RightAlign rf = new RightAlign();
		rf.triangle(rows);
	}

}
