package cart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BirdsCategoryPage {
	WebDriver driver;
    
    By product1=By.xpath("//a[normalize-space()='AV-CB-01']");
    By product2=By.xpath("//a[normalize-space()='AV-SB-02']");
    
    public BirdsCategoryPage(WebDriver driver) {
  	  this.driver=driver;
    }
    
    public void selectProduct1() {
  	  driver.findElement(product1).click();
    }
    public void selectProduct2() {
  	  driver.findElement(product2).click();
    }
}
