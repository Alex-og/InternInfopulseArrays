package firstTask;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class LogicClassTest {

    @Test
    public void shouldReturnMaxValue() {
        double[][] actual = {{0.0, 10.0, 15.15}, {0.0, 56.25, 23.0}, {100.0, 20.2}};
        double expected = 100.0;
        assertThat(expected, is(new LogicClass().getMaxValue(actual)));
    }

    @Test
    public void whenAllValuesIsZeroThenReturnZero() {
        double[][] actual = {{0.0, 0.0, 0.0}, {0.0, 0.0, 0.0}};
        double expected = 0.0;
        assertThat(expected, is(new LogicClass().getMaxValue(actual)));
    }

    @Test
    public void shouldThrowsNPE() {
        double[][] actual = null;
        NullPointerException exception = Assertions.assertThrows(NullPointerException.class,
                () -> new LogicClass().getMaxValue(actual));
        assertEquals("The array cannot be empty.", exception.getMessage());
    }

}