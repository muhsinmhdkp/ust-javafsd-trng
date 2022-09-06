package set6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection {
	public static void main(String args[]) {
		
		List lst = new ArrayList();
		lst.add("abc");
		lst.add(123);
		lst.add(true);
		lst.add(3,4);
		
		
		Iterator itr = lst.iterator();
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
			
			if(itr.next() instanceof String){
				System.out.println("*****"+itr.next().toString().toUpperCase());
			}
		}
		
		for(Object o:lst)
			System.out.println(o+"\n");
		System.out.println(lst);
	}

}
