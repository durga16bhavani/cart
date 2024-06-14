package cart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CatsCategoryPage {
     WebDriver driver;
     
     By product1=By.xpath("//a[normalize-space()='FL-DSH-01']");
     By product2=By.xpath("//a[normalize-space()='FL-DLH-02']");
     
     public CatsCategoryPage(WebDriver driver) {
   	  this.driver=driver;
     }
     
     public void selectProduct1() {
   	  driver.findElement(product1).click();
     }
     public void selectProduct2() {
   	  driver.findElement(product2).click();
     }

}
