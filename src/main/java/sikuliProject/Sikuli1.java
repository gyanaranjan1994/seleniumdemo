package sikuliProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Key;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class Sikuli1 {
	@Test
	public void sikuliTest() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\maverick\\Downloads\\driver\\chromedriver_win32_3\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.youtube.com/watch?v=IJq0yyWug1k");
		Screen s=new Screen();
		Pattern setting=new Pattern("C:\\Users\\maverick\\Desktop\\image\\setting.jpg");
		s.wait(setting,2000);
		s.click(setting);
		Pattern quality=new Pattern("C:\\Users\\maverick\\Desktop\\image\\quality.JPG");
		s.wait(quality,2000);
		s.click(quality);
		Pattern pixcel=new Pattern("C:\\Users\\maverick\\Desktop\\image\\pixcel.JPG");
		s.wait(pixcel,2000);
		s.click(pixcel);
		/*Pattern maximize=new Pattern("C:\\Users\\maverick\\Desktop\\image\\maximize.JPG");
		s.wait(maximize,2000);
		s.click(maximize);*/
		Pattern mutue=new Pattern("C:\\Users\\maverick\\Desktop\\image\\mute.JPG");
		s.wait(mutue,2000);
		s.click(mutue);
		Pattern pattern= new Pattern("C:\\Users\\maverick\\Desktop\\image\\image.JPG");
		s.wait(pattern,2000);
		s.click(pattern);
		Pattern songlink= new Pattern("C:\\Users\\maverick\\Desktop\\image\\songlink.JPG");
		s.wait(songlink,2000);
		s.click(songlink);
		Pattern unmute= new Pattern("C:\\Users\\maverick\\Desktop\\image\\unmute.JPG");
		s.wait(unmute,2000);
		s.click(unmute);
		Pattern play= new Pattern("C:\\Users\\maverick\\Desktop\\image\\play.JPG");
		s.wait(play,2000);
		s.click(play);
		/*Pattern search= new Pattern("C:\\Users\\maverick\\Desktop\\image\\search.JPG");
		s.wait(search,2000);
		s.type(search,"hindi songs");
		s.type(Key.ENTER);*/
		
		
		
		
	}

}
