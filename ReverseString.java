public class ReverseString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if (args != null && args.length>0)
		{
			System.out.println("no.of arguments in string are"+args.length);
			for(int i=0;i<args.length;i++){
				String inputString=args[i];
				//System.out.println("entered word is:"+inputString);
				//int stringSize=inputString.length();
				//System.out.println("length of the string is "+stringSize);
				for(int j=inputString.length()-1;j>=0;j--) {
					System.out.print(inputString.charAt(j));
				}
				System.out.print("  ");
			}
		}
		else
		{
			System.out.println("no arguments passed");
		}
	}

}
