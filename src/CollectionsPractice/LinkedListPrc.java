package CollectionsPractice;

import java.util.LinkedList;

public class LinkedListPrc {

	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		
		l.add("Prativa");
		l.add("Nirvaan");
		l.add(241192);
		l.add(150792);
		System.out.println(l);
		l.add(2,"Third");
		System.out.println(l);
		l.set(2, "one");
		l.add(null);
		System.out.println(l);
		l.removeLast();
		System.out.println(l);
		System.out.println(l.getFirst());
		System.out.println(l.get(3));
		l.addLast("added");
		System.out.println(l);

	}

}
