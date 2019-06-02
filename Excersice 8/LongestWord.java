class LongWord {
	public static String word(String str) {
		String arr[] = str.split(" ");
		String newString = "";
		int len = 0;
		for (String str1 : arr) {
			if(len<str1.length()){
				newString = str1;
				len = str1.length();
			}
		}
		return newString;
	}
}

public class LongestWord {

	public static void main(String[] args) {
		String str = "Web Development Tutorial";
		String Longword = LongWord.word(str);
		System.out.println("The longest word is " +Longword);
	}

}
