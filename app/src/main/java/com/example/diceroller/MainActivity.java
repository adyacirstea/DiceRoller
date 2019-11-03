package com.example.diceroller;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.Random;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public int points=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

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

    public void roll_the_dice(View view){
        TextView tv = this.findViewById(R.id.textView);
        //TextView tv2= this.findViewById(R.id.textView2);
        TextView tv3=this.findViewById(R.id.textView3);
        TextView innumber = this.findViewById(R.id.editText);
        int innb= Integer.valueOf(innumber.getText().toString());

        Random r= new Random();
        int number = r.nextInt(6);
        tv.setText(Integer.toString(number));
        if(innb == number) {
            //tv2.setText("Congratulations");
            points=points+1;
            tv3.setText("Points:"+Integer.toString(points));
        }
        //else
           // tv2.setText("Try again");

    }
    public void icebreaker(View view){

    }
}
