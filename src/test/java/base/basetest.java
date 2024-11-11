package base;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.testng.annotations.BeforeTest;

public class basetest {
    protected Playwright playwright;
    protected Browser browser;
    protected Page page;

    @BeforeTest
    public void setup(){
         playwright = Playwright.create();
         browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
         page = browser.newPage();
         page.navigate("https://automationexercise.com/login");

    }
}
