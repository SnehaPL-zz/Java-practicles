import java.util.Arrays;
import java.util.Scanner;


class Rectangle{
	public static void rect(int col, int row){
		String finalStr = "";
		for(int i=0; i<col; i++){
			finalStr = finalStr.concat(createRow(row));
			finalStr = finalStr.concat("\n");
		}
		System.out.println(finalStr);
	}
	
	public static String createRow(int row){
		char[] arr = new char[row];
		Arrays.fill(arr, '*');
		String str2 = new String(arr);
		return str2;
	}
}

public class FilledRect {

	public static void main(String[] args) {
		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter number of columns");
		int col = input1.nextInt();
		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int row = input2.nextInt();
		Rectangle.rect(col, row);
	}

}
