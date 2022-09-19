import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rejin.raveendran\\Downloads\\chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		LandingPage lp = new LandingPage(driver);
		lp.goTo();
		lp.SignUpApplication("Rejin","Ravi","bbc@gmail.com","dhoni","01/01/2000","7777777777","hala");
		

	}

}
