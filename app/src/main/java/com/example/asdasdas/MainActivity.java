package com.example.asdasdas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView komunikat;
    Button przycisk;
    String odczytane;
    String odczytane2;
    String odczytane3;
    EditText editText1;
    EditText editText2;
    EditText editText3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        przycisk = findViewById(R.id.button2);
        editText1 = findViewById(R.id.editMail);
        editText2 = findViewById(R.id.editPassword);
        editText3 = findViewById(R.id.editPassword2);
        komunikat = findViewById(R.id.pokaz);
        komunikat.setText("Autor:0000000000000");


        przycisk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                odczytane = editText1.getText().toString();

                if (!odczytane.contains("@")) {
                    komunikat.setText("Brakuje @");
                }
                    else {

                    if(editText3.getText().toString().equals(editText2.getText().toString()))
                    {
                        komunikat.setText("Hasło jest git");
                    }
                    else
                    {
                        komunikat.setText("Hasło nie jest git");
                    }
                }


            }


        });

    }
}