package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PlanningPage extends AppCompatActivity {

    //changable
    String month = "April";
    int year = 2023;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planning_page);

        TextView plan = findViewById(R.id.Plan);
        plan.setText("Plan");

        TextView monthShow = findViewById(R.id.month);
        monthShow.setText("Planning of" + month + year);

        TextView incomeText = findViewById(R.id.setIncome);
        incomeText.setText("Set income goals");

        EditText income = findViewById(R.id.editTextIncome);
        income.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        Button setIncomeButton = findViewById(R.id.setIncomeButton);
        setIncomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        TextView expenseText = findViewById(R.id.setExpense);
        expenseText.setText("Set expense limit");

        EditText expense = findViewById(R.id.editTextExpense);
        expense.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        Button setExpenseButton = findViewById(R.id.expenseButton);
        setExpenseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        TextView graphText = findViewById(R.id.graphmonth);
        expenseText.setText("Graph of this month's overview");
    }
}