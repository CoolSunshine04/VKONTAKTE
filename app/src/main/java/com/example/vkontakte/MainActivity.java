package com.example.vkontakte;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view){
        EditText editText = (EditText)findViewById(R.id.editText2);
        EditText editText2 = (EditText)findViewById(R.id.editText3);
        String a = editText.getText().toString();
        String b=editText2.getText().toString();
        proverka(a,b);

        //if (a=="DALDAL"&&b=="darksiders" ) {
          //  Log.d("MOLODEZ", "KRASAVA");
        }
//!!!TextView textView = (TextView)findViewById(R.id.textView5);
        //Log.d("PRIVET", "NORMALNO VSE IDI ...");

    public void proverka(String a,String b){

        if (a.equals("DALDAL")&&b.equals("darksiders")) {
            Log.d("MOLODEZ", "KRASAVA");
            return;
        }

    }
}
