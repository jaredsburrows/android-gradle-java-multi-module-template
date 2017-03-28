package burrows.apps.example.template;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public class EmailValidatorTest {
    @Test public void isValidEmail() throws Exception {
        assertThat(EmailValidator.isValidEmail("jaredsburrows@gmail.com")).isTrue();
    }
}
