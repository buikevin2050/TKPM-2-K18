package starter.unittests;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import starter.Tich2SoService;

@DisplayName ("khi tèo thực hiện nhân 2 số")
public class KhiThucHienNhan2So {
    @Test 
    @DisplayName ("thông báo kết quả cho tèo")
    public  void nhan_hai_so(){
        //Given
        double num1 = 4;
        double num2 = 5;
        Tich2SoService tich2SoService = new Tich2SoService();

        //When
         double proposedResult = tich2SoService.timTich2So(num1, num2);
        //Then
        org.assertj.core.api.Assertions.assertThat(20.0)
        .isEqualTo(proposedResult);
       

    }

}
