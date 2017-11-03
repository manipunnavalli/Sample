package mvnpractice;

import java.util.Scanner;

class condition{
	
	static boolean numberorNot(String input){
		try{
		Integer.parseInt(input);
	}
	catch(NumberFormatException e){
		return false;
	}
	return true;
	}
}
public class Checkingnumber {

	public static void main(String[] args) {
		System.out.println("Enter mobile number");
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		//int x=input.length();
		int x=Integer.parseInt(input);
		int[] arr= new int[x];
		//for(int i=0;i<arr.length;i++)
		if(arr.length<10){
			System.out.println("Your entering correct number");
		}
		else
		{
			System.out.println("you are entering wrong number");
		}
		

	}

}
