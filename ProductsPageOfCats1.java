package cart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPageOfCats1 {
	  WebDriver driver;
	  By item1=By.xpath("//tbody/tr[2]/td[5]/a[1]");
	  By item2=By.xpath("//tbody/tr[3]/td[5]/a[1]");
	  
	  public ProductsPageOfCats1(WebDriver driver) {
		  this.driver=driver;
	  }
	  
	  public void addItem1() {
		  driver.findElement(item1).click();
	  }
	  public void addItem2() {
		  driver.findElement(item2).click();
	  }
}
