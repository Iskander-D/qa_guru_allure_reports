import com.codeborne.selenide.Condition;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;

public class SelenideTest {
    @Test
    @DisplayName("Проверка Issue (Allure Framework c Listener) ")
    @Owner("Aleksandr Drozenko")
    @Story("Проверка Issue ")
    public void testIssueSearch() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        open("https://github.com");
        $("span.flex-1").click();
        $("#query-builder-test").sendKeys("allure-framework/allure2");
        $("#query-builder-test").submit();
        $(linkText("allure-framework/allure2")).click();
        $("#issues-tab").click();
        $(withText("Issue")).should(Condition.exist);
    }
}
