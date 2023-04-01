import java.util.List;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class MyTests extends SetUps{

	@Test(invocationCount=5)
	public void currencyTest() {
		
		String [] myWebsiteLanguage = {"https://www.almosafer.com/en","https://almosafer.com/ar"};		
		Random rand = new Random();
		int RandomNumber= rand.nextInt(0,2);
		driver.get(myWebsiteLanguage[RandomNumber]); 	
		WebElement currency  = driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[1]/div[2]/div/div[1]/div/button"));
	    String DefaultCurrency= currency.getText();
		myAssertion.assertEquals(DefaultCurrency, "SAR");
        myAssertion.assertAll();
	}
	
	
	@Test(invocationCount=5)
	public void FooterPictureTest() {
		
		String [] myWebsiteLanguage = {"https://www.almosafer.com/en","https://almosafer.com/ar"};		
		Random rand = new Random();
		int RandomNumber= rand.nextInt(0,2);
		driver.get(myWebsiteLanguage[RandomNumber]); 		
		boolean logoPresent = driver.findElement(By.className("sc-bdVaJa")).isDisplayed();
		myAssertion.assertEquals(logoPresent, true);
		
		//Alternative(add library):  Assert.isTrue(logoPresent);
	}
	
}
