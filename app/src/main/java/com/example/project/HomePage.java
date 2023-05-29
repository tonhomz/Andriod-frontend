package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class HomePage extends AppCompatActivity {

    String name = "Prueksa Khumpaen";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        TextView nameTextView = findViewById(R.id.nameTextView);
        nameTextView.setText(name);

        TextView homeTextView = findViewById(R.id.homeTextView);
        homeTextView.setText("จัดการและวางแผนการเงิน");

        ImageView profileImage = findViewById(R.id.profileImageView);
       // profileImage.setImageIcon();

        Button plan = findViewById(R.id.planButton);
        plan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent planningPage = new Intent(HomePage.this, PlanningPage.class);
                startActivity(planningPage);
            }
        });

        Button transactionButton = findViewById(R.id.transactionButton);
        transactionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent TransactionPage = new Intent(HomePage.this, TransactionPage.class);
                startActivity(TransactionPage);
            }
        });
    }
}