package signupNegCase;
import java.util.List;
import java.util.UUID;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class signupNegCase {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	
		
		driver.get("http://automationpractice.com/index.php");
		System.out.println(driver.getTitle());
		driver.findElement(By.className("login")).click();
		
		driver.findElement(By.id("email_create")).sendKeys("selimovicta@gmail.com");
		
		driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]")).click();
		
		List<WebElement> dynamicElement = driver.findElements(By.id("create_account_error"));
		if(dynamicElement.size() != 0){
		 //If list size is non-zero, element is present
		 System.out.println("Error element present- The test failed");
		}
		else{
		 //Else if size is 0, then element is not present
		 System.out.println("Element not present");
		}

	}

}
