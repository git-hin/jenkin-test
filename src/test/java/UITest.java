package mavenforjenkins;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;	
import org.openqa.selenium.support.ui.Select;
	

public class UITest {
	public static void main(String[] args) throws InterruptedException {
	
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\jithi\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 		WebDriver driver = new ChromeDriver();
	 		
	 		driver.manage().window().maximize();
	
	 		driver.navigate().to("http://demo.guru99.com/test/newtours/register.php");
	 		driver.findElement(By.name("firstName")).sendKeys("Robert");
	 		Thread.sleep(2000);
	 		
	 		driver.findElement(By.name("lastName")).sendKeys("De Niro");
	 		Thread.sleep(2000);
	 		driver.findElement(By.name("phone")).sendKeys("9999999999");
	 		Thread.sleep(2000);
	 		driver.findElement(By.id("userName")).sendKeys("xyz@gmail.com");
	 		Thread.sleep(2000);
	 		driver.findElement(By.name("address1")).sendKeys("Baker Street 221 B");
	 		Thread.sleep(2000);
	 		driver.findElement(By.name("city")).sendKeys("London");
	 		Thread.sleep(2000);
	 		driver.findElement(By.name("state")).sendKeys("Yorkeshire");
	 		Thread.sleep(2000);

	 		driver.findElement(By.name("postalCode")).sendKeys("456123");
	 		Thread.sleep(2000);
	 		
	 		Select country=new Select(driver.findElement(By.name("country")));
	 		country.selectByValue("UNITED KINGDOM");
	 		Thread.sleep(2000);
	 		
	 		driver.findElement(By.id("email")).sendKeys("xyz@gmail.com");
	 		Thread.sleep(2000);
	 		driver.findElement(By.name("password")).sendKeys("password");
	 		Thread.sleep(2000);
	 		driver.findElement(By.name("confirmPassword")).sendKeys("password");
	 		Thread.sleep(2000);
	 		driver.findElement(By.name("submit")).click();
	 		Thread.sleep(2000);
	 		
	 		System.out.println("Validation Complete");
	 		
	 		
	 		
	 		driver.close();
	 		
	 		
	 		
	 		
	 	
	 		
	 	
	
	}
}
