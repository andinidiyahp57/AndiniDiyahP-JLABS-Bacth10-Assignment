package qaautomation.Tugas4.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckOutCompletePage extends BasePage{

	public CheckOutCompletePage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
	}
	
	By completeText = By.xpath("//span[@class='title']");	
	By toHomeBtn = By.xpath("//button[@id='back-to-products']");
	
	public String getCompleteText() {
		return getText(completeText);
	}
	
	public void backToHomeBtn() {
		clickAndWait(toHomeBtn);
	}

}
