package mvnpractice;

import java.util.ArrayList;
import java.util.Iterator;

public class Addall {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("hi");
		al.add("This");
		al.add("is");
		al.add("Mani");
		System.out.println(al);
		Iterator it=al.iterator();
	while(it.hasNext()){
		System.out.println(it.next());
	}	
	//al.addAll(al1);
	ArrayList<String> al1=new ArrayList<String>();
	al1.add("Mani");
	al1.add("good");
	al1.add("morning");
	System.out.println(al1);
	al1.addAll(al);
	System.out.println(al1);
	al1.removeAll(al);
	System.out.println(al1);
	al1.retainAll(al);
	System.out.println(al1);//this one will print only duplicate elements
	Iterator it1=al1.iterator();
	while(it1.hasNext()){
		System.out.println(it1.next());
	}
	}

}
