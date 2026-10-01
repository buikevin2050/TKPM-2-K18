package starter.v6;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MultiFlowControl {
    private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private final Multiplication multiplication;
    private final UI ui;
    private final IOMemory ioMemory;

    public MultiFlowControl(Multiplication multiplication, UI ui, IOMemory ioMemory) {
        this.multiplication = multiplication;
        this.ui = ui;
        this.ioMemory = ioMemory;
    }

    public long execute(long num1, long num2) {
        long result = multiplication.multiply(num1, num2);
        ioMemory.save(result);
        ui.displayResult(result, backgroundColorFor(num1, num2), textColorFor(result),
                LocalDate.now().format(DATE_FORMAT));
        return result;
    }

    private String backgroundColorFor(long num1, long num2) {
        boolean firstEven = num1 % 2 == 0;
        boolean secondEven = num2 % 2 == 0;

        if (firstEven && secondEven) {
            return "Hồng";
        }
        if (firstEven) {
            return "Xanh dương";
        }
        if (!secondEven) {
            return "Đỏ";
        }
        return "Vàng";
    }

    private String textColorFor(long result) {
        return result % 2 == 0 ? "Xanh lá" : "Đỏ";
    }
}