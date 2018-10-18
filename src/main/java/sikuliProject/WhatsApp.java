package sikuliProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Key;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class WhatsApp {
	@Test

	   public void whatsApp() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\maverick\\Downloads\\driver\\chromedriver_win32_3\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get("https://web.whatsapp.com/");
		Thread.sleep(10000);
		Screen s=new Screen();
		Pattern wclick=new Pattern("C:\\Users\\maverick\\Desktop\\image\\whatsup\\dazy.JPG");
		s.wait(wclick,2000);
		s.click(wclick);
		Thread.sleep(5000);
		for(int i=0;i<=10;i++) {
		driver.findElement(By.xpath("//div[contains(text(),'Type a message')]")).sendKeys("hello",Keys.ENTER);
		
		}

	}

}
