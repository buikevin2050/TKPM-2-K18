package starter.unittests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import starter.Tich2SoService;

@DisplayName("Đặc tả cho phương thức timTich2So của class Tich2SoService")
public class khiTimTich2So {
    // đặc tả cho phương thức timTich2So của class Tich2SoService
    @Test
    @DisplayName("Khi tìm tích 2 số, thì kết quả trả về là tích của 2 số đó")
    public void khiTimTich2So() {
        //given
        double num1 = 4;
        double num2 = 5;
        Tich2SoService tich2SoService = new Tich2SoService();


        //when
        double actual_20 = tich2SoService.timTich2So(num1, num2);
        


        //then
        assertEquals(20, actual_20);
}
