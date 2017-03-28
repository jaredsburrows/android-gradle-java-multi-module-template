package burrows.apps.example.template;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public class CalculatorTest {
    @Test
    public void add() throws Exception {
        assertThat(Calculator.add(1, 2)).isEqualTo(3);
    }
}
