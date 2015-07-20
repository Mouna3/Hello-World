import java.util.*;
public class List {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list= new ArrayList<String>();
		int argumentsLength,listLength;
		argumentsLength=args.length;
		for(int i=0;i<argumentsLength;i++)
		{
			list.add(args[i]);
		}
		listLength=list.size();
		System.out.println("Elements in arraylist are");
		for(int i=0;i<listLength;i++)
		{
			System.out.print("  "+list.get(i));
		}
	}

}
