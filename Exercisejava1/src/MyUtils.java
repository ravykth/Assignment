import java.util.*;
public class MyUtils {
	public static void checkDuplicate(Set<String> s, String[] countries) {
		Set<String> set = s;
		for(String item:countries){
			set.add(item);
		}
		System.out.println(set);
	}
}
