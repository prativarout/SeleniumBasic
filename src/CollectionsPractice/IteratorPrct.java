package CollectionsPractice;

import java.util.ArrayList;
import java.util.Iterator;


public class IteratorPrct {

	public static void main(String[] args) {
		ArrayList ll = new ArrayList();
		
		for(int i=0;i<=10;i++)
		{
			ll.add(i);
		}
		System.out.println(ll);
		
		Iterator it = ll.iterator();
		
		while(it.hasNext()){
			Integer I = (Integer) it.next();
			if(I%2==0)
				System.out.println(I);
			else
				
				it.remove();
		
			
			
	}
		
		System.out.println(ll);
		System.out.println(it.getClass().getName());
	}

}
