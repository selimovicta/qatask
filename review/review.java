package review;
import java.awt.AWTException;
import java.awt.Robot;
import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	
		
		driver.get("http://automationpractice.com/index.php");
		System.out.println(driver.getTitle());
		driver.findElement(By.className("login")).click();
		driver.findElement(By.id("email")).sendKeys("selimovicta@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("tariktask1");
		driver.findElement(By.id("SubmitLogin")).click();

		driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[1]/a/img")).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[1]/div/a[1]/img")).click();
		
		driver.findElement(By.id("new_comment_tab_btn")).click();
		driver.findElement(By.id("comment_title")).sendKeys("High quality product!");
		driver.findElement(By.id("content")).sendKeys("Really good product, great material and color.");
		
		driver.findElement(By.id("submitNewMessage")).click();
		
		List<WebElement> dynamicElement = driver.findElements(By.xpath("//*[@id=\"product\"]/div[2]/div/div/div"));
		if(dynamicElement.size() != 0){
		 //If list size is non-zero, element is present
		 System.out.println("Error element present- The test passed");
		}
		else{
		 //Else if size is 0, then element is not present
		 System.out.println("Element not present");
		}

	}

}
