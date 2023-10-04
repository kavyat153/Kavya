package marathon;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys");
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']")).click();
		String result = driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[1]")).getText();
		System.out.println("Total num of result:"+result);
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[5]")).click();
		driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
		driver.findElement(By.xpath("(//a[@class='a-dropdown-link'])[4]")).click();
		Thread.sleep(500);
        String bag = driver.findElement(By.xpath("//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']/span")).getText();
    	System.out.println("Bag Info:"+bag);
    	String title = driver.getTitle();
    	String actual="Amazon.in: Bags For Boys - FUR JADEN Or Skybags: Bags, Wallets And Luggage";
    	System.out.println(title);
    	if(title.equals(actual)) {
    		System.out.println("Login success");
    	}else {
    		System.out.println("Login unsuccess");
    	}
	}

}
