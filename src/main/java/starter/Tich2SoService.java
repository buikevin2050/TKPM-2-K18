package starter;

public class Tich2SoService {
    private StoreAble storeAble;

    public Tich2SoService(StoreAble storeAble)
    {
        this.storeAble = storeAble;
    }

    //unit test
    public ActualResultDTO execute(double num1, double num2) {
        //hãy code như là chúng ta có tất đồ chơi ở đây
        Multiplication mulAble = new Multiplication();
        double actualResult = mulAble.multiply(num1, num2);
        
        //
        boolean actualStore = storeAble.save();
        String actualColor = colorAble.getColor();
    }

}
