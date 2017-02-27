import java.util.*;
public class Conver_Array_To_ArrayList {
	public static void main(String[] args) {
		String[] countries = {"Cambodia","VietNam","Thailand","USA","Cambodia","France","England","VietNam","Cambodia"};
		ArrayList<String> list1 = new ArrayList<>();
		LinkedList<String> list2 = new LinkedList<>();
		
		for(String item:countries){
			list1.add(item);
			list2.add(item);
		}
		System.out.printf("List type : ArrayList , total size :%s%n",list1.size());
		System.out.printf("elements :  ");
		displayAllWithLoop(list1);
		
		System.out.printf("%nList type : LinkedList , total size :%s%n",list2.size());
		System.out.printf("elements :  ");
		displayAllWithIterator(list2);
		
		
    }
	//method
	public static void displayAllWithIterator(LinkedList<String> s){
		Iterator<String> iterator = s.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.printf("%s ",item);
        }
	}
	public static void displayAllWithLoop(ArrayList<String> s){
		for(String item:s){
			 System.out.printf("%s ",item);
		}
	}
}
