package aNZ_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Calculator_pom{
    public WebDriver driver;
	@FindBy(xpath = "(//label[@class='btn'])[1]")
	private WebElement single_button;

	

	public Calculator_pom(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	
	public WebElement getSingle_button() {
		return single_button;
	}

	@FindBy(xpath = "//select[@title='Number of dependants']")  
	private WebElement nod;

	public WebElement getNod() {
		return nod;
	}

	@FindBy(xpath = "(//label[@class='btn'])[3]")
	private WebElement home_live;

	public WebElement getHome_live() {
		return home_live;
	}

	@FindBy(xpath = "(//input[@value='0'])[1]")
	private WebElement with_income;

	public WebElement getWith_income() {
		return with_income;
	}

	@FindBy(xpath = "(//input[@value='0'])[2]")
	private WebElement other_income;

	public WebElement getOther_income() {
		return other_income;
	}

	@FindBy(id = "expenses")
	private WebElement monthly_expenses;

	public WebElement getmonthly_expenses() {
		return monthly_expenses;
	}

	@FindBy(id = "homeloans")
	private WebElement current_homeloan;

	public WebElement getCurrent_homeloan() {
		return current_homeloan;
	}

	@FindBy(id = "otherloans")
	private WebElement otherloan_rep;

	public WebElement getOtherloan_rep() {
		return otherloan_rep;
	}

	@FindBy(xpath = "(//input[@value='0'])[8]")
	private WebElement other_commitments;

	public WebElement getOther_commitments() {
		return other_commitments;
	}

	@FindBy(id = "credit")
	private WebElement credit_card;

	public WebElement getCredit_card() {
		return credit_card;
	}

	@FindBy(id = "btnBorrowCalculater")
	private WebElement b_estimate;

	public WebElement getb_estimate() {
		return b_estimate;
	}

	@FindBy(xpath = "(//button[@class='start-over'])[1]")
	private WebElement start_over;

	public WebElement getStart_over() {
		return start_over;
	}

}
