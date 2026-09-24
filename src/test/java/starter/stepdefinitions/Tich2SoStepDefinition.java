package starter.stepdefinitions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.Tich2SoService;

public class Tich2SoStepDefinition {

    double actual_20;
    @Given ("tèo nhập số 4 và số 5")
    public void teo_nhap_so_4_va_so_5 () {
        double num1 = 4;
        double num2 = 5;
        Tich2SoService tich2SoService = new Tich2SoService();
        actual_20 = tich2SoService.timTich2So(num1, num2);
    }


    @When ("tèo thực hiện nhân 2 số")
    public void teo_thuc_hien_nhan_2_so () {
        Tich2SoService tich2SoService = new Tich2SoService();
        actual_20 = tich2SoService.timTich2So(num1, num2);
    }


    @Then ("tèo được thông báo là 20")
    public void teo_duoc_thong_bao_ket_qua () {
        int expected_20 = 20;
        int actual_20 = 4 * 5;
        assertEquals(expected_20, actual_20);
    }

}
