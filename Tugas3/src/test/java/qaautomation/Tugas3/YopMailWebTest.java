package qaautomation.Tugas3;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class YopMailWebTest extends BaseWebTest{
	
	@Test
	public void testEmailLogin() {
				
		driver.get().get("https://yopmail.com");
		
		//to get size of frames
		//if in this step that makes the program failure, thats because the web must complete the captcha
		int size = driver.get().findElements(By.tagName("iframe")).size();
	    System.out.println("Total Frames --" + size);
		
	    //this is the user name sendkeys
		driver.get().findElement(By.xpath("//input[@id='login']")).sendKeys("ali");
		
		//to click the button
		driver.get().findElement(By.xpath("//i[@class='material-icons-outlined f36']")).click();
		
		//driver switch to frame
	    driver.get().switchTo().frame(driver.get().findElement(By.id("ifinbox")));
	    //to click the inbox mail
		driver.get().findElement(By.xpath("//button[@class='lm']")).click();
		
		//to assert user is in the inbox
		String actualText = driver.get().findElement(By.xpath("//div[@class='mday']")).getText();
		String expectedText = "today";
		Assert.assertTrue(actualText.contains(expectedText));
		
		//to return to the parrent frame
	    driver.get().switchTo().parentFrame();
	 	    
	    // Switching the Outer Frame 
	    driver.get().switchTo().frame(driver.get().findElement(By.id("ifmail")));
	    
	    // Syso the content of mail
	    //if in this step that makes the program failure, thats because the web must complete the captcha
	    System.out.println(driver.get().findElement(By.xpath("//main[@class='yscrollbar']")).getText());
	    //driver.switchTo().defaultContent();
	    
	}

}
