import java.util.Scanner;

class Combination {
	public static void comb(String str) {
		String[] arr = str.split("");
		int len = arr.length;
		for (int count = 0; count < len; count++) {
			String arr1 = "";
			for (int i = count+1; i < len; i++) {
				arr1 = arr1.concat(arr[i]);
				System.out.println(arr1);
			}
		}
	}
}

public class AllCombination {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter string");
		String str = input.next();
		Combination.comb(str);

	}

}
