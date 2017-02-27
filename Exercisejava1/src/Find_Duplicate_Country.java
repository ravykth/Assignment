import java.util.*;
public class Find_Duplicate_Country {
	public static void main(String[] args) {
		String[] countries = {"Cambodia","VietNam","Thailand","USA","Cambodia","France","England","VietNam","Cambodia"};
		Set<String> setCountries = new HashSet<>();
		for(String item:countries){
			setCountries.add(item);
		}
		System.out.println("Duplicated Country name is :");
		dupCount(setCountries, countries);
		System.out.printf("\nThere are %d countries : ", setCountries.size());
		System.out.println(setCountries);
	}
	public static void dupCount(Set<String> list, String[] count){
		for(String item:list){
			String dup = "";
			dup =dupCount(item, count);
			if(dup != ""){
				System.out.println(dup);
			}
		}	
	}
	public static String dupCount(String country, String[] countries){
		int total =0;
		for(String item:countries){
			if(item == country){
				total++;			
			}
		}
		if(total > 1){
			return country;
		}
		return "";
	}

}
