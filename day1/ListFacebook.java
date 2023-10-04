package week3.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ListFacebook {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		List<WebElement> tags = driver.findElements(By.tagName("a"));
		int size=tags.size();
		System.out.println("Total num of 'a' Tags:"+size);
		//for (int i = 0; i < size; i++) {
			//System.out.println(tags.get(i).getText());
		//}
     List<String> list=new ArrayList<String>();
     for (WebElement data : tags) {
    	 String text=data.getText();
    	 System.out.println(text);
    	 list.add(text);
		
	}
     
     Collections.sort(list);
     System.out.println(list);
	}

}
