package searchNegCase;
import java.awt.Robot;
import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class searchNegCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	
		
		driver.get("http://automationpractice.com/index.php");
		System.out.println(driver.getTitle());
		By locator = new ByIdOrName("search_query_top");
		WebElement searchBar = driver.findElement(locator);
		searchBar.sendKeys("boots");
		
		driver.findElement(By.name("submit_search")).click();
		
		List<WebElement> dynamicElement = driver.findElements(By.xpath("//*[@id=\"center_column\"]/p"));
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
