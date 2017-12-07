package com.example.opilane.passingdataaround;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView txtReceivedData = (TextView)findViewById(R.id.txtReceivedData);

        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            String data = bundle.getString("Andmed");
            int age = bundle.getInt("vanus", 0);
            txtReceivedData.setText(data + " vanus on " + age);
        }
    }
}
