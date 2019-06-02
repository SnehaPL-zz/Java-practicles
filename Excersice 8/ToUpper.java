
class Upper{
	public static String convertToUpper(String str){
		char ch = Character.toUpperCase(str.charAt(0));
		String str1 = ch + str.substring(1);
		return str1;
	}
}

public class ToUpper {

	public static void main(String[] args) {
		String str = "the quick brown fox";
		String arr[] = str.split(" ");
		String newString = "";
		for(String str1 : arr){
			String newStr = Upper.convertToUpper(str1);
			newString = newString.concat(newStr);
			newString = newString.concat(" ");
		}
		System.out.println(newString);
	}

}
