package login;
import java.util.UUID;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class login {

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

		String signupHeading2 = driver.findElement(By.className("page-heading")).getText();
		System.out.println("You have logged in!- test passed-----" + signupHeading2);
		
	}

}
