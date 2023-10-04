package week3.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeastPrice {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones");
		Thread.sleep(500);
		driver.findElement(By.xpath("(//div[text()='phones'])[2]")).click();
		List<WebElement> phones = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		int size=phones.size();
		System.out.println("Total num of phones:"+size);
		List<Integer> list=new ArrayList<Integer>();
	     for (WebElement data : phones) {
	    	 String text=data.getText();
	    	 String price =text.replaceAll("[^0-9]", "");
	    	 int mobile= Integer.parseInt(price);
	    	 list.add(mobile);
			
		}
	     
	     Collections.sort(list);
	     System.out.println(list);
	     System.out.println("LestPrice:"+list.get(0));
	     
			
		}
		
	

}
