package pompackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {
	
	WebDriver driver;
	
	Username ob1;

	Password ob2;
		
	//NewPage objNewPage;
	 
	 @Test

	  public void login() {
		
	  ob1=new Username(driver);
		 
	 ob1.EnterEmail("shrivastavaayushi28@gmail.com");
		
	 //objNewPage=new NewPage(driver);
		
	  //objNewPage.ChangePage();
		
	 ob2=new Password(driver);
		
	 ob2.enterpassword("asdfghjk");
	 
	 }
	 
	 

	 @BeforeTest

	  public void setup() {
			
	 String path = "C:\\Users\\M1046899\\Downloads\\chromedriver_win32 (3)"
	 		+ "\\chromedriver.exe";
			
	 System.setProperty("webdriver.chrome.driver", path);
			
	 driver = new ChromeDriver();
			
	driver.get("https://www.gmail.com");
		
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  }
	 

}
