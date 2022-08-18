package qaautomation.Tugas4.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckOutOverviewPage extends BasePage{

	public CheckOutOverviewPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
	}
	
	By checkOverviewText = By.xpath("//span[@class='title']");
	By checkOutFinishBtn = By.xpath("//button[@id='finish']");
				
	
	public String getOverviewText() {
		return getText(checkOverviewText);
	}
	
	public void checkOutAfterOverview() {
		clickAndWait(checkOutFinishBtn);
	}

}
