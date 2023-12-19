import gov.uk.check.visa.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VisaConfirmationTest {
    @Given("I am on start page")
    public void iAmOnStartPage() {
        new StartPage().clickStartNow();

    }

    @When("Click on start button")
    public void clickOnStartButton() {
        new StartPage().clickStartNow();
    }

    @And("Select a Nationality {string}")
    public void selectANationalityAustralia(String nationality){
        new SelectNationalityPage().selectNationality(nationality);
    }

    @And("Click on Continue button")
    public void clickOnContinueButton() {
        new SelectNationalityPage().clickOnContinueButton();
    }

    @And("Select reason {string}")
    public void selectReasonTourismOrVisitingFamilyAndFriends(String reason) {
        new ReasonForTravelPage().selectReasonOption(reason);
    }

    @Then("verify result {string}")
    public void verifyResultYouWillNotNeedAVisaToComeToTheUK(String visa) {
        new WorkTypePage().selectWorkType(visa);
    }

    @And("Select intendent to stay for longer than {int} months")
    public void selectIntendentToStayForLongerThanMonths(int arg0) {
        new DurationOfStayPage().selectLengthOfStay("");

    }

    @And("Select have planning to work for {string}")
    public void selectHavePlanningToWorkForHealthAndCareProfessional(String worktype) {
        new WorkTypePage().selectWorkType(worktype);
    }

    @And("Select state My partner of family member have uk immigration status {string}")
    public void selectStateMyPartnerOfFamilyMemberHaveUkImmigrationStatusYes(String option) {
        new FamilyImmigrationStatusPage().selectImmigrationStatus(option);
    }
}
