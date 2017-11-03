package mvnpractice;

public class Rreplaceall {

	public static void main(String[] args) {
		//By using reverse all method
		String x="hi this is mani";
		String y=x.replaceAll("\\s","");
		System.out.println(y);//output without spaces
		//with out using replaceall() 
		char[] ch=x.toCharArray();
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<ch.length;i++){
			if((ch[i]!=' ')&&(ch[i]!='\t')){
				sb.append(ch[i]);
			}
		}
System.out.println(sb);
	}

}
