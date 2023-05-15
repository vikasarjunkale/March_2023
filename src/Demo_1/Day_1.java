package Demo_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.openqa.selenium.JavascriptExecutor;


public class Day_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();

		driver.get("https://demoqa.com/books");
		driver.manage().window().maximize();

		//		driver.findElement(By.xpath("//input[@class=\"form-control\"]")).sendKeys("Git Pocket Guide");
		//		driver.findElement(By.xpath("//span[@class=\"input-group-text\"]")).click();
		//		Thread.sleep(2000);

		List<WebElement> Books= driver.findElements(By.xpath("//div[@class=\"rt-tbody\"]/div/div/div[2]"));

		System.out.println(Books.size());

		for(WebElement web : Books) {

			String text=web.getText();
			System.out.println(text);
		}

		List<WebElement> Author= driver.findElements(By.xpath("//div[@class=\"rt-tbody\"]/div/div/div[3]"));

		System.out.println(Author.size());

		for(WebElement web : Author) {

			String text1=web.getText();
			System.out.println(text1);
		}
		
		driver.findElement(By.xpath("//span[@class=\"pr-1\"][1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Text Box']")).click();
		Thread.sleep(2000);
		
		WebElement Actualtext= driver.findElement(By.xpath("//label[text()='Full Name']"));
		String Expectedtext ="Full Name";
		Assert.assertEquals(true, Actualtext.isDisplayed());
		System.out.println("Actualtext is displayed – Assert passed");
		
		driver.findElement(By.xpath("//input[@id=\"userName\"]")).sendKeys("Vikas Kale");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id=\"userEmail\"]")).sendKeys("vikaskale9892@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//textarea[@id=\"currentAddress\"]")).sendKeys("A/P- Hingani-Berdi.\nTal-Daund, Dist-Pune.\n Pin-413801.");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//textarea[@id=\"permanentAddress\"]")).sendKeys("A/P- Hingani-Berdi.\nTal-Daund, Dist-Pune.\n Pin-413801.");
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		
		WebElement click=driver.findElement(By.xpath("//button[@id=\"submit\"]"));
		click.click();
		
		
		
		//		driver.quit();


	}

}
