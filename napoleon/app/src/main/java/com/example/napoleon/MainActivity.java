package com.example.napoleon;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }


    public void OnClick(View view){
        EditText editText = (EditText) findViewById(R.id.edit);
        TextView water = (TextView) findViewById(R.id.textView);
        String buffer;
        int buffer_int;

        switch (view.getId()){
            case (R.id.add_a_lot_water):
                buffer = editText.getText().toString();
                if(buffer.equals("")) {water.setText("0");break;}
                water.setText(buffer);
                break;

            case (R.id.add) :
                buffer = water.getText().toString();
                buffer_int = Integer.parseInt(buffer);
                buffer_int +=1;
                buffer = Integer.toString(buffer_int);
                water.setText(buffer);
                break;
            case (R.id.delete):
                water.setText("0");
                break;

        }





    }






}