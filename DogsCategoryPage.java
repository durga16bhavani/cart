package cart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DogsCategoryPage {
	WebDriver driver;
    
    By product1=By.xpath("//a[normalize-space()='K9-BD-01']");
    By product2=By.xpath("//a[normalize-space()='K9-PO-02']");
    By product3=By.xpath("//a[normalize-space()='K9-DL-01']");
    By product4=By.xpath("//a[normalize-space()='K9-RT-01']");
    By product5=By.xpath("//a[normalize-space()='K9-RT-02']");
    By product6=By.xpath("//a[normalize-space()='K9-CW-01']");
    
    public DogsCategoryPage(WebDriver driver) {
  	  this.driver=driver;
    }
    
    public void selectProduct1() {
  	  driver.findElement(product1).click();
    }
    public void selectProduct2() {
  	  driver.findElement(product2).click();
    }
    public void selectProduct3() {
  	  driver.findElement(product3).click();
    }
    public void selectProduct4() {
  	  driver.findElement(product4).click();
    }
    public void selectProduct5() {
    	  driver.findElement(product4).click();
    }
    public void selectProduct6() {
    	  driver.findElement(product4).click();
    }

}
