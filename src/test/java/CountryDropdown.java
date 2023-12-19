import gov.uk.check.visa.pages.StartPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class CountryDropdown {
    @Given("I am on home page")
    public void iAmOnHomePage() {
        new CountryDropdown().iClickOnStartButton();

    }

    @When("I click on start button")
    public void iClickOnStartButton() {
        new StartPage().clickStartNow();
    }

    @Then("I can see following country into dropdown")
    public void iCanSeeFollowingCountryIntoDropdown(DataTable country) {
        List<List<String>> countryList = country.asLists(String.class);
        for (List<String> list : countryList) {
            System.out.println(list);
        }

    }
}