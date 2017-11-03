package mvnpractice;

import java.util.ArrayList;
import java.util.Iterator;

public class Stringpractice {
public static void main(String[] args){
	ArrayList<String> list=new ArrayList<String>();
	list.add("Mani");
	list.add("is");
	list.add("Working,hghgjhj");
	list.add("in IT");
	System.out.println(list);
	System.out.println(list.toString());
	System.out.println(list.spliterator());
	Iterator it=list.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	for(String obj:list){
		System.out.println(obj);
	}
	}
}
