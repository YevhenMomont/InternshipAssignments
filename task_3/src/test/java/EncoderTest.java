import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncoderTest {

    private static final String MESSAGE = "G";
    private static final String MESSAGE2 = "GO";
    private static final String EXPECTED_VALUE = "00 0 0 0 00 000 0 000";
    private static final String EXPECTED_VALUE2 = "00 0 0 0 00 000 0 0000 00 00 0 0000";

    @Test
    void encoderTest() {
        assertEquals(EXPECTED_VALUE, Encoder.encoder(Encoder.stringToASCIIAndBytes(MESSAGE)));
        assertEquals(EXPECTED_VALUE2, Encoder.encoder(Encoder.stringToASCIIAndBytes(MESSAGE2)));
    }
}