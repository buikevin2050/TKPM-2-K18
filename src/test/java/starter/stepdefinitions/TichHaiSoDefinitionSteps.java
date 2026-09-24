package starter.stepdefinitions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.Tich2SoService;

//glue code
public class TichHaiSoDefinitionSteps {
    double proposedResult;
    @When ("tèo thực hiện nhân 2 số")
    public void teo_thuc_hien_nhan_2_so(){
        Tich2SoService tich2SoService = new Tich2SoService();
        proposedResult =  tich2SoService.timTich2So();
    }

    @Then ("tèo được thông báo là {expectedResult}")
    public void teo_duoc_thong_bao_ket_qua(double expectedResult)
    {
        assertEquals(expectedResult,proposedResult);
    }

    @ParameterType (".*")
    public double expectedResult(String str)
    {
        return Double.parseDouble(str);
    }

}
