package starter.unittests;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import starter.ActualResultDTO;
import starter.Tich2SoService;

public class Tich2SoServiceTest {
    @Test
    @DisplayName ("Khi thực thi hàm execute")
    void testExecute() {

        //given
        //
        double num1 = 2;
        double num2 = 3;
        Tich2SoService tich2SoSerivce = new Tich2SoService();
        //when
        ActualResultDTO resultDto = tich2SoSerivce.execute(num1, num2);

        //then
        assertEquals(6, resultDto.actualResult);

    }
}
