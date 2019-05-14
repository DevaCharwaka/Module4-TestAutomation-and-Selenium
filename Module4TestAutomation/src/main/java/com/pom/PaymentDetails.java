package com.pom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentDetails {
	WebDriver driver;

	public PaymentDetails(WebDriver driver) {
		this.driver = driver;
	}
	
	//getting the names from the payment details webpage of the respective input fields
	//and assigning it to some variables
	
	By cardHolderName=By.name("txtFN");
	By debitCardNo=By.name("debit");
	By cvvNumber=By.name("cvv");
	By cardExpiryMonth=By.name("month");
	By cardExpiryYear=By.name("year");
	
	public void giveCardHolderName() {  //Sending the value of Card holder Name in the Webpage
		driver.findElement(cardHolderName).sendKeys("Deva");
	}
	
	public void giveDebitCardNo() { //Sending the value of debit card number in the Webpage
		driver.findElement(debitCardNo).sendKeys("4212856");
	}
	
	public void giveCvvNumber() { //Sending the value of give cvv number in the Webpage
		driver.findElement(cvvNumber).sendKeys("072");
	}
	
	public void giveCardExpiryMonth() { //Sending the value of card expiry month in the Webpage
		driver.findElement(cardExpiryMonth).sendKeys("January");
	}
	
	public void giveCardExpiryYear() { //Sending the value of card expiry year in the Webpage
		driver.findElement(cardExpiryYear).sendKeys("2023");
	}
	
	public void clickNext() throws InterruptedException {
		
		// clicking on the make payment button
		driver.findElement(By.id("btnPayment")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
	}
}
