package tutorialsninja.register;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_RF_002 {
	@Test
	public void validateEmail() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//span[text()='Hello, sign in']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Need help?')]")).click();
		driver.findElement(By.id("auth-fpp-link-bottom")).click();
		
		String email = "shahnawaz4automation@gmail.com";
		String appPasscode = "cpmz aupa mjbj ijsf";
		
		driver.findElement(By.id("ap_email")).sendKeys(email);
		driver.findElement(By.id("continue")).click();
	}
}
