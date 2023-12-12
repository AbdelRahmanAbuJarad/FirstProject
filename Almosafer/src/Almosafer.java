
public class Almosafer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class AlmosaferAutomation {

		    public static void main(String[] args) {
		        
		        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

		        
		        WebDriver driver = new ChromeDriver();

		        
		        String url = "https://www.almosafer.com/en";
		        driver.get(url);

		        
		        
		        WebElement languageElement = driver.findElement(By.xpath("//button[@data-testid='language-selector-trigger']"));
		        assert languageElement.getText().equals("EN") : "Default language is not EN";

		        
		        WebElement currencyElement = driver.findElement(By.xpath("//button[@data-testid='currency-selector-trigger']"));
		        assert currencyElement.getText().equals("SAR") : "Default currency is not SAR";

		        
		        
		        WebElement contactNumbersElement = driver.findElement(By.xpath("//div[@class='contact-numbers']"));
		        

		       
		        WebElement qitafLogoElement = driver.findElement(By.xpath("//footer//img[@alt='qitaf']"));
		        assert qitafLogoElement.isDisplayed() : "qitaf logo is not displayed in the footer";

		        
		        driver.quit();
		    }
		}


	}

}
