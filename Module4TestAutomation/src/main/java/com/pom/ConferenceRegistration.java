package com.pom;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class ConferenceRegistration  {
	
	static WebDriver driver;
	public ConferenceRegistration(WebDriver driver) {
		this.driver=driver;
	}
	//getting the names from the Conference Registration webpage of the respective input fields
		//and assigning it to some variables
		
	
	By firstName=By.name("txtFN");
	By lastName=By.name("txtLN");
	By email=By.name("Email");
	By contactNo=By.name("Phone");
	By noOfPeople=By.name("size");
	By buildingName=By.name("Address");
	By areaName=By.name("Address2");
	By city=By.name("city");
	By state=By.name("state");
	By conferenceAccess=By.name("memberStatus");
	
	public void giveFirstName() 
	{  //Sending the first Name to the Webpage

		System.out.println(driver.getTitle());
		driver.findElement(firstName).sendKeys("Deva");
	}
	
	public void giveLastName() { //Sending the last Name to the Webpage
		driver.findElement(lastName).sendKeys("Reddy");
	}
	
	public void giveEmail() { //Sending the email to the Webpage
		driver.findElement(email).sendKeys("devareddy@gmail.com");
	}
	
	public void giveContact() { //Sending the contact no to the Webpage
		driver.findElement(contactNo).sendKeys("9542829731");
	}
	
	public void giveNoOfPeople() { //giving the value of No. of people
		//driver.findElement(noOfPeople).sendKeys("");
		Select people = new Select(driver.findElement(noOfPeople));
		people.selectByVisibleText("1");
	}
	
	public void giveBuildingName() { //Sending the building name to the Webpage
		driver.findElement(buildingName).sendKeys("Harmony Heights 202");
	}
	
	public void giveAreaName() { //Sending the area name to the Webpage
		driver.findElement(areaName).sendKeys("Secundrabad");
	}
	
	public void giveCity() { //Selecting the city by find element city
		Select city1 = new Select(driver.findElement(city));
		city1.selectByVisibleText("Hyderabad");
	}
	
	public void giveState() { //selecting the district by state
		Select state1 = new Select(driver.findElement(state));
		state1.selectByVisibleText("Telangana");
	}
	
	public void giveCconferenceAccess() { //choosing the radio button
		WebElement radio1 = driver.findElement(conferenceAccess);
		radio1.click();
	}
	
	public void clickNext() throws InterruptedException {
		driver.findElement(By.linkText("Next")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
	}
	
}

