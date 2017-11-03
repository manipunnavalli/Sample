package mvnpractice;

import java.io.IOException;

public class Openfiles {

	public static void main(String[] args) throws IOException {
		Runtime rt=Runtime.getRuntime();
	
			//rt.exec("notepad.exe");//open notepad
		/*}
		catch(IOException e){
			e.printStackTrace();
		}*/
String[] x={"C:\\Program Files\\Mozilla Firefox\\firefox.exe","http://javaconceptoftheday.com/how-to-launch-external-applications-through-java-program/"};
rt.exec(x);//directly open the browser with site
	}

}
