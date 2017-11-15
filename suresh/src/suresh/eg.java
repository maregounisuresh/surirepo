package suresh;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class eg {

	public static void main(String[] args) {
		
				System.out.println("hello");
				FirefoxDriver driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.get("https://gmail.com");
				WebElement textBox = driver.findElement(By.id("Email"));
				textBox.sendKeys("sg35522");
				

	}

}
