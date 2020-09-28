package CollectionsPractice;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationPrc {

	public static void main(String[] args) {
		Vector ll = new Vector();
		
		for(int i=0;i<=10;i++)
		{
			ll.add(i);
		}
		System.out.println(ll);
		
		Enumeration e = ll.elements();
		
		while(e.hasMoreElements()){
			Integer I = (Integer)e.nextElement();
			if(I%2==0)
				System.out.println(I);
		}
		System.out.println(e.getClass().getName());
	}

}
