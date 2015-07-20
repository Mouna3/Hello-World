
public class Calculations extends AbstractClass {

	/**
	 * @param args
	 */
	int multiplication(int a,int b)
	{
		return a*b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args != null && args.length>0)
		{
			int a,b;
			try
			{
				a=Integer.parseInt(args[0]);
				b=Integer.parseInt(args[1]);
				Calculations cal = new Calculations();
				System.out.println("Additon of "+a+" and "+b+" is "+cal.addition(a,b));
				System.out.println("substraction of "+a+" and "+b+" is "+cal.substraction(a,b));
				System.out.println("multiplication of "+a+" and "+b+" is "+cal.multiplication(a,b));
				System.out.println("division of "+a+" and "+b+" is "+cal.division(a,b));
			}
			catch(Exception ex)
			{
				System.out.println("Exception "+ex.getMessage());
			}
		}
		else
			System.out.println("Enter valid numbers");
	}

}
