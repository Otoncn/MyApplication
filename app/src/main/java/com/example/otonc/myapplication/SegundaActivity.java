package com.example.otonc.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        Button bt= findViewById(R.id.button);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(SegundaActivity.this,
//                        "Boton", Toast.LENGTH_SHORT).show();
                CheckBox checkBox = findViewById(R.id.checkBox);
                if (checkBox.isChecked()) {
                    Toast.makeText(SegundaActivity.this,
                            "Checkead", Toast.LENGTH_SHORT).show();
                } else
                    Toast.makeText(SegundaActivity.this,
                            "No check", Toast.LENGTH_SHORT).show();
                EditText editText = findViewById(R.id.editText);
                Spinner spinner = findViewById(R.id.spinner);
                String cadena1 = spinner.getSelectedItem().toString();
                String cadena2 = editText.getText().toString();
                if (cadena1.equals(cadena2)) {
                    TextView textView = findViewById(R.id.textView);
                    textView.setText(cadena1);
//                   Toast.makeText(SegundaActivity.this,
//                            "Cadenas iguales", Toast.LENGTH_SHORT).show();
                } else
                    editText.setError("Debe ser igual");
//                    Toast.makeText(SegundaActivity.this,
//                            "Cadenas distints", Toast.LENGTH_SHORT).show();
//            }
            }
        });
    }
}
