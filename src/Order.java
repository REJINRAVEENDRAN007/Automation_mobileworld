import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Order {
	@Test
	
	public void odr() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rejin.raveendran\\Downloads\\chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		LandingPage lp = new LandingPage(driver);
		lp.goTo();
		lp.OrderApplication("Garath ", "Bale", "bale007@gmail.com", "rrr123", "7777777777", "kunnakulam", "vazhu2",
                "Nileshwar", "36890", "1", "3");

	}

}
