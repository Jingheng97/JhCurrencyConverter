package sg.com.kaplan.currencyconverter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);
        Button Home = (Button)findViewById(R.id.Home);

        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main2Activity.this , MainActivity.class));
            }
        });
        Button generate = (Button)findViewById(R.id.Generate);
        generate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random rand = new Random();
                int number = rand.nextInt(9)+1;
                TextView mytext = (TextView)findViewById(R.id.RandomNumber);
                String myString = String.valueOf(number);
                mytext.setText(myString);

             }
        });


}}
