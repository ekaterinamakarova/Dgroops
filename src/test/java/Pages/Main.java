package Pages;

import org.junit.Assert;
import org.openqa.selenium.*;

import java.util.List;

public class Main {

    WebDriver driver;
    public  Main(WebDriver driver){
        this.driver=driver;
    }

    private By card = By.cssSelector("main [id] ");
    private By headline = By.cssSelector("main [id] h1");
    private By hint=By.cssSelector("main [id] p");


    public void checking() throws InterruptedException {
        Thread.sleep(1000);
        List<WebElement> cards = driver.findElements(card);
        Assert.assertEquals(7, cards.size());
        List<WebElement> titles = driver.findElements(headline);
        Assert.assertEquals(7,titles.size());
        Assert.assertEquals("Create Group",titles.get(0).getText());
        Assert.assertEquals("Manage Groups",titles.get(1).getText());
        Assert.assertEquals("Partners",titles.get(2).getText());
        Assert.assertEquals("Chat Center",titles.get(3).getText());
        Assert.assertEquals("Calendar Notes",titles.get(4).getText());
        Assert.assertEquals("Special Offers",titles.get(5).getText());
        Assert.assertEquals("Search Hotels",titles.get(6).getText());
        List<WebElement> hints = driver.findElements(hint);
        Assert.assertEquals(7, hints.size() );
        Assert.assertEquals("Create new request for a travel group",hints.get(0).getText());
        Assert.assertEquals("Access to the details of your active groups",hints.get(1).getText());
        Assert.assertEquals("Access to your contact details",hints.get(2).getText());
        Assert.assertEquals("Stay in contact with your partners",hints.get(3).getText());
        Assert.assertEquals("View your groups schedule and pin your daily tasks",hints.get(4).getText());
        Assert.assertEquals("View your groups schedule and pin your daily tasks",hints.get(5).getText());
        Assert.assertEquals("Search and compare offers from hotels",hints.get(6).getText());
        }


}



