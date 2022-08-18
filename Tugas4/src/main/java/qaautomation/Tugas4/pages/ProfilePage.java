package qaautomation.Tugas4.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProfilePage extends BasePage {
	
	

	public ProfilePage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
	}
	
	By profileText = By.xpath("//span[@class='title']");
	By productName = By.id("item_4_title_link");
	By productName2 = By.id("item_1_title_link");
	By addProductBtn = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
	By addProductBtn2 = By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']");
	By seeCartBtn = By.xpath("//a[@class='shopping_cart_link']");
	By burgerMenu = By.xpath("//button[@id='react-burger-menu-btn']");
	By logOut = By.xpath("//a[@id='logout_sidebar_link']");

			
	
	public String getProfileText() {
		return getText(profileText);
	}
	
	
	public void addToCart1() {
		findElements(productName);
		clickAndWait(addProductBtn);
		
	}
	
	public void addToCart2() {
		findElements(productName2);
		clickAndWait(addProductBtn2);
	}
	
	public void seeCart() {
		clickAndWait(seeCartBtn);
	}
	
	public void menu() {
		clickAndWait(burgerMenu);
	}
	
	public void logOut() {
		clickAndWait(logOut);
	}

}
