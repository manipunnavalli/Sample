package mvnpractice;

import java.util.ArrayList;
import java.util.Iterator;

class student{
	int id;
	String name;
	String add;
	student(int id,String name,String add){
		this.id=id;
		this.name=name;
		this.add=add;
	}
}
public class Printdetails {

	public static void main(String[] args) {
		student s1=new student(540,"mani","hyd");
		student s2=new student(640,"ram","vij");
		student s3=new student(740,"praveen","viz");
		ArrayList<student> al=new ArrayList<student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		Iterator it=al.iterator();
		while(it.hasNext()){
			student st=(student) it.next();
			System.out.println("Student id is :"+st.id+" "+":student name is:"+st.name+" "+":student add is:"+st.add);
		//System.out.println(it.next());
		}
		
	}

}
