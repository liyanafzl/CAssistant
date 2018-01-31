package college.com.cassistant;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

/**
 * Created by Liyana Fizal on 1/30/2018.
 */

public class ScanActivity extends AppCompatActivity {

    TextView scan_id;
    String str_scan_id;
    Button scan_button;
    private IntentIntegrator qrScan;


    //Activity for QR Code scanning
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan);

        scan_id = (TextView) findViewById(R.id.scan_id);
        scan_button = (Button) findViewById(R.id.scan_button);
        qrScan = new IntentIntegrator(this);

        scan_button.setOnClickListener(btnclick);


    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
        if (result != null) {
            //if qrcode has nothing in it
            if (result.getContents() == null) {
                Toast.makeText(this, "Result Not Found", Toast.LENGTH_LONG).show();
            } else {
                //if qr contains data

                    //converting the data to json
                    String obj = result.getContents();
                  //  JSONObject obj = new JSONObject(result.getContents());
                    //setting values to textviews
                    scan_id.setText(obj);

                    //e.printStackTrace();
                    //if control comes here
                    //that means the encoded format not matches
                    //in this case you can display whatever data is available on the qrcode
                    //to a toast
                    Toast.makeText(this, result.getContents(), Toast.LENGTH_LONG).show();
                }

        } else {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }

    public View.OnClickListener btnclick = new View.OnClickListener() {
        @Override
        public void onClick(View v)
        {
            qrScan.initiateScan();

        }
    };
}
