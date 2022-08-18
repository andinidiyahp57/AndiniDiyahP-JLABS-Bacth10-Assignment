package qaautomation.Tugas4.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckOutPage extends BasePage{

	public CheckOutPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
	}
	
	
	By checkOutText = By.xpath("//span[@class='title']");
	By checkOutBtn2 = By.xpath("//input[@id='continue']");
	By firstName = By.xpath("//input[@id='first-name']");
	By lastName = By.xpath("//input[@id='last-name']");
	By postalCode = By.xpath("//input[@id='postal-code']");
				
	
	public String getCheckOutText() {
		return getText(checkOutText);
	}
	
	public void inputFirstName(String fn) {
		setText(firstName,fn);
	}
	
	public void inputLastName(String ln) {
		setText(lastName,ln);
	}
	
	public void inputPostalCode(String pc) {
		setText(postalCode,pc);
	}
		
	public void checkOutAfterFillDataPerson() {
		clickAndWait(checkOutBtn2);
	}

}
