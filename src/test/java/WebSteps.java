import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;

public class WebSteps {

    @Step ("Открываем главную страницу GitHub")
    public void openMainPage() {
        open("https://github.com");
    }

    @Step("Ищем репозиторий {REPOSITORY}")
    public void searchForRepository(String REPOSITORY) {
        $("span.flex-1").click();
        $("#query-builder-test").sendKeys(REPOSITORY);
        $("#query-builder-test").submit();
    }

    @Step("Клик по ссылке репозитория {REPOSITORY}")
    public void clickOnRepositoryLink(String REPOSITORY) {
        $(linkText(REPOSITORY)).click();
    }

    @Step ("Открываем таб Issues")
    public void openTabIssues() {
        $("#issues-tab").click();
    }

    @Step("Проверяем наличие Issue")
    public void shouldSeeIssuer() {
        $(withText("Issue" )).should(Condition.exist);
    }

}


