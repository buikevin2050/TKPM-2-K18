package starter;

import java.util.ArrayList;

public class InMemoryMockDB implements  StoreAble{
    private ArrayList<Double> memoryDB;
    public InMemoryMockDB(ArrayList<Double> memoryDB){
        this.memoryDB = memoryDB;
    }

    @Override
    public boolean save(double actualResult) {
        boolean actualStore =  memoryDB.add(actualResult);
        return  actualStore;
    }

}
