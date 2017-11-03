package mvnpractice;

import java.util.Arrays;
import java.util.HashSet;

public class Removecommonelements {

	public static void main(String[] args) {
		String[] s1={"Hi","this","is","mani","what"};
		String[] s2={"are","you","doing","mani"};
		HashSet<String> hs=new HashSet<String>();
		for(int i=0;i<s1.length;i++){
			for(int j=0;j<s2.length;j++){
				if(s1[i].equals(s2[j])){
					hs.add(s1[i]);
				}
			}
		}
		System.out.println(hs);
	
	//with out iteration process
	Integer[] i1={1,2,3,4,5};
	Integer[] i2={2,4,6,5,7};
	HashSet<Integer> hs1=new HashSet<Integer>(Arrays.asList(i1));
	System.out.println(hs1);
	HashSet<Integer> hs2=new HashSet<Integer>(Arrays.asList(i2));
	System.out.println(hs2);
	hs1.retainAll(hs2);
	System.out.println(hs1);

}
}
