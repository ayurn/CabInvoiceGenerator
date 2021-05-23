import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class CabInvoiceTest {

    @Test
    void givenDistanceAndTime_ShouldReturnTotalFare() {
        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
        double TotalFare = cabInvoiceGenerator.CalculateFare(5.0, 4);
        Assertions.assertEquals(54, TotalFare);
    }
}
