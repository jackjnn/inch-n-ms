package com.inch_n_ms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView mimage;
    EditText minches;
    EditText mmeters;
    Button mbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mimage = findViewById(R.id.imageView);
        minches = findViewById(R.id.inches_input);
        mmeters = findViewById(R.id.meters_output);
        mbutton = findViewById(R.id.button);

        mbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (minches.getText() == null && mmeters.getText() == null ||
                        minches.getText().length() == 0 && mmeters.getText().length() == 0)
                    Toast.makeText(getApplicationContext(),
                            "Please Enter a Valid Value. Can't be empty!",Toast.LENGTH_LONG).show();


                else if (minches.getText()!= null && minches.getText().length() > 0)
                    //Editable inches = minches.getText();
                    mmeters.setText("Result: "+
                            String.valueOf(
                                    Double.parseDouble(minches.getText().toString()) *
                                    0.0254));

                else if (mmeters.getText()!= null && mmeters.getText().length() > 0)
                    minches.setText("Result: "+
                        String.valueOf(
                                Double.parseDouble(mmeters.getText().toString()) *
                                        39.3701));

            }
        });
    }


}