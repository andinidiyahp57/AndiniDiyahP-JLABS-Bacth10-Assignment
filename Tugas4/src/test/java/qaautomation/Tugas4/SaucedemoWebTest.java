package qaautomation.Tugas4;

import org.testng.Assert;
import org.testng.annotations.Test;

import qaautomation.Tugas4.pages.CartPage;
import qaautomation.Tugas4.pages.CheckOutCompletePage;
import qaautomation.Tugas4.pages.CheckOutOverviewPage;
import qaautomation.Tugas4.pages.CheckOutPage;
import qaautomation.Tugas4.pages.LoginPage;
import qaautomation.Tugas4.pages.ProfilePage;

public class SaucedemoWebTest extends BaseWebTest{
	
	LoginPage loginPage = new LoginPage(driver, explicitWait);
	ProfilePage profilePage = new ProfilePage(driver, explicitWait);
	CartPage cartPage = new CartPage(driver, explicitWait);
	CheckOutPage checkOutPage = new CheckOutPage(driver, explicitWait);
	CheckOutOverviewPage checkOutOverview = new CheckOutOverviewPage (driver, explicitWait);
	CheckOutCompletePage checkOutCompletePage = new CheckOutCompletePage (driver, explicitWait);
	
	@Test
	public void buyInSaucedemo(){
		
		String username = "standard_user";
		String password = "secret_sauce";
		driver.get().get("https://www.saucedemo.com/");
		loginPage.inputUsername(username);
		loginPage.inputPassword(password);
		loginPage.clickLoginButton();
		String actualText = profilePage.getProfileText();
		String expectedText = "PRODUCTS";
			
		Assert.assertTrue(actualText.contains(expectedText));
		
		profilePage.addToCart1();
		profilePage.addToCart2();
		profilePage.seeCart();
		String actualText2 = cartPage.getCartText();
		String expectedText2 = "CART";
		Assert.assertTrue(actualText2.contains(expectedText2));
		
		cartPage.checkOut();
		String actualText3 = checkOutPage.getCheckOutText();
		String expectedText3 = "INFORMATION";
		Assert.assertTrue(actualText3.contains(expectedText3));
		
		String firstname = "susi";
		String lastname = "dui";
		String postalcode = "1111";
		checkOutPage.inputFirstName(firstname);
		checkOutPage.inputLastName(lastname);
		checkOutPage.inputPostalCode(postalcode);
		checkOutPage.checkOutAfterFillDataPerson();
		String actualText4 = checkOutOverview.getOverviewText();
		String expectedText4 = "OVERVIEW";
		Assert.assertTrue(actualText4.contains(expectedText4));
		
		checkOutOverview.checkOutAfterOverview();
		String actualText5 = checkOutCompletePage.getCompleteText();
		String expectedText5 = "COMPLETE";
		Assert.assertTrue(actualText5.contains(expectedText5));
		
		checkOutCompletePage.backToHomeBtn();
		profilePage.menu();
		profilePage.logOut();
		
	}

}
