import java.util.Arrays;
import java.util.Scanner;

class Alphabetical{
	public static void order(String str){
		String[] arr = str.split("");
		Arrays.sort(arr);
		String newStr = Arrays.toString(arr);
		newStr = newStr.substring(1, newStr.length()-1).replace(", ","");
		System.out.println(newStr);
		
	}
}

public class AlphabeticalOrder {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter string");
		String str = input.next();
		Alphabetical.order(str);

	}

}
