package sg.com.kaplan.currencyconverter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {


    EditText Number1;           /* --- declare global var ---- */
    EditText Number2;

    TextView result;
    double numTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);



        Number1 = (EditText)findViewById(R.id.Number1);

        Number2 = (EditText)findViewById(R.id.Number2);

        result = (TextView)findViewById(R.id.result);

        Button add = (Button)findViewById(R.id.add);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(Number1.getText().toString());
                int num2 = Integer.parseInt(Number2.getText().toString());

                numTotal = num1 + num2;
                result.setText(String.valueOf(numTotal));       /* --- number 1 + number 2 will set value to result ---- */
            }
        });
        Button subtract = (Button)findViewById(R.id.subtract);
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(Number1.getText().toString());
                int num2 = Integer.parseInt(Number2.getText().toString());

                numTotal = num1 - num2;
                result.setText(String.valueOf(numTotal));
            }
        });
        Button multiply = (Button)findViewById(R.id.multiply);
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(Number1.getText().toString());
                int num2 = Integer.parseInt(Number2.getText().toString());

                numTotal = num1 * num2;
                result.setText(String.valueOf(numTotal));
            }
        });
        Button divide = (Button)findViewById(R.id.divide);
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(Number1.getText().toString());
                int num2 = Integer.parseInt(Number2.getText().toString());

                numTotal = num1 / num2;
                result.setText(String.valueOf(numTotal));
            }
        });

        Button home = (Button)findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main5Activity.this, MainActivity.class));
            }
        });


    }
}
