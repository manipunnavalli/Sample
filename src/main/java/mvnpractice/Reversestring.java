package mvnpractice;

public class Reversestring {

	public static void main(String[] args) {
		String x="Manikanta";
		//By using iteration
		char[] ch=x.toCharArray();
		for(int i=ch.length-1;i>=0;i--){
			System.out.print(ch[i]);
		}
		System.out.println();
		//By using strnig buffer reverse method
StringBuffer str=new StringBuffer(x);
System.out.println(str.reverse());
System.out.println();
System.out.println(recursiveMethod(x));
	}
//recursive method
	private static String recursiveMethod(String x) {
		
		if(null==x||x.length()<=1){
			return x;
		}
		return recursiveMethod(x.substring(1)+x.charAt(0));
	}

}
