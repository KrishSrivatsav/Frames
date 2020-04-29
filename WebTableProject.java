package Table;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebTableProject {

	public static void main(String[] args) throws InterruptedException {
		// Selenium Project Web Table
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/WebTable.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Row 1
		
		//Click on the edit button..
		WebElement btnEdit1 = driver.findElement(By.cssSelector("div:nth-child(1) > div > div.ui-grid-cell.ng-scope.ui-grid-coluiGrid-000B > user-click-select > div:nth-child(1) > button"));		
		//For Double Click We have to use Actions Method..
		Actions action1 = new Actions(driver);
		//action is the object name given here so that the method is to perform double click() for the object..
		action1.moveToElement(btnEdit1).doubleClick().build().perform();
		
		//Now it will load all the elements using input tag..and then traverse it from one to another..
		List<WebElement> inputboxes1 = driver.findElements(By.tagName("input"));
		//To get the size of the elements use .size()..
		System.out.println("Number of Elements in row1 :" +inputboxes1.size());
		
		//Foreach loop to iterate all the elements in the list..
		for(WebElement value1: inputboxes1) {
			//it will give all the values of the first row of the dynamic table..
			System.out.println(value1.getAttribute("value"));
			//Store it in a string..
			String str1 = value1.getAttribute("value");
			
			//To change the email id use if condition..
			if(str1.equals("anilkumar@gmail.com")) { //Checking email id..
				value1.clear();
				value1.sendKeys("krish@gmail.com"); //change the email id..
				Thread.sleep(1000);
				System.out.println("Print the current value:" +str1);
				continue;
			}
			if(str1.equals("aaa")) { //Checking name..
				value1.clear();
				value1.sendKeys("krish"); //change the name..
				Thread.sleep(1000);
				System.out.println("Print the current value:" +str1);
				continue;
			}
			if(str1.equals("bbb")) { //Checking Last name..
				value1.clear();
				value1.sendKeys("Srivatsav"); //change the Last name..
				Thread.sleep(1000);
				System.out.println("Print the current value:" +str1);
				continue;
			}
			if(str1.equals("9708485431")) { //Checking num..
				value1.clear();
				value1.sendKeys("9988776655"); //change the num..
				Thread.sleep(1000);
				System.out.println("Print the current value:" +str1);
				break;
			}
			
		}
		//Save Button..
//		WebElement Save1 = driver.findElement(By.cssSelector("div:nth-child(1) > div > div.ui-grid-cell.ng-scope.ui-grid-coluiGrid-000B > user-click-select > div:nth-child(2) > save-click > button[type=\"button\"]"));
//		Save1.click();
		//Cancel Button..
		WebElement Cancel1 = driver.findElement(By.cssSelector("div:nth-child(1) > div > div.ui-grid-cell.ng-scope.ui-grid-coluiGrid-000B > user-click-select > div:nth-child(2) > cancel-click > button[type=\"button\"]"));
		Cancel1.click();
		
		
		//Row4
		
		
		WebElement btnEdit4 = driver.findElement(By.xpath("(//*[@class='fa fa-pencil'])[4]"));
		
		Actions action4 = new Actions(driver);
		action4.moveToElement(btnEdit4).doubleClick().build().perform();
		
		List<WebElement> inputboxes4 = driver.findElements(By.tagName("input"));
		System.out.println("number of elements :" +inputboxes4.size());
		
		for(WebElement value4: inputboxes4) {
			//it will give all the values of the first row of the dynamic table..
			System.out.println(value4.getAttribute("value"));
			//Store it in a string..
			String str4 = value4.getAttribute("value");
			
			if(str4.equals("a")) {
				value4.clear();
				value4.sendKeys("naveen");
				Thread.sleep(1000);
				break;
			}
		}
		
		WebElement Cancel4 = driver.findElement(By.xpath("(//*[@class='btn btn-danger'])[4]"));
		Cancel4.click();
		Thread.sleep(1000);
		
		//Right Click..
		WebElement element = driver.findElement(By.xpath("(//*[@class='fa fa-trash-o '])[4]"));
		Actions RightClick = new Actions(driver);
		action1.contextClick(element).build().perform(); 
		Thread.sleep(1000);
		
		//Delete Button..
		driver.findElement(By.xpath("(//button[text()='Delete'])[4]")).click();
		
		
		//Alert..
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		
		//Close
		driver.close();
		
		
		//Row 5
//		
//		WebElement btnEdit5 = driver.findElement(By.xpath("(//*[@class='fa fa-pencil'])[5]"));
//		
//		Actions action5 =new Actions(driver);
//		action5.moveToElement(btnEdit5).doubleClick().build().perform();
//		
//		List<WebElement> inputboxes5 = driver.findElements(By.tagName("input"));
//		System.out.println("Number of elements:" +inputboxes5.size());
//		
//		for(WebElement value5 : inputboxes5) {
//			System.out.println(value5.getAttribute("value"));
//			String str5 = value5.getAttribute("value");
//			
//			if(str5.equals("Vaibhav")) {
//				value5.clear();
//				value5.sendKeys("Divya");
//				Thread.sleep(1000);
//				break;
//				
//			}
//		}
		
//		WebElement Cancel5 = driver.findElement(By.xpath("(//*[@class='btn btn-danger'])[5]"));
//		Cancel5.click();
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
