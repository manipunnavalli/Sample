package mvnpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.*;

public class Csspractice {
	@FindBy(className="placeholder")
	WebElement uname;
	@FindBy(id="idSIButton9")
	WebElement next;
@BeforeTest
public void launch(){
System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://login.live.com");
}
@Test
public void login(){

uname.sendKeys("mani");
next.click();
}
}