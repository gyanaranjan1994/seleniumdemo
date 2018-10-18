package selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class HtmlUnitDrivetest {
	@Test
	public void unitDrive()
	{
		WebDriver htmlDriver=new HtmlUnitDriver();
		htmlDriver.get("https://www.facebook.com/");
		htmlDriver.getTitle();
	}

}
