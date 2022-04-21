package contactUs;
import java.util.UUID;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class contactUs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	
		
		driver.get("http://automationpractice.com/index.php");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("contact-link")).click();

		WebElement option = driver.findElement(By.id("id_contact"));
		Select selectoption = new Select (option);
		selectoption.selectByValue("1");
		
		driver.findElement(By.id("email")).sendKeys("selimovicta@gmail.com");
		driver.findElement(By.id("id_order")).sendKeys("Order number #23456");
		
		driver.findElement(By.id("message")).sendKeys("Hope the senior reviewing this task is having a good day!");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.id("submitMessage")).click();
		System.out.println(driver.getTitle());
		
	}

}
