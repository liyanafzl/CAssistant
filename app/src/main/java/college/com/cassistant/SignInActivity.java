package college.com.cassistant;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Liyana Fizal on 11/19/2017.
 */
public class SignInActivity extends AppCompatActivity {
    private EditText signin_username;
    private EditText signin_password;
    private Button signin_button;
    private TextView signin_signup;

    String str_signin_username;
    String str_signin_password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        signin_username = (EditText) findViewById(R.id.signin_username);
        signin_password = (EditText) findViewById(R.id.signin_password);
        signin_button = (Button) findViewById(R.id.signin_button);
        signin_signup = (TextView) findViewById(R.id.signin_signup);

        str_signin_username = signin_username.getText().toString();
        str_signin_password = signin_password.getText().toString();

        signin_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent i = new Intent(SignInActivity.this, ScanActivity.class);
                startActivity(i);

            }
        });
    }
}

