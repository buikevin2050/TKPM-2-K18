package starter.unittests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import starter.InMemoryMockDB;

public class InMemoryMockDBTest {
    @Test
    void testSave() {
        //Given
        double actualResult = 20;
        ArrayList<Double> memoryDB = new ArrayList<>();//size = 0
        //memoryDB.size();//size 0

        InMemoryMockDB mockDB = new InMemoryMockDB(memoryDB);
        //When
        boolean actualStore = mockDB.save(actualResult);

        //then
        assertEquals(true, actualStore);
        assertEquals(1 /*size of MemoryDB*/, memoryDB.size());

    }

    
}
