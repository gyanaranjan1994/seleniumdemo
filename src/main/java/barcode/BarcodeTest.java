package barcode;

import java.awt.image.BufferedImage;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

public class BarcodeTest {
	@Test
	public void barCodeTest() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\maverick\\Downloads\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://barcode.tec-it.com/en");
		String barcodeImage =driver.findElement(By.xpath("//img[@alt='Barcode']")).getAttribute("src");
		System.out.println(barcodeImage);
		 URL url=new URL(barcodeImage);
		 BufferedImage bufferedImage=ImageIO.read(url);
		 LuminanceSource luminanceSource=new BufferedImageLuminanceSource(bufferedImage);
		 BinaryBitmap binaryBitmap=new BinaryBitmap(new HybridBinarizer(luminanceSource));
		 Result result=new MultiFormatReader().decode(binaryBitmap);
		 System.out.println(result.getText());
	}

}
