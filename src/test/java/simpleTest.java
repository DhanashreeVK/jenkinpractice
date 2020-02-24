import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class simpleTest
{
	@Test
	public void sample()
	{
//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http:/google.com");
		String tittle=driver.getTitle();
		System.out.println("Tittle of the page is "+tittle);
		driver.close();

	}

}
