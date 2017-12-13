package college.com.cassistant;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;

/**
 * Created by Liyana Fizal on 11/19/2017.
 */
public class HomeActivity extends AppCompatActivity {
//commit
    private int i;
    private Button activity_home_taskButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        activity_home_taskButton = (Button)findViewById(R.id.activity_home_taskButton);

        activity_home_taskButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
    }
}
