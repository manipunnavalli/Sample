package mvnpractice;

public class Binaryornot {
 static void  binarycheck(int number){
	 int n=number;
	 boolean b=true;
	 while(n!=0){
		int t=n%10;
		if(t>1){
			b=false;
			break;
		}
		else
		{
			n=n/10;
		}
	 }
	 if(b){
		 System.out.println(number+" "+"is a binary number");
	 }
	 else {
		 System.out.println(number +" "+"Is not a binary number");
	 }
	 
 }
	public static void main(String[] args) {
		binarycheck((50000420));
		binarycheck((1010100010));
		binarycheck((458790));
		binarycheck((1000100));

	}


}
