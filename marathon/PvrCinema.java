package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PvrCinema {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='nav-icon']")).click();
		driver.findElement(By.xpath("//a[@class='ng-star-inserted']")).click();
		WebElement City = driver.findElement(By.name("city"));
		Select opt1=new Select(City);
		opt1.selectByValue("Chennai");
		Thread.sleep(500);
		WebElement genre = driver.findElement(By.name("genre"));
		Select opt2=new Select(genre);
		opt2.selectByVisibleText("ANIMATION");
		Thread.sleep(500);
		WebElement langu = driver.findElement(By.name("lang"));
		Select opt3=new Select(langu);
		opt3.selectByVisibleText("ENGLISH");
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		Thread.sleep(500);
		WebElement movie = driver.findElement(By.xpath("(//div[@class='movie-wrapper ng-star-inserted'])[1]"));
		driver.executeScript("arguments[0].click();", movie);
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
		WebElement name = driver.findElement(By.id("cinemaName"));
		Select opt4=new Select(name);
		opt4.selectByVisibleText("PVR Heritage RSL ECR Chennai");
		Thread.sleep(500);
		WebElement date = driver.findElement(By.xpath("//div[@class='datepicker-container datepicker-default']/input"));
		driver.executeScript("arguments[0].click();", date);
		Thread.sleep(500);
		driver.findElement(By.xpath("(//span[@class='day-unit ng-star-inserted'])[2]")).click();
		WebElement time = driver.findElement(By.name("timings"));
		Select opt5=new Select(time);
		opt5.selectByVisibleText("09:00 AM - 12:00 PM");
		driver.findElement(By.xpath("(//div[@class='form-group col-sm-6 input-list']/input)[3]")).sendKeys("1");
		driver.findElement(By.xpath("(//div[@class='form-group col-sm-6 input-list']/input)[4]")).sendKeys("Kavya");
		driver.findElement(By.xpath("(//div[@class='form-group col-sm-6 input-list']/input)[5]")).sendKeys("kavya15@gmail.com");
		driver.findElement(By.xpath("(//div[@class='form-group col-sm-6 input-list']/input)[6]")).sendKeys("8220662277");
		Thread.sleep(500);
		WebElement Food = driver.findElement(By.name("food"));
		Select opt6=new Select(Food);
		opt6.selectByVisibleText("Yes");
		driver.findElement(By.xpath("(//div[@class='form-group col-sm-6 input-list']/input)[7]")).sendKeys("No");
		Thread.sleep(500);
		WebElement copy = driver.findElement(By.xpath("(//div[@class='form-group col-sm-6']//span)[1]"));
		driver.executeScript("arguments[0].click();", copy);
		driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();
		Thread.sleep(5000);
		WebElement cancel = driver.findElement(By.xpath("(//button[text()='CANCEL'])[2]"));
		driver.executeScript("arguments[0].click();", cancel);
		String title = driver.getTitle();
		String actual= "Movie Library";
		System.out.println(title);
		if(title.equals(actual)){
		System.out.println("Ticket Booked");
		} else {
			System.out.println("Ticket not Booked");
		}
		
		

	}

}
