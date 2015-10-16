import java.util.*;
public class Hashmap {
	/**
	 * @param args
	 */	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> monthsOfYear = new HashMap<String, String>();
		monthsOfYear.put("01","January");
		monthsOfYear.put("02","February");
		monthsOfYear.put("03","March");
		monthsOfYear.put("04","April");
		monthsOfYear.put("05","May");
		monthsOfYear.put("06","June");
		monthsOfYear.put("07","July");
		monthsOfYear.put("08","August");
		monthsOfYear.put("09","September");
		monthsOfYear.put("10","October");
		monthsOfYear.put("11","November");
		monthsOfYear.put("12","December");
		System.out.println("The items present in hasmap are:");
		System.out.println("Keys    Value");
		for (String key : monthsOfYear.keySet()) {
			System.out.println(key + " " + monthsOfYear.get(key));
	    }
		
		if(args != null && args.length>0) {
			String inputKey = args[0];
			Hashmap map = new Hashmap();
			System.out.println("the value of the entered key ("+inputKey+") is: "+map.searchKey(inputKey,monthsOfYear));
		}
		else
			System.out.println("Enter a valid argument");
		
	}
	
	public String  searchKey(String inputKey, HashMap monthsOfYear) {
		if(inputKey != null && monthsOfYear.containsKey(inputKey)) {
			return (String) monthsOfYear.get(inputKey);
		}
		else 
			return "Enter valid key";
	}
	
}
