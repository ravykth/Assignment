import java.util.*;
public class My_Own_Class {
	public static void main(String[] args) {
		String[] countries = {"Cambodia","VietNam","Thailand","USA","Cambodia","France","England","VietNam","Cambodia"};
        // Create object
		Set<String> hashSet = new HashSet<String>();
		Set<String> treeSet = new TreeSet<String>();
		Set<String> linkedHashSet = new LinkedHashSet<String>();
		// HashSet
		System.out.printf("Set type = %s ", hashSet.getClass().getName());
		MyUtils.checkDuplicate(hashSet, countries);
		// TreeSet
		System.out.printf("Set type = %s ", treeSet.getClass().getName());
        MyUtils.checkDuplicate(treeSet, countries);
        // LinkedHashSet
        System.out.printf("Set type = %s ", linkedHashSet.getClass().getName());
        MyUtils.checkDuplicate(linkedHashSet, countries);
    }
}
