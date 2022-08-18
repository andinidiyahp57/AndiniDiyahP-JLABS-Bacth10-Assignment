package qaautomation.Tugas4.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage extends BasePage{

	public CartPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
	}
	
	
	By cartText = By.xpath("//span[@class='title']");
	By checkOutBtn = By.xpath("//button[@id='checkout']");
				
	
	public String getCartText() {
		return getText(cartText);
	}
	
	public void checkOut() {
		clickAndWait(checkOutBtn);
	}

}
