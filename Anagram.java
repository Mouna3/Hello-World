import java.util.Arrays;


public class Anagram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args != null && args.length>0)
		{
			String word1=args[0];
			String word2=args[1];
			char[] cWord1=word1.toLowerCase().toCharArray();
			char[] cWord2=word2.toLowerCase().toCharArray();
			if(cWord1.length==cWord2.length)
			{
				Arrays.sort(cWord1);
				Arrays.sort(cWord2);
				if(Arrays.equals(cWord1, cWord2))
					System.out.println(word1+" is anagram of "+word2);
				else
					System.out.println("Not anagrams");
			}
			else
				System.out.println("Not anagrams");
	
		}
		else
			System.out.println("Enter valid words");
	}

}
