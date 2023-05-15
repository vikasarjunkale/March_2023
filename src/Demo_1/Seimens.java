package Demo_1;

import java.util.concurrent.TimeUnit;
import java.util.*;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seimens {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();

		driver.get("https://www.siemens.com/global/en.html");
		driver.manage().window().maximize();
		
		





	}

}
