package selenium_project;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import com_baseclass.Base_class;

public class automation_runner extends Base_class {
	public static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {
		browserLaunch("chrome");
		getUrl("http://automationpractice.com/");
		Thread.sleep(5000);
		WebElement signin1 = driver.findElement(By.xpath("//a[@class = 'login']"));
		onClick(signin1);
		WebElement id = driver.findElement(By.xpath("//input[@id = 'email']"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,300);");
		id.sendKeys("sangeethasangee87@gmail.com");
		WebElement pwd = driver.findElement(By.xpath("//input[@id = 'passwd']"));
		pwd.sendKeys("sangeetha");
		WebElement login = driver.findElement(By.id("SubmitLogin"));
		login.click();
		WebElement Tshirts = driver.findElement(By.xpath("(//a[text() = 'T-shirts'])[2]"));
		Tshirts.click();
		jse.executeScript("window.scrollBy(0,700);");
		Actions ac = new Actions(driver);
		WebElement image = driver.findElement(By.xpath("//img[@itemprop = 'image']"));
		ac.moveToElement(image).build().perform();
		WebElement view = driver.findElement(By.linkText("Quick view"));
		ac.click(view).build().perform();
		WebElement frame = driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(frame);
		WebElement drop = driver.findElement(By.xpath("//select[@name='group_1']"));
		Select s = new Select(drop);
		s.selectByVisibleText("L");
		driver.findElement(By.id("color_14")).click();
		driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		WebElement checkout = driver.findElement(By.linkText("Proceed to checkout"));
		ac.moveToElement(checkout).build().perform();
		ac.click(checkout).build().perform();
		jse.executeScript("window.scrollBy(0,700);");
		WebElement p_checkout = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		p_checkout.click();
		jse.executeScript("window.scrollBy(0,700);");
		WebElement p_address = driver.findElement(By.xpath("//button[@name='processAddress']"));
		p_address.click();
		jse.executeScript("window.scrollBy(0,500);");
		driver.findElement(By.xpath("//div[@class='checker']")).click();
		driver.findElement(By.name("processCarrier")).click();
		jse.executeScript("window.scrollBy(0,700);");
		driver.findElement(By.xpath("//a[@title='Pay by check.']")).click();
		jse.executeScript("window.scrollBy(0,500);");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		jse.executeScript("window.scrollBy(0,500);");
		driver.findElement(By.xpath("//a[@title='Back to orders']")).click();
		jse.executeScript("window.scrollBy(0,300);");
		TakesScreenshot pic = (TakesScreenshot) driver;
		File src = pic.getScreenshotAs(OutputType.FILE);
		File des = new File("H:\\eclipse\\Java_Program\\screenshot\\autommation.png");
		FileHandler.copy(src, des);
	}
}

//