
class VowelsCount{
	public static void vowel(String str){
		String[] newStr = str.split("");
		int count = 0;
		for(String st: newStr){
			if(st.contains("a")== true || st.contains("e")== true || st.contains("i")== true || st.contains("o")== true ||st.contains("u")== true){
				count = count + 1; 
			}
		}
		System.out.println("No of vowels are "+count);
	}
}
public class Vowels {

	public static void main(String[] args) {
		String str = "The quick brown fox";
		VowelsCount.vowel(str);
	}

}
