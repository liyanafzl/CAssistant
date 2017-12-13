package college.com.cassistant;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Liyana Fizal on 11/19/2017.
 */
public class ProfileActivity extends AppCompatActivity {

    private TextView myprofile_name;
    private TextView myprofile_email;
    private TextView myprofile_age;
    private TextView myprofile_phone;
    private TextView myprofile_gender;
    private TextView myprofile_address;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myprofile);
        myprofile_name = (TextView)findViewById(R.id.myprofile_name);
        myprofile_email = (TextView)findViewById(R.id.myprofile_email);
        myprofile_age = (TextView)findViewById(R.id.myprofile_age);
        myprofile_phone = (TextView)findViewById(R.id.myprofile_phone);
        myprofile_gender = (TextView)findViewById(R.id.myprofile_gender);
        myprofile_address = (TextView)findViewById(R.id.myprofile_address);

    }
}

