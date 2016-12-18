package com.example.sandip.qrcode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button scan,gen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this,"Create Activity Call",Toast.LENGTH_LONG).show();
        gen= (Button) findViewById(R.id.gen);
        scan= (Button) findViewById(R.id.scan);
        gen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next=new Intent(MainActivity.this,Generator.class);
                startActivity(next);
            }
        });
        scan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next=new Intent(MainActivity.this,Reader.class);
                startActivity(next);
            }
        });
    }
    protected void onStart(){
        Toast.makeText(MainActivity.this,"Start Activity Call",Toast.LENGTH_LONG).show();
        super.onStart();
    }
    protected void onPause(){
        Toast.makeText(MainActivity.this,"Pause Activity Call",Toast.LENGTH_LONG).show();
        super.onPause();
    }
    protected void onRestart(){
        Toast.makeText(MainActivity.this,"Restart Activity Call",Toast.LENGTH_LONG).show();
        super.onRestart();
    }
    protected void onResume(){
        Toast.makeText(MainActivity.this,"Resume Activity Call",Toast.LENGTH_LONG).show();
        super.onResume();
    }
    protected void onStop(){
        Toast.makeText(MainActivity.this,"Stop Activity Call",Toast.LENGTH_LONG).show();
        super.onStop();
    }
    protected void onDestroy(){
        Toast.makeText(MainActivity.this,"Destroy Activity Call",Toast.LENGTH_LONG).show();
        super.onDestroy();
    }
}
