package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SampleSteps {

    @Given("^Googleトップページを開いてるとき$")
    public void Googleトップページを開いてるとき() throws Throwable {
        open("https://www.google.co.jp/");
    }

    @When("^検索窓に\"([^\"]*)\"と入力しENTERキーを押す$")
    public void 検索窓に_と入力しENTERキーを押す(String keyword) throws Throwable {
        $("input[type=text]").val(keyword).pressEnter();
    }

    @When("^続いてSelenideの公式ページのリンクをクリックすると$")
    public void 続いてSelenideの公式ページのリンクをクリックすると() throws Throwable {
        $(byText("Selenide: concise UI tests in Java")).click();
    }

    @Then("^Selenideの公式ページに遷移する$")
    public void Selenideの公式ページに遷移する() throws Throwable {
        $("body").shouldHave(text("What is Selenide?"));
    }
}
