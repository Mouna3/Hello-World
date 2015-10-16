
public class Factorial {

	/**
	 * @param args
	 */
	static int fact(int f)
	{
		if(f==1)
		{
			return f;
	
		}
		else
			return f*fact(f-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args != null && args.length>0)
		{
			int inputNumber,factorial;
			inputNumber=Integer.parseInt(args[0]);
			factorial=fact(inputNumber);
			System.out.println("Factorial of "+inputNumber+" is "+factorial);
		}
		else
			System.out.println("Enter a valid number");
	}

}
