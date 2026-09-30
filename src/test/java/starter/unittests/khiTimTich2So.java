package starter.unittests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import starter.Tich2SoService;

@DisplayName ("Khi tìm tích 2 số")
public class KhiTimTich2So {
    //đặc tả cho phương thức timTich2So() của class Tich2SoService
    @Test 
    @DisplayName ("trả về kết quả là 20")
    public void tim_tich_2_so(){
        //Given
        double num1 = 4;
        double num2 = 5;
        Tich2SoService tich2SoService = new Tich2SoService();

        //When
       double actualResult = tich2SoService.timTich2So(num1, num2);
        //Then
       assertEquals(20, actualResult);
        


    }
}
