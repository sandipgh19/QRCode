package com.example.sandip.qrcode;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

/**
 * Created by sandip on 12/14/2016.
 */

public class Generator extends AppCompatActivity {
    EditText text;
    Button gen_btn;
    ImageView image;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generator);
        text= (EditText) findViewById(R.id.text);
        gen_btn= (Button) findViewById(R.id.gen_btn);
        image= (ImageView) findViewById(R.id.image);
        gen_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }
        });
    }
}
