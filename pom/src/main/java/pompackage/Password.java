package pompackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Password {
	
	WebDriver driver;
	By pass=(By.xpath("//input[@name='password']"));
		public Password(WebDriver driver) {
			this.driver=driver;
		}

		public void enterpassword(String password) {
			driver.findElement(pass).sendKeys(password);

			
		}


}
