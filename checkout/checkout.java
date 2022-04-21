package checkout;
import java.awt.AWTException;
import java.awt.Robot;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class checkout {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	
		
		driver.get("http://automationpractice.com/index.php");
		System.out.println(driver.getTitle());
		
		
		driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[2]/div[2]/a[1]")).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Actions actions = new Actions(driver);

		Robot robot = new Robot();

		robot.mouseMove(70,70);

		actions.click().build().perform();

		robot.mouseMove(260,190);

		actions.click().build().perform();
		
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]")).click();
		
		driver.findElement(By.className("login")).click();
		driver.findElement(By.id("email")).sendKeys("selimovicta@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("tariktask1");
		driver.findElement(By.id("SubmitLogin")).click();
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]")).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//*[@id=\"ordermsg\"]/textarea")).sendKeys("Hope the senior reviewing this task is having a good day!");
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button")).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.id("cgv")).click();
		driver.findElement(By.xpath("//*[@id=\"form\"]/p/button")).click();
		
		driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/p/a")).click();
		
		System.out.println(driver.getTitle());
		System.out.println("Checkout process has been completed");
	}

}
