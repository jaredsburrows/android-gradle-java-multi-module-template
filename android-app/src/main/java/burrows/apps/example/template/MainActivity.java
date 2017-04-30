package burrows.apps.example.template;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import burrows.apps.example.template.application.R;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
