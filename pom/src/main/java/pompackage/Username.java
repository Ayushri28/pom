package pompackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Username {
	
	
	WebDriver driver;
	By emailid=(By.xpath("//input[@class='whsOnd zHQkBf']"));
	By next = By.xpath("//span[contains(text(),'Next')]");
   public Username(WebDriver driver) {
            this.driver=driver;
	}
	public void EnterEmail(String name) {
		driver.findElement(emailid).sendKeys(name);
		driver.findElement(next).click();
	}


}
