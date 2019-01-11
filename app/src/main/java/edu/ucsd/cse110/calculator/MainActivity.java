package edu.ucsd.cse110.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static edu.ucsd.cse110.calculator.Utils.toIntNullSafe;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button equalsBtn = findViewById(R.id.btn_equals);
        equalsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText num1View = findViewById(R.id.number_1);
                EditText num2View = findViewById(R.id.number_2);

                String num1Text = num1View.getText().toString();
                String num2Text = num2View.getText().toString();

                int num1 = toIntNullSafe(num1Text);
                int num2 = toIntNullSafe(num2Text);

                int answer = num1 - num2;

                TextView answerView = findViewById(R.id.answer);
                answerView.setText(String.valueOf(answer));
            }
        });
    }
}
