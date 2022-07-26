package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnClick(View view){
        TextView txtFirstName = findViewById(R.id.txtFirstName);
        TextView txtLastName = findViewById(R.id.txtLastName);
        TextView txtEmail= findViewById(R.id.txtEmail);

        EditText edtTxtFirstName = findViewById(R.id.edtTextFirstName);
        EditText edtTxtLastName = findViewById(R.id.edtTextLastName);
        EditText edtTxtEmail= findViewById(R.id.edtTextEmail);

        txtFirstName.setText("First Name :" + edtTxtFirstName.getText().toString());
        txtLastName.setText("Last Name :"+ edtTxtLastName.getText().toString());
        txtEmail.setText("Email :"+edtTxtEmail.getText().toString());
    }

}