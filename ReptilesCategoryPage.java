package cart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReptilesCategoryPage {
	 WebDriver driver;
     
     By product1=By.xpath("//a[normalize-space()='RP-SN-01']");
     By product2=By.xpath("//a[normalize-space()='RP-LI-02']");
     
     public ReptilesCategoryPage(WebDriver driver) {
   	  this.driver=driver;
     }
     
     public void selectProduct1() {
   	  driver.findElement(product1).click();
     }
     public void selectProduct2() {
   	  driver.findElement(product2).click();
     }
}
