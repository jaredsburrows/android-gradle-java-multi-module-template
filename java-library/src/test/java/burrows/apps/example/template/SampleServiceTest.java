package burrows.apps.example.template;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public class SampleServiceTest {
    @Test public void onStartCommand() throws Exception {
        assertThat(SampleService.start()).isTrue();
    }
}
