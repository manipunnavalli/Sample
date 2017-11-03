package mvnpractice;  

public class Trignimetricvallues {

	public static void main(String[] args) {
		double angle=90;
		double angleInRadians=Math.toRadians(angle);
		double sinval=Math.sin(angle);
		double cosval=Math.cos(angle);
		double tanval=(sinval/cosval);
		double cotval=(1/tanval);
		double secval=(1/cosval);
		double cosecval=(1/sinval);
		System.out.println("Value of sin90 is : "+sinval);
		System.out.println("value of cos90 is :"+cosval);
		//like above we can print all vallues
	}

}
