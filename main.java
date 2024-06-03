package com.example.calcualtor;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText number1;

    private EditText number2;

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;

    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        result =  findViewById(R.id.result);
    }

    public void  calculateSum(View v){
        String num1 = number1.getText().toString();
        String num2 = number2.getText().toString();
        int sum = Integer.parseInt(num1) + Integer.parseInt(num2);
        result.setText("sum: " + sum);
    }

    public void  calculateDifference(View v){
        String num1 = number1.getText().toString();
        String num2 = number2.getText().toString();
        int diff = Integer.parseInt(num1) - Integer.parseInt(num2);
        result.setText("diff: " + diff);
    }

    public void  calcualateProduct(View v){
        String num1 = number1.getText().toString();
        String num2 = number2.getText().toString();
        int prod = Integer.parseInt(num1) * Integer.parseInt(num2);
        result.setText("prod: " + prod);
    }

    public void  calculateDivision(View v){
        String num1 = number1.getText().toString();
        String num2 = number2.getText().toString();
        int div = Integer.parseInt(num1) / Integer.parseInt(num2);
        result.setText("div: " + div);
    }

}