package marathon;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class Abhibus {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.abhibus.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("bus-link")).click();
		driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("Chennai");
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Bangalore");
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
	    driver.findElement(By.xpath("//a[text()='Today']")).click();
		String name = driver.findElement(By.xpath("//h5[text()='Yolo Bus']")).getText();
		System.out.println("Bus name:"+name);
		//driver.findElement(By.xpath("//a[@class='btn  outlined tertiary sm inactive button'][4]")).click();
		String seat = driver.findElement(By.xpath("(//small[text()='17'])[1]")).getText();
		System.out.println("Num of seats:"+seat);
		driver.findElement(By.xpath("(//button[text()='Show Seats'])[1]")).click();
	    driver.findElement(By.xpath("(//button[@class='seat horizontal'])[1]")).click();
		driver.findElement(By.xpath("(//input[@class='primary  '])[4]")).click();
		driver.findElement(By.xpath("(//input[@class='primary  '])[2]")).click();
	    String Seat = driver.findElement(By.xpath("(//div[@id='seating-selected-seat-details']/span)[1]")).getText();
		System.out.println(Seat);
		String fare = driver.findElement(By.xpath("(//div[@id='seating-selected-seat-details']/span)[2]")).getText();
		System.out.println(fare);
		
		//driver.close();

	}

}
