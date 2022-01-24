package com;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import aNZ_pom.Calculator_pom;
import com_baseclass.Base_class;

public class ANZ extends Base_class {
	public static WebDriver driver;

	public static void main(String[] args) throws Throwable {
		driver = browserLaunch("chrome");
		getUrl("https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,400)");
		Calculator_pom calPage = new Calculator_pom(driver);
		onClick(calPage.getSingle_button());

		dropDown(calPage.getNod(), "0");

		onClick(calPage.getHome_live());

		passValue(calPage.getWith_income(), "80,000");

		passValue(calPage.getOther_income(), "10,000");

		passValue(calPage.getmonthly_expenses(), "500");

		passValue(calPage.getCurrent_homeloan(), "0");

		passValue(calPage.getOtherloan_rep(), "100");
		passValue(calPage.getOther_commitments(), "0");
		passValue(calPage.getCredit_card(), "10,000");
		onClick(calPage.getb_estimate());
		jse.executeScript("window.scrollBy(0,400)");
		Thread.sleep(5000);
		//
		onClick(calPage.getStart_over());
		passValue(calPage.getmonthly_expenses(), "1");
		onClick(calPage.getb_estimate());

	}
}
