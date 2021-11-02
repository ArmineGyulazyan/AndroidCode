package com.example.myapplicationforsort;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.io.StringWriter;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         Button button = (Button) findViewById(R.id.simpleButton);
         EditText edInputString = findViewById(R.id.et_str_to_sort);

         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 String strTosort = edInputString.getText().toString();
             }
         });

    }
   private void sortString(String string_to_sort){
        String sortedString = string_to_sort;
        TextView tvSortedString = findViewById(R.id.tv_sorted_str);
        tvSortedString.setText(sortedString);
        StringWriter sw = new StringWriter();

        for(int i = 0;i<string_to_sort.length(); i++){
            sw.append(string_to_sort.charAt(i));

            tvSortedString.setText(sw.toString());
        }
    }

    //private char strToSort(int i){
    // }
}