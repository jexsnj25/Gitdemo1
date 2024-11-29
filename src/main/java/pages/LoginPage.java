package pages;

import com.microsoft.playwright.Page;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class LoginPage {
    Page page;

    public LoginPage(Page page) {
        this.page = page;

    }

    public void navigatetoSignupPage() {
        page.locator("p.fc-button-label").first().click();
        page.locator("[href='/login']").click();
        assertThat(page.getByPlaceholder("Name")).isVisible();

    }

    public void enterUsername(String username) {
        page.getByPlaceholder("Name").fill(username);
    }

    public void enterEmail(String email) {
        page.locator("[data-qa='signup-email']").fill(email);

    }

    public void clickonSignUpButton() {
        page.locator("[data-qa='signup-button']").click();
        // this is a test
        //This is a test
        //To test push
        // To test branching
        // hello

    }

    public void clickonSignUpButton1() {
        page.locator("[data-qa='signup-button']").click();
        // this is a test
        //This is a test
        //To test push
        // To test branching
        // hello

    }

    public void clickonSignUpButton2() {
        page.locator("[data-qa='signup-button']").click();
        // this is a test
        //This is a test
        //To test push
        // To test branching
        // hello

    }
}
