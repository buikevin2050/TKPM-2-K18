package starter;

public class Tich2SoService {
    private StoreAble storeAble;
    private PresentAble presentAble;

    public Tich2SoService(StoreAble storeAble, PresentAble presentAble)
    {
        this.storeAble = storeAble;
        this.presentAble = presentAble;
    }

    //unit test
    public ActualResultDTO execute(double num1, double num2) {
        //hãy code như là chúng ta có tất đồ chơi ở đây
        Multiplication mulAble = new Multiplication();
        double actualResult = mulAble.multiply(num1, num2);
        
        //

        boolean actualStore = storeAble.save(actualResult);
        ActualResultDTO outputData = new ActualResultDTO();
        outputData.actualResult = actualResult;
        outputData.actualStore = actualStore;
        //
        Tich2SoModel presnetModel = presentAble.format(outputData);

        return  outputData;
    }

}
