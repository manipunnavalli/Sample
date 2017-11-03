package mvnpractice;

public class Secondlargestnum {
    public  static int secondlargest(int[] input){
    	int firstlargest,secondlargest;
    	//comaparing first 2 numbers
    	if(input[0]>input[1])
    	{
    		firstlargest=input[0];
    		secondlargest=input[1];
    	}
    	else
    	{
    		firstlargest=input[1];
    		secondlargest=input[0];
    	}
    	//loop for multiple numbers
    	for(int i=2;i<input.length;i++){
    	if(input[i]>firstlargest){
    		//i[2]>first largenumber then change it AS a firstnumber
    		firstlargest=secondlargest;
    		firstlargest=input[i];
    	}
    	else if(input[i]<firstlargest&&input[i]>secondlargest)
    	{
    		//convertion of int to char just for idea
    		//char c=Integer.toString(num).charAt(0);
    	secondlargest=input[i];	
    	}
    	}
    	return secondlargest;
    }
	public static void main(String[] args) {
		System.out.println(secondlargest(new int[] {45,25,75,98,16,78}));
		System.out.println(secondlargest(new int[] {58,79,26,85,467,26}));
		System.out.println(secondlargest(new int[] {45,98,26,68,12,1,79,987,36}));
		
	}

}
