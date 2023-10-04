package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.ajio.com/shop/sale?gclid=EAIaIQobChMIu62mx5bFgQMVOw97Bx1-wAd4EAAYASAAEgJoYvD_BwE");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags");
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[@class='rilrtl-button']/span")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
		WebElement element = driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']"));
		driver.executeScript("arguments[0].click();", element);
		String text = driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println("Num of bags:"+text);
		System.out.println("Brands:");
		List<WebElement> brands = driver.findElements(By.xpath("//div[@class='brand']"));
		List<String> list=new ArrayList<String>();
	     for (WebElement data : brands) {
	    	 String text1=data.getText();
	    	 System.out.println(text1);
	    	 list.add(text1);
	}
	     System.out.println("_________________________________");
	     System.out.println("Names:");
	     List<WebElement> names = driver.findElements(By.xpath("//div[@class='nameCls']"));
			List<String> list1=new ArrayList<String>();
		     for (WebElement data : names) {
		    	 String text2=data.getText();
		    	 System.out.println(text2);
		    	 list1.add(text2);

}
}
}
