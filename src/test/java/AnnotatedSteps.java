

import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AnnotatedSteps {
    private static final String REPOSITORY = "allure-framework/allure2";



    @Test
    @DisplayName("Проверка Issue (Allure Framework c Annotated Steps) ")
    @Owner("Aleksandr Drozenko")
    @Story("Проверка Issue ")
    @Severity(SeverityLevel.CRITICAL)
    public void annotatedStepsTest(){
        WebSteps steps = new WebSteps();
        steps.openMainPage();
        steps.searchForRepository(REPOSITORY);
        steps.clickOnRepositoryLink(REPOSITORY);
        steps.openTabIssues();
        steps.shouldSeeIssuer();
    }
}
