package mvnpractice;

public class Armstrongnumber {
    static void callnumber(int number){
    	int n=number;
    	int size=String.valueOf(n).length();
    	int sum=0;
    	while(n!=0){
    		int ld=n%10;
    		int k=1;
    		for(int i=0;i<size;i++){
    			k=k*ld;
    		}
    		
    		sum=sum+k;
    		n=n/10;
    	}
    		if(sum==number){
    			System.out.println(number+" "+"is a armstrong number");
    		}
    		else
    		{
    			System.out.println(number+" "+"is not a armstrong number");
    		}
    		
    	}
    
	public static void main(String[] args) {
		//sum of cubes of its digits for example 0, 1, 153, 370, 371
		callnumber(4578);
		callnumber(153);
		callnumber(45324);
		callnumber(457);

	}

}