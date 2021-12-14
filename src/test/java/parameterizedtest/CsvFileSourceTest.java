package parameterizedtest;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CsvFileSourceTest {

    @ParameterizedTest
    @CsvFileSource(resources = "capital.csv", numLinesToSkip = 1)
    void testWithCsvFileSource(String country, String capital){
        assertNotNull(country);
        assertNotNull(capital);
    }
}
