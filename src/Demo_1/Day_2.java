package Demo_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Day_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();

		driver.get("https://demoqa.com/books");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//div[@class=\"header-text\"])[2] ")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Practice Form']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@class=\" mr-sm-2 form-control\"])[1]")).sendKeys("Vikas");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@class=\" mr-sm-2 form-control\"])[2]")).sendKeys("Kale");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id=\"userEmail\"]")).sendKeys("vikaskale9892@gmail.com");
		Thread.sleep(2000);
		
		WebElement radio=driver.findElement(By.xpath("(//label[@class=\"custom-control-label\"])[1]  "));
		radio.click();
		
		driver.findElement(By.xpath("//input[@id=\"userNumber\"] ")).sendKeys("9168996994");
		Thread.sleep(2000);
	}

}
