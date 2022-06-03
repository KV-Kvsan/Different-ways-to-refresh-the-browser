package Refresh;

import org.openqa.selenium.chrome.ChromeDriver;

public class differentwaystorefresh {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/");
		Thread.sleep(2000);
		//driver.navigate().refresh();
		//driver.get(driver.getCurrentUrl());
		//driver.navigate().to(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.close();
		
		
		
	}

}
