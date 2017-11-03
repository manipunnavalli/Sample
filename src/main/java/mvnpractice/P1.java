package mvnpractice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;




public class P1 {
	public static WebDriver driver;
	@Test
	public static void m2(){
		System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		m1("cgbchn");
	}
  @Test
	public static void m1 (String make){
		JavascriptExecutor js=(JavascriptExecutor)driver;
			//js.executeScript();
	}	

}
