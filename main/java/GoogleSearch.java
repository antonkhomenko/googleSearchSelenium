import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class GoogleSearch {
   WebDriver driver;
   String url = "https://www.google.com";
   GoogleSearch(WebDriver driver) {
       PageFactory.initElements(driver, this);
       this.driver = driver;
       this.driver.get(url);
       //this.driver.manage().window().maximize();
   }

   @FindBy(name = "q")
   private WebElement searchLine;


   @FindBy(className = "gNO89b")
   private WebElement searchBtn;

   public void search(String s) {
        searchLine.sendKeys(s);
        searchBtn.submit();
   }

   public WebDriver getDriver() {
       return driver;
   }
}
