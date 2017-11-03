package mvnpractice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.*;

import mvnpractice.WebdriverListner;
public class Wdlpractice {

	//private WebDriver driver;
	private EventFiringWebDriver e_driver;
	private WebdriverListner eventListener;
	private WebDriverWait wait;
	private String appURL = "http://www.google.com";
	public int waitTime = 10;
	private String headerText = "One account. All of Google.";
	private String errMessage = "The email and password you entered don't match.";

	@BeforeClass()
	public void setUp() {

		// Initializing instance of Firefox WebDriver
		System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		wait = new WebDriverWait(driver, waitTime);

		// Initializing EventFiringWebDriver using Firefox WebDriver instance
		e_driver = new EventFiringWebDriver(driver);

		// Now create object of EventListerHandler to register it with EventFiringWebDriver
		eventListener = new WebdriverListner();

		e_driver.register(eventListener);
	
		//e_driver.manage().window().maximize();
		e_driver.get(appURL);
	}

	@Test
	public void testEventsONE() {
		System.out.println("***** Executing Test ONE ***** ");
		e_driver.findElement(By.linkText("Gmail")).click();
		P1.m1("make");
		String pageHeaderText = e_driver.findElement(By.tagName("h1")).getText();
		Assert.assertTrue(pageHeaderText.equalsIgnoreCase(headerText));
	}

	@Test
	public void testEventsTWO()  {
		System.out.println("***** Executing Test Two ***** ");
		//Entering user name and clicking on next
		e_driver.findElement(By.id("Email")).sendKeys("pmk344@gmail.com");
		e_driver.findElement(By.id("next")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Passwd")));
		//Entering password and clicking on sign-in
		e_driver.findElement(By.id("Passwd")).sendKeys("mani03");
		e_driver.findElement(By.id("signIn")).click();
		
		//Get the error message and validate it
		String pageHeaderText = e_driver.findElement(By.id("errormsg_0_Passwd")).getText();
		Assert.assertTrue(pageHeaderText.equalsIgnoreCase(errMessage));
	}

	@AfterClass()
	public void tearDown() {
		if (e_driver != null) {
			e_driver.quit();
		}
	}

		 
		
	}


