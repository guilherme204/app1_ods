package com.example.appods;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button ODS1, ODS2, ODS3, ODS4, ODS5, ODS6, ODS7, ODS8, ODS9, ODS10, ODS11, ODS12, ODS13, ODS14, ODS15, ODS16, ODS17

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // botao tela ods1
        ODS1 = findViewById(R.id.ODS1);
        ODS1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaODS1 = new Intent( getApplicationContext(), ODS1Activity.class );
                startActivity(telaODS1);
            }
        });

        //botão tela ods2
        ODS2 = findViewById(R.id.ODS2);
        ODS2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaODS2 = new Intent( getApplicationContext(), ODS2Activity2.class );
            }
        });



    }
}


