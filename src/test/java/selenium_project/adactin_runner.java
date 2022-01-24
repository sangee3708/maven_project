package selenium_project;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import adactin_pom.Adactin_login_page;

public class adactin_runner extends  {
	public static WebDriver driver;

	public static void main(String[] args) throws Throwable {
		browserLaunch("chrome");
		getUrl("https://adactinhotelapp.com/");
		Adactin_login_page login = new Adactin_login_page(driver);
		login.getUsername();
		passValue(login.getUsername(), "sangee3708");
		login.getPassword();
		passValue(login.getUsername(), "sangee23");
		onClick(login.getLogin_button());
//		WebElement location = d.findElement(By.name("location"));
//		Select dd_location = new Select(location);
//		dd_location.selectByVisibleText("London");
//		WebElement hotels = d.findElement(By.name("hotels"));
//		Select dd_hotels = new Select(hotels);
//		dd_hotels.selectByVisibleText("Hotel Sunshine");
//		WebElement room_type = d.findElement(By.name("room_type"));
//		Select dd_roomtype = new Select(room_type);
//		dd_roomtype.selectByVisibleText("Super Deluxe");
//		WebElement no_rooms = d.findElement(By.name("room_nos"));
//		Select dd_rooms = new Select(no_rooms);
//		dd_rooms.selectByVisibleText("1 - One");
//		WebElement checkin_date = d.findElement(By.name("datepick_in"));
//		checkin_date.clear();
//		checkin_date.sendKeys("19/02/2022");
//		WebElement checkout_date = d.findElement(By.name("datepick_out"));
//		checkout_date.clear();
//		checkout_date.sendKeys("22/02/2022");
//		WebElement per_room = d.findElement(By.name("adult_room"));
//		Select dd_adults = new Select(per_room);
//		dd_adults.selectByVisibleText("2 - Two");
//		WebElement child_room = d.findElement(By.name("child_room"));
//		Select dd_child = new Select(child_room);
//		dd_child.selectByVisibleText("1 - One");
//		WebElement search = d.findElement(By.name("Submit"));
//		search.click();
//		WebElement select_hotel = d.findElement(By.name("radiobutton_0"));
//		select_hotel.click();
//		WebElement continue_button = d.findElement(By.name("continue"));
//		continue_button.click();
//		WebElement first_name = d.findElement(By.id("first_name"));
//		first_name.sendKeys("sangeetha");
//		WebElement last_name = d.findElement(By.id("last_name"));
//		last_name.sendKeys("A");
//		WebElement address = d.findElement(By.xpath("//textarea[@rows='4']"));
//		address.sendKeys("ABCD");
//		WebElement cc_num = d.findElement(By.xpath("(//input[@class='reg_input'])[3]"));
//		cc_num.sendKeys("3333333333333333");
//		WebElement cc_type = d.findElement(By.xpath("//select[@class='select_combobox']"));
//		Select dd_cc_type = new Select(cc_type);
//		dd_cc_type.selectByVisibleText("Master Card");
//		WebElement exp_month = d.findElement(By.name("cc_exp_month"));
//		Select dd_exp_month = new Select(exp_month);
//		dd_exp_month.selectByVisibleText("February");
//		WebElement exp_year = d.findElement(By.name("cc_exp_year"));
//		Select dd_exp_year = new Select(exp_year);
//		dd_exp_year.selectByVisibleText("2022");
//		WebElement ccv_num = d.findElement(By.id("cc_cvv"));
//		ccv_num.sendKeys("236");
//		WebElement book_now = d.findElement(By.id("book_now"));
//		book_now.click();
//		Thread.sleep(5000);
//		WebElement my_itinerary = d.findElement(By.name("my_itinerary"));
//		my_itinerary.click();
//		TakesScreenshot pic = (TakesScreenshot) d;
//		File src = pic.getScreenshotAs(OutputType.FILE);
//		File des = new File("H:\\eclipse\\Java_Program\\screenshot\\adactin.png");
//		FileHandler.copy(src, des);
	}
}
