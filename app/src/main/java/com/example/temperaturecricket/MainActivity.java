package com.example.temperaturecricket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText txtChirps;
    TextView txtInfo;
    Button btnCalcTemp;
    TextView txtCelsius;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtInfo = findViewById(R.id.txtInfo);
        txtChirps =findViewById(R.id.txtChirps);
        btnCalcTemp = findViewById(R.id.btnCalcTemp);
        txtCelsius = findViewById(R.id.txtCelsius);

        String x = "Did you know you can determine  the temperature outside by counting the number of chirps the cricket makes? Just count the number of chirps one makes in 25 seconds and place that number in the box below:";
        txtInfo.setText(x);

        txtCelsius.setVisibility(View.GONE);

        btnCalcTemp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String chirps = txtChirps.getText().toString().trim();

                int noChirps = Integer.parseInt(chirps);

                double degCelsius = noChirps/3.0 + 4;

                String text;

                text = "The approximate temperature outside is " + degCelsius + " degree Celsius";

                txtCelsius.setText(text);

                txtCelsius.setVisibility(View.VISIBLE);
            }
        });
    }
}
