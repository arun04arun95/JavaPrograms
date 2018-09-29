import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListPractise {

	public static void main(String[] args) {
		List<String> names= new ArrayList<>();
		names.add("Arun");
		names.add("Arun");
		names.add("Venu");
		names.add("Kishore");
		System.out.println(names);
		Iterator<String> itr= names.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}