import java.util.*;
public class Covert_Array_LinkedHashSet {
	public static void main(String[] args) {
		String[] countries = {"Cambodia","VietNam","Thailand","USA","Cambodia","France","England","VietNam","Cambodia"};
		String[] otherCountries = {"Albania","Barbados","Bulgaria","Cambodia"};
		Set<String> setCountries = new LinkedHashSet<String>();
		for(String item:countries){
			setCountries.add(item);
		}
		for(String item:otherCountries){
			Boolean isExist = false;
			isExist =isCountryExist(setCountries, item);
			if(isExist){
				System.out.printf(" Country name :[%s] found in the object%n", item);
			}else{
				System.out.printf(" Country name :[%s] is not found in the object%n", item);
			}
		}
	}	
	public static boolean isCountryExist(Set<String> list, String c){
		boolean result = false;
		if(list.contains(c)){
			result = true;			
		}
		return result;
	}

}
