package mvnpractice;

public class Missingnumber {
	//find sum of numbers
	static int sumofnums(int n){
		int sum=(n*(n+1))/2;
		System.out.println(sum);
		return sum;
	}
	//find sum of elelments
	static int sumofelelments(int[] s){
		int sum=0;
		for(int i=0;i<s.length;i++){
			sum=sum+s[i];
			System.out.println(sum);
		}
		return sum;
	}

	public static void main(String[] args) {
		
      int n=10;
      int[] x={1,3,25,75,98,78,26,84,12,10};
      int sumofnum=sumofnums(n);
      System.out.println(sumofnum);
      int sumofele=sumofelelments(x);
      System.out.println(sumofele);
      int missnumis=sumofnum-sumofele;
      System.out.println(missnumis);
	}

}
