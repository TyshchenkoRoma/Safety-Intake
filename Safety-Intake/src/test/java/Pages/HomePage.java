package Pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

public class HomePage {

    private By sourceDocStatusReview = By.cssSelector("h1[title='Source Document Status Review']");
    private By recentRecords = By.cssSelector("span[title='Recent Records']");
    private By chatter = By.cssSelector("div.slds-card-wrapper.forceChatterFeedInner");
    private By caseCandidatsList = By.cssSelector(".slds-card.slds-p-around--medium.cCaseCandidatesList");

    public boolean isSourseDocStatusReviewPresent() {
        switchTo().frame($("iframe"));

        return $(sourceDocStatusReview).isDisplayed();
    }

    public boolean isChaterPresent() {

        return isElementPresent(chatter);
    }

    public boolean isRecentRecordPresent() {

        return isElementPresent(recentRecords);
    }

    public boolean isCaseCandidatsListPresent() {

       return isElementPresent(caseCandidatsList);
    }

    private boolean isElementPresent (By cssSelector) {
        $(cssSelector).scrollTo();

        return $(cssSelector).isDisplayed();
    }
}
