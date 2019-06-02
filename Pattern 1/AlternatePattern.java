import java.util.Arrays;
import java.util.Scanner;

class Alternatepatt extends Rectangle{
	public static void pattern(int col, int row){
		String finalStr = "";
		for(int i=0; i<col; i++){
			if(i%2==0){
				finalStr = finalStr.concat(createRow(row));
			}
			else{
				finalStr = finalStr.concat(createDash(row));
			}
			finalStr = finalStr.concat("\n");
		}
		System.out.println(finalStr);
	}
	
	public static String createDash(int row){
		char[] arr = new char[row];
		Arrays.fill(arr, '-');
		String str2 = new String(arr);
		return str2;
	}
}

public class AlternatePattern {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of columns");
		int col = input.nextInt();
		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int row = input1.nextInt();

		Alternatepatt.pattern(col, row);

	}
}
