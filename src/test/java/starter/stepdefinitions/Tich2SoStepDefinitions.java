package starter.stepdefinitions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import groovy.transform.PackageScope;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.ActualResultDTO;
import starter.InMemoryMockDB;
import starter.Tich2SoService;

public class Tich2SoStepDefinitions {
    double num1, num2;
    @Given ("tèo có 2 số {num1} và {num2}")
    public void teo_co_2_so(){

    }


    ActualResultDTO actualResultDTO;

    @When ("tèo thực hiện nhân 2 số")
    public void khi_nhan_2_so(){
        //Data transfer Object
        InMemoryMockDB inMemoryMockDB = new InMemoryMockDB();
        Tich2SoService tich2SoService = new Tich2SoService(inMemoryMockDB);
        actualResultDTO = tich2SoService.execute(num1, num2);
    }


    @Then ("tèo được thông báo là {result} {color}")
    public void duoc_thong_bao_ketqua_mau(double expectedResult, 
        String expectedColor){
        assertEquals(expectedResult, actualResultDTO.actualResult);
        assertEquals(expectedColor, actualResultDTO.actualColor);


    }

    @ParameterType (".*")
    public String color(String str){

       return str;
    }

     @ParameterType (".*")
    public double result(String str){
       return Double.parseDouble(str);
    }

    @And ("kết quả được lưu lại {store}")
    public void ket_qua_duoc_luu(boolean expectedStore){
        assertEquals(expectedStore, actualResultDTO.actualStore);
        
    }

    @ParameterType (".*")
    public boolean store(String str){
       return Boolean.parseBoolean(str);
    }

}
