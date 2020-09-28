package CollectionsPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Listiterator_prac {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("first");
		al.add("second");
		al.add("third");
		
		ListIterator<String> itr = al.listIterator();
		
		while(itr.hasNext()){
			
			String str = itr.next();
			
			if(str.equals("second")){
				
				itr.remove();
				System.out.println(al);
			}
			
			else if (str.equals("first")){
				itr.add("two");
				System.out.println(al);
			}
			else if(str.equals("third")){
				
				itr.set("three"); 
				System.out.println(al);
			}
			
			System.out.println(al);
			System.out.println(itr.getClass().getName());
		}

	}

	

}
