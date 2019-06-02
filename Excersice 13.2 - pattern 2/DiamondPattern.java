import java.util.Scanner;

class Diamond extends LeftAlign{
	public static void trianglePatt(int row){
		String finalPattern = "";
		for(int i=1; i<=(row/2); i++){
			finalPattern = finalPattern.concat(toFillUpperPart(row, i));
			finalPattern = finalPattern.concat("\n");
		}
		finalPattern = finalPattern.concat(toFillStar(row));
		finalPattern = finalPattern.concat("\n");
		int count = 1;
		for(int i=((row/2)+1); i<=row; i++){
			finalPattern = finalPattern.concat(toFillLowerPart(row, i, count));
			finalPattern = finalPattern.concat("\n");
			count = count + 1;
		}
		System.out.println(finalPattern);
	}
	
	public static String toFillUpperPart(int row, int line){
		String arr1 = "";
		int i = ((row/2)-line)+1;
		for(int j=1; j<=i; j++){
			arr1 = arr1.concat(" ");
		}
		for(int k=1; k<=((2*line)-1); k++){
			arr1 = arr1.concat("*");
		}
		return arr1;
	}
	
	public static String toFillLowerPart(int row, int line, int count){
		String arr1 = "";
		int i = row-line;
		for(int j=1; j<=count; j++){
			arr1 = arr1.concat(" ");
		}
		for(int k=1; k<=(i*2)-1; k++){
			arr1 = arr1.concat("*");
		}
		return arr1;
	}
}

public class DiamondPattern {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter number of lines");
		int rows = input.nextInt();
		input.close();
		Diamond.trianglePatt(rows);
	}

}
