package com.example.otonc.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v)
    {
        if(v.getId()==R.id.ibMensaje)
        {
            Toast.makeText(this, "Probando ClickIMG", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Intent intent= new Intent(this,
                    SegundaActivity.class);
            //intent.putExtra()
            startActivity(intent);
        }
            //Log.d("Prueba","Probando Click");
    }

    public void onClickImg(View v)
    {
        Toast.makeText(this, "Probando ClickIMG", Toast.LENGTH_SHORT).show();
    }
}
