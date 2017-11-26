package edu.brandeis.cs.housingapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by eureyuri on 2017/11/26.
 */

public class DisplayHouseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_house);

        extractAndSet();

        Button rateButton = (Button)findViewById(R.id.rateButton);
        rateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent());
            }
        });

        Button contactButton = (Button)findViewById(R.id.contactButton);
        contactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phoneNumber = "123-456-789";
                startActivity(new Intent(Intent.ACTION_DIAL,
                        Uri.fromParts("tel", phoneNumber, null)));
            }
        });
    }

//    TODO: extract info from db and set
    private void extractAndSet() {
//        Get house name from db
        TextView houseName = (TextView)findViewById(R.id.houseName);
        houseName.setText("New house name");

        
    }
}
