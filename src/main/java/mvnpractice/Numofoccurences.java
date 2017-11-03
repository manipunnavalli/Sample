package mvnpractice;

import java.util.Scanner;

public class Numofoccurences {
	public static void main(String[] args){
		/*//Creating a HashMap containing char as a key and occurrences as  a value
		HashMap<Character,Integer> chars=new HashMap<Character,Integer>();
		 //Converting given string to char array
		char[] c=data.toCharArray();
		//checking each char 
		for(Character i=0;i<c.length;i++){
			if(chars.containsKey(i)){
				chars.put(i,chars.get(i)+1);
			}
			else
			{
				chars.put(i,1);
			}
		}
		System.out.println(chars);
	}

	public static void main(String[] args) {
		
charcount("hi this is mani");
System.out.println("what are you doing");fdc vcvcvvc
System.out.println("How are you");*/
		int n, x, count = 0, i = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        System.out.print("Enter the element of which you want to count number of occurrences:");
        x = s.nextInt();
        for(i = 0; i < n; i++)
        {
            if(a[i] == x)
            {
                count++;
            }
        }
        System.out.println("Number of Occurrence of the Element:"+count);
    }
	}


 