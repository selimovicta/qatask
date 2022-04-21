package registration;
import java.util.UUID;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class signup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	
		
		driver.get("http://automationpractice.com/index.php");
		System.out.println(driver.getTitle());
		driver.findElement(By.className("login")).click();
		
		String uuid = UUID.randomUUID().toString();
		uuid = uuid.substring(0, Math.min(uuid.length(), 3));
		driver.findElement(By.id("email_create")).sendKeys("selimovicta", uuid, "@gmail.com");
		
		driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]")).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String signupHeading = driver.findElement(By.className("page-heading")).getText();
		System.out.println("First part of the Account has been created- test passed-----" + signupHeading);
		// The first part of the registration process is successful.
		
		
		WebElement nameBox = driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]"));
		nameBox.sendKeys("Tarik");
		driver.findElement(By.id("customer_lastname")).sendKeys("Selimovic");
		driver.findElement(By.id("passwd")).sendKeys("atlantBH");
		
		WebElement dayBirth = driver.findElement(By.id("days"));
		Select selectDay = new Select (dayBirth);
		selectDay.selectByValue("15");
		
		WebElement monthBirth = driver.findElement(By.id("months"));
		Select selectMonth = new Select (monthBirth);
		selectMonth.selectByValue("3");
		
		WebElement yearBirth = driver.findElement(By.id("years"));
		Select selectYear = new Select (yearBirth);
		selectYear.selectByValue("1999");
		
		WebElement usState = driver.findElement(By.name("id_state"));
		Select selectState = new Select(usState);
		selectState.selectByVisibleText("Texas");
		
		driver.findElement(By.id("address1")).sendKeys("Bosmal City Centar");
		driver.findElement(By.id("city")).sendKeys("Sarajevo");
		driver.findElement(By.id("postcode")).sendKeys("71000");
		driver.findElement(By.id("phone_mobile")).sendKeys("062855545");
		
		driver.findElement(By.id("submitAccount")).click();
		
		String signupHeading2 = driver.findElement(By.className("page-heading")).getText();
		System.out.println("Account has been created completley- test passed-----" + signupHeading2);
		// The the registration process is successful.
		
		
		
	}

}
