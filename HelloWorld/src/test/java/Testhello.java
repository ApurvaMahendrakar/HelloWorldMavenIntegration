import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testhello {
  
	@Test
	public void print() {
		
		System.out.println("hii from pom project");
		System.setProperty("webdriver.chrome.driver", "C://browserdrivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
	}
}
