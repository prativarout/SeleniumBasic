package CollectionsPractice;

import java.util.Vector;

public class VectorPrac {

	public static void main(String[] args) {
	Vector v = new Vector();
	
	v.addElement("test");
	v.addElement("vector");
	v.addElement(1);
	v.addElement(2);
	System.out.println(v);
	System.out.println(v.size());
	System.out.println(v.capacity());
	
	for(int i = 0;i<=10;i++){
		
		v.addElement(i);
	}
	
	v.removeElement(1);
	System.out.println(v);
	System.out.println(v.size());
	System.out.println(v.capacity());
	System.out.println(v.lastElement());
	

	}

}
