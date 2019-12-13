package com.example.myapplication;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private Button value0;
    private Button value1;
    private Button value2;
    private Button value3;
    private Button value4;
    private Button value5;
    private Button value6;
    private Button value7;
    private Button value8;
    private Button value9;
    private Button plus;
    private Button minus;
    private Button multiply;
    private  Button division;
    private Button clear;
    private Button equal;
    private TextView display;
    private int a;
    private int a1=0;
    private char operator;
    int a2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        value0 =findViewById(R.id.zero);
        value1 =findViewById(R.id.one);
        value2 =findViewById(R.id.two);
        value3 =findViewById(R.id.three);
        value4 =findViewById(R.id.four);
        value5 =findViewById(R.id.five);
        value6 =findViewById(R.id.six);
        value7 =findViewById(R.id.seven);
        value8 =findViewById(R.id.eight);
        value9 =findViewById(R.id.nine);
        display=findViewById(R.id.Display);
        plus=findViewById(R.id.plus);
        minus=findViewById(R.id.minus);
        multiply=findViewById(R.id.multiplication);
        division=findViewById(R.id.division);
        clear=findViewById(R.id.clear);
        equal=findViewById(R.id.equals);

        value0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                display.setText(display.getText()+"0");
                a= Integer.parseInt(display.getText()+"0");

            }

        });
        value1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                display.setText(display.getText()+"1");
                a= Integer.parseInt(display.getText()+"1");

            }

        });
        value2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                display.setText(display.getText()+"2");
                a= Integer.parseInt(display.getText()+"2");

            }

        });
        value3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                display.setText(display.getText()+"3");
                a= Integer.parseInt(display.getText()+"3");

            }

        });
        value4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                display.setText(display.getText()+"4");
                a= Integer.parseInt(display.getText()+"4");

            }

        });
        value5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                display.setText(display.getText()+"5");
                a= Integer.parseInt(display.getText()+"5");

            }

        });
        value6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                display.setText(display.getText()+"6");
                a= Integer.parseInt(display.getText()+"6");

            }

        });
        value7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                display.setText(display.getText()+"7");
                a= Integer.parseInt(display.getText()+"7");

            }

        });
        value8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                display.setText(display.getText()+"8");
                a= Integer.parseInt(display.getText()+"8");

            }

        });
        value9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                display.setText(display.getText()+"9");
                a= Integer.parseInt(display.getText()+"9");

            }

        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a1= Integer.parseInt(display.getText().toString());
                display.setText("0");
                operator='+';

            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a1= Integer.parseInt(display.getText().toString());
                display.setText("0");
                operator='-';

            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a1= Integer.parseInt(display.getText().toString());
                display.setText("0");
                operator='*';

            }
        });
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a1= Integer.parseInt(display.getText().toString());
                display.setText("0");
                operator='/';

            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a2= Integer.parseInt(display.getText().toString());
                if(operator=='+')
                {
                    display.setText(""+(a1+a2));
                }
                else if (operator=='-')
                {
                    display.setText(""+(a1-a2));
                }
                else if (operator=='*')
                {
                    display.setText(""+(a1*a2));
                }
                else if (operator=='/')
                {   if(a2!=0)
                    display.setText(""+(a1/a2));
                    else
                    display.setText("0");

                }
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a1=0;
                display.setText("0");


            }
        });




        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();


            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
