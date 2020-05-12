package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) {
		//Frames
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		//Using Frames Concept...
		
		//Switching to frames..
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		
		//Drag and Drop...
		Actions act = new Actions(driver);
		
		//dragging id..
		WebElement Source = driver.findElement(By.id("draggable"));
		
		//droping id..
		WebElement target = driver.findElement(By.id("droppable"));
		
		//Dragging and dropping..
		act.dragAndDrop(Source, target).build().perform();
		
		//Back to webpage Default content...
		driver.switchTo().defaultContent();
		
		//Clicking on the Accept Button..
		WebElement Accept = driver.findElement(By.xpath("//*[text()='Accept']"));
		Accept.click();
		
	}

}
