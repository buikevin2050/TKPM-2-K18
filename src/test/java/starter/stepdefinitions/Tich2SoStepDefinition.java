package starter.stepdefinitions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.v6.IOMemory;
import starter.v6.MultiFlowControl;
import starter.v6.Multiplication;
import starter.v6.UI;

public class Tich2SoStepDefinition {
    private final TestUI testUI = new TestUI();
    private final IOMemory ioMemory = new IOMemory();
    private final MultiFlowControl multiFlowControl =
            new MultiFlowControl(new Multiplication(), testUI, ioMemory);
    private int num1;
    private int num2;
    private long actualResult;

    @Given("Tôi có hai số {int} và {int}")
    public void toi_co_hai_so(int number1, int number2) {
        num1 = number1;
        num2 = number2;
    }

    @When("Tôi thực hiện phép nhân")
    public void toi_thuc_hien_phep_nhan() {
        actualResult = multiFlowControl.execute(num1, num2);
    }

    @Then("Kết quả là {long}")
    public void ket_qua_la(long expectedResult) {
        assertEquals(expectedResult, actualResult);
        assertEquals(expectedResult, testUI.getDisplayedResult());
        assertNotNull(LocalDate.parse(testUI.getFormattedDate(),
                DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }

    @Then("Màu nền là {string} và màu chữ là {string}")
    public void mau_nen_va_mau_chu(String expectedBackground, String expectedTextColor) {
        assertEquals(expectedBackground, testUI.getBackgroundColor());
        assertEquals(expectedTextColor, testUI.getTextColor());
        assertEquals(actualResult, testUI.getDisplayedResult());
    }

    @Then("Kết quả {long} đã được lưu trong bộ nhớ")
    public void ket_qua_da_duoc_luu(long expectedResult) {
        assertEquals(expectedResult, actualResult);
        assertEquals(true, ioMemory.contains(expectedResult));
    }

    private static class TestUI implements UI {
        private String backgroundColor;
        private String textColor;
        private String formattedDate;
        private long displayedResult;

        @Override
        public void displayResult(long result, String background, String text, String date) {
            displayedResult = result;
            backgroundColor = background;
            textColor = text;
            formattedDate = date;
        }

        private String getBackgroundColor() {
            return backgroundColor;
        }

        private String getTextColor() {
            return textColor;
        }

        private String getFormattedDate() {
            return formattedDate;
        }

        private long getDisplayedResult() {
            return displayedResult;
        }
    }
}
