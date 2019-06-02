
class Unique{
	public static void characters(String str){
		String[] arr = str.split("");
		String newStr = "";
		for(String st: arr){
			if(newStr.contains(st) == false){
				newStr = newStr.concat(st);
			}
		}
		System.out.println(newStr);
	}
}

public class UniqueChar {

	public static void main(String[] args) {
		String str = "thequickbrownfoxjumpsoverthelazydog";
		Unique.characters(str);
	}

}
