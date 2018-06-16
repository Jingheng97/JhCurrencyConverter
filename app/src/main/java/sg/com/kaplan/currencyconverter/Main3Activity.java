package sg.com.kaplan.currencyconverter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button Homebutton = (Button)findViewById(R.id.HomeButton);
        Homebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main3Activity.this , MainActivity.class));
            }

        });
        Button Randnum = (Button)findViewById(R.id.RandNum);
        Randnum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main3Activity.this , Main2Activity.class));
            }

        });

        Button ConvertBud = (Button)findViewById(R.id.Convertbud);
        ConvertBud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main3Activity.this , Main4Activity.class));
            }
        });
        Button CalculatorButton = (Button)findViewById(R.id.CalculatorButton);
        CalculatorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main3Activity.this , Main5Activity.class));
            }
        });


    }
}
