package mvnpractice;

import java.util.Arrays;

public class Equalityofarrays {

	public static void main(String[] args) {
		//By using Iterative method
		int[] a1={1,2,3,4,5};
		int[] a2={1,2,3,4,5};
		boolean b=true;
		if(a1.length==a2.length){
			for(int i=1;i<a1.length;i++){
				if(a1[i]!=a2[i]){
					b=false;
				}
			}
		}
		else
		{
			b=false;
		}
		if(b){
			System.out.println("elements are matched");
		}
		else {
			System.out.println("elements are not matched");
		}
		//By using array list equals method
		String[] x={"Hi","This","is","Mani"};
		String[] y={"Hi","Mani","This","Is"};
		String[] z={"Hi","This","is","Mani"};
		System.out.println(Arrays.equals(x,y));//false
		System.out.println(Arrays.equals(x,z));//true
		//If iwant to comapre size only
		//this way can check same set of elements but diff positions
		Arrays.sort(x);//sort the elements by order
		Arrays.sort(y);
		Arrays.sort(z);
		System.out.println(Arrays.equals(x,y));
		System.out.println(Arrays.equals(x,z));
		//if i want to comapre multi dimensinoal array
		//i want to use deepequals method
		String[][] a={{"Hi","This","is","Mani"},{"1","2","3","4","5"}};
		String[][] c={{"Hi","This","is","Mani"},{"1","2","3","4","5"}};
		System.out.println(Arrays.deepEquals(a,c));//true
		//Calling equals() method on same arrays will return false
		System.out.println(Arrays.equals(a,c));//false 
		//That's why use deepEquals() method to compare multidimensional arrays
	}

}
