import java.util.Arrays;
import java.util.Scanner;

class Rect extends Rectangle {
	public static void empty(int col, int row) {
		String finalStr = "";
		for (int i = 0; i < col; i++) {
			if (i == 0 || i == (col - 1)) {
				finalStr = finalStr.concat(createRow(row));
			} else {
				finalStr = finalStr.concat(emptyRow(row));
			}
			finalStr = finalStr.concat("\n");
		}
		System.out.println(finalStr);
	}

	public static String emptyRow(int row) {
		char[] arr = new char[row];
		for (int i = 0; i < row; i++) {
			if (i == 0 || i == (row - 1)) {
				arr[i] = '*';
			}
			else{
				arr[i]=' ';
			}
		}
		String str2 = new String(arr);
		return str2;
	}
}

public class EmptyRect {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of columns");
		int col = input.nextInt();
		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int row = input1.nextInt();

		Rect.empty(col, row);

	}
}
