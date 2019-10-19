package com.example.graduation_project;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class Cost_calculation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cost_calculation);
            Spinner mySpinner1 =findViewById(R.id.spinner1);
            ArrayAdapter<String> myAdapter1 = new
                    ArrayAdapter<String>(Cost_calculation.this, android.R.layout.simple_list_item_1,
                    getResources().getStringArray(R.array.Region));

            myAdapter1.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
            mySpinner1.setAdapter(myAdapter1);
            Spinner mySpinner2 = findViewById(R.id.spinner2);
            ArrayAdapter<String> myAdapter2 = new
                    ArrayAdapter<String>(Cost_calculation.this,android.R.layout.simple_list_item_1,
                    getResources().getStringArray(R.array.Region));

            myAdapter2.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
            mySpinner2.setAdapter(myAdapter2);
            Spinner mySpinner3 =findViewById(R.id.spinner3);
            ArrayAdapter<String> myAdapter3 = new
                    ArrayAdapter<String>(Cost_calculation.this,
                    android.R.layout.simple_list_item_1,

                    getResources().getStringArray(R.array.NumberofPassengers));
            myAdapter3.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
            mySpinner3.setAdapter(myAdapter3);

        }
}
