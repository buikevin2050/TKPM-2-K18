package starter.unittests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import starter.ActualResultDTO;
import starter.InMemoryMockDB;
import starter.Tich2SoService;

public class Tich2SoServiceTest {
    @Test
    @DisplayName ("Khi thực thi hàm execute")
    void testExecute() {

        //given
        //
        double num1 = 2;
        double num2 = 3;
        //
        String expectedColor = "green";

        ArrayList<Double> memoryDB = new ArrayList<>();
        InMemoryMockDB mockDB = new InMemoryMockDB(memoryDB);
        Tich2SoService tich2SoSerivce = new Tich2SoService(mockDB);
        //when
        ActualResultDTO resultDto = tich2SoSerivce.execute(num1, num2);

        //then
        assertEquals(6, resultDto.actualResult);
        assertEquals(true, resultDto.actualStore);
        ///?????????????????
        assertEquals(expectedColor, presentModel.actualColor);
        assertEquals("07/10/2026", presentModel.current_day_vn);


    }
}
