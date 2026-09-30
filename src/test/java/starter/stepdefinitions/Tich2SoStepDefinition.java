package starter.stepdefinitions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.Tich2SoService;

public class Tich2SoStepDefinition {
    double actualResult;
    double num1 , num2;
    @Given ("tèo có 2 số {num1} và {num2}")
    public void teo_co_2_so(double number1, double number2){
        num1 = number1;
        num2 = number2;
    }


    @ParameterType (".*")
    public double num1(String str)
    {
        return Double.parseDouble(str.trim());
    }


    @ParameterType (".*")
    public double num2(String str)
    {
        return Double.parseDouble(str);
    }

    @When ("tèo thực hiện nhân 2 số")
    public void teo_nhan_2_so(){
        //code
        Tich2SoService tich2SoService = new Tich2SoService();
        actualResult = tich2SoService.timTich2So(num1, num2);
    }

    @Then ("tèo được thông báo là {result}")
    public void teo_duoc_thong_bao_ket_qua(double expectedResult){
        assertEquals(expectedResult, actualResult);


    }

    @ParameterType (".*")
    public double result(String str)
    {
        return Double.parseDouble(str.trim());
    }


}
