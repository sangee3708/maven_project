package adactin_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Adactin_login_page {
	@FindBy(name = ("username"))
	private WebElement username;
	public WebDriver driver;

	public Adactin_login_page(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getUsername() {
		return username;
	}
	
	@FindBy(name = ("password"))
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}
	
	@FindBy(name = ("login"))
	private WebElement login_button;

	public WebElement getLogin_button() {
		return login_button;
	}
	
	
	
}
