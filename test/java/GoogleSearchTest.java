import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class GoogleSearchTest {

    private GoogleSearch gs = new GoogleSearch(new ChromeDriver());

    @Test
    public void testLoadPage() {
        Assert.assertEquals(gs.getDriver().getCurrentUrl(), "https://www.google.com/");
    }

    @Test(dependsOnMethods = "testLoadPage")
    public void searchTest() {
        String searchedText = "Java";
        gs.search(searchedText);
        String actuallySearchedText = gs.getDriver().findElement(By.name("q")).getAttribute("value");
        Assert.assertEquals(searchedText, actuallySearchedText);
    }
}
