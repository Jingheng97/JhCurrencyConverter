package sg.com.kaplan.currencyconverter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {

    EditText editText2;
    Button convert, MainPageBud, calButton;
    TextView result, result2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        editText2 = (EditText)findViewById(R.id.editText2);
        result = (TextView)findViewById(R.id.result);
        result2 = (TextView)findViewById(R.id.result2);


        calButton = (Button)findViewById(R.id.calButton);
        calButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main4Activity.this , Main5Activity.class));
            }
        });


        MainPageBud = (Button)findViewById(R.id.MainPageBud);
        MainPageBud.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
                startActivity(new Intent(Main4Activity.this , MainActivity.class));
            }
        });

        convert= (Button)findViewById(R.id.convert);
        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main4Activity.this, "The result will be shown here!", Toast.LENGTH_SHORT).show();

                double E = 0.64;
                double U = 0.74;
                double Y = 81.93;
                double R = 2.96;
                double S = 1.00;
                double B = 24.15;
                double W = 815.86;
                double N = 22.16;

                Double input = Double.parseDouble(editText2.getText().toString());
                double Euro = input * E;

                Double input2 = Double.parseDouble(editText2.getText().toString());
                double USD = input2 * U;

                Double input3 = Double.parseDouble(editText2.getText().toString());
                double YEN = input3 * Y;

                Double input4 = Double.parseDouble(editText2.getText().toString());
                double Ringgit = input4 * R;

                Double input5 = Double.parseDouble(editText2.getText().toString());
                double SGD = input5 * S;

                Double input6 = Double.parseDouble(editText2.getText().toString());
                double Baht = input6 * B;

                Double input7 = Double.parseDouble(editText2.getText().toString());
                double Won = input7 * W;

                Double input8 = Double.parseDouble(editText2.getText().toString());
                double NTD = input8 * N;


                result.setText("Euro: "+ Euro +"\n\n" +
                        "USD: "+ USD +"\n\n" +
                        "YEN: "+ YEN +"\n\n" +
                        "Ringgit: "+ Ringgit +"\n\n");

                result2.setText("SGD: "+ SGD +"\n\n" +
                        "Baht(Thailand): "+ Baht +"\n\n" +
                        "Won(Korea): "+ Won +"\n\n" +
                        "NTD(New Taiwan Dollar: "+ NTD +"\n\n");

            }
        });



    }
}
