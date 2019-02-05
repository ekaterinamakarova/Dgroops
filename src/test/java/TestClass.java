import Pages.Initial;
import Pages.Main;
import Pages.SignIn;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass {
    private ChromeDriver driver;
    private String baseUrl = "__________________";


    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(CapabilityType.PAGE_LOAD_STRATEGY, "normal");
        options.addArguments("start-maximized");
        options.addArguments("--no-sandbox");
        driver = new ChromeDriver(options);
        driver.get(baseUrl);
    }
    @Test (description = "Login with credentials" )
    public void loginTest() {
        Initial initial = new Initial(driver);
        SignIn signIn= new SignIn(driver);
        initial.toSignPage();
        signIn.signin("______", "_________");
    }

    @Test(dependsOnMethods = {"loginTest"}, description = "Checking of the Main page")
    public void checkingTest() throws InterruptedException {
        Main mainpage = new Main(driver);
        mainpage.checking();
    }

    @AfterTest
    public void exit(){
        driver.quit();
    }


}
