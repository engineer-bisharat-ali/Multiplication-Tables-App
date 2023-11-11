package com.example.multiplicationtables;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {



    ListView MylistView;
    TextView textView2;
    int table;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


      SeekBar seekBar = findViewById(R.id.seekBar);
       MylistView = findViewById(R.id.ListView);
      seekBar.setMax(50);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                Toast.makeText(MainActivity.this, "The Table Of " +i, Toast.LENGTH_SHORT).show();
                popular(i);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });



    }
    public void popular(int table){
        ArrayList <String> multable = new ArrayList<>();
        for (int i = 1; i<=10;i++){
           multable.add(table+" X "+ i + " = " + table*i);
        }
        ArrayAdapter <String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,multable);
        MylistView.setAdapter(arrayAdapter);
    }

}