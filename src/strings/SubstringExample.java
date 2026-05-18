package strings;

public class SubstringExample {

	public static void main(String[] args) {
		
		String sentence = "My name is Sofia" ;
		//substring(beginning index,ending index);
		
		String name = sentence.substring(11,sentence.length());
		System.out.println(name);

	}

}
