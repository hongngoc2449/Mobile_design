package com.example.twonumbers;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Main extends AppCompatActivity {
    private EditText textA, textB;
    private Button plus,minus,multiply,divide;
    private ListView listView;
    private ArrayList<Double> arrayList;
    private ArrayAdapter<Double> arrayAdapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textA = findViewById(R.id.textA);
        textB = findViewById(R.id.textB);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        multiply = findViewById(R.id.multiply);
        divide = findViewById(R.id.divide);
        listView = findViewById(R.id.listView);
        arrayList = new ArrayList<Double>();
        arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double sum = Double.parseDouble(textA.getText().toString()) + Double.parseDouble(textB.getText().toString());
                arrayList.add(sum);
                arrayAdapter.notifyDataSetChanged();
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double diff = Double.parseDouble(textA.getText().toString()) - Double.parseDouble(textB.getText().toString());
                arrayList.add(diff);
                arrayAdapter.notifyDataSetChanged();
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double prod = Double.parseDouble(textA.getText().toString()) * Double.parseDouble(textB.getText().toString());
                arrayList.add(prod);
                arrayAdapter.notifyDataSetChanged();
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double quotient = Double.parseDouble(textA.getText().toString()) / Double.parseDouble(textB.getText().toString());
                arrayList.add(quotient);
                arrayAdapter.notifyDataSetChanged();
            }
        });
    }
}
