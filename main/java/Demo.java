import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
    public static void main(String[] args) {
        ChromeDriver dr = new ChromeDriver();
        GoogleSearch gs = new GoogleSearch(dr);
        gs.search("java");

    }
}
