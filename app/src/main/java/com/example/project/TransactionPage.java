package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Date;

public class TransactionPage extends AppCompatActivity {

    int amount;
    String note = "";
    String type = "";
    String category = "";
    String date = "";
    String[] typeItems = {"income", "expense"};
    String[] categoryItems = {"savings", "shopping", "food", "billing", "top up", "travel", "other"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction_page);

        TextView transaction = findViewById(R.id.transaction);
        transaction.setText("Transaction");

        TextView amountTextView = findViewById(R.id.amountTextView);
        amountTextView.setText("Amount");

        TextView dateTextView = findViewById(R.id.dateTextView);
        dateTextView.setText("Date");

        TextView typeTextView = findViewById(R.id.typeTextView);
        typeTextView.setText("Type");

        TextView categoryTextView = findViewById(R.id.categoryTextView);
        categoryTextView.setText("Category");

        EditText amountEditText = findViewById(R.id.amountEditText);
        amountEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.toString().isEmpty()) {

                } else {
                    amount = Integer.parseInt(s.toString());
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        EditText editTextDate = findViewById(R.id.editTextDate);
        editTextDate.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.toString().isEmpty()) {

                } else {
                    date = s.toString();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        EditText noteEditText = findViewById(R.id.noteEditText);
        noteEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.toString().isEmpty()) {

                } else {
                    note = s.toString();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        Spinner typeSpinner = findViewById(R.id.typeSpinner);
        ArrayAdapter<String> typeAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, typeItems);
        typeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        typeSpinner.setAdapter(typeAdapter);

        Spinner categorySpinner = findViewById(R.id.categorySpinner);
        ArrayAdapter<String> categoryAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, categoryItems);
        categoryAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        categorySpinner.setAdapter(categoryAdapter);


        Button saveButton = findViewById(R.id.saveButton);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}