import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

public class BonusServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/Data.csv")
    void bonusCalculationTest(long amount, boolean isRegistred, long expected) {
        BonusService service = new BonusService();

        long actual = service.calculate(amount, isRegistred);

        assertEquals(expected, actual);
    }
}