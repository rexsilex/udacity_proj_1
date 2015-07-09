package com.example.flint.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
    /** Called when the user touches the button */
    public void sendMessage(View view) {
        Context context = getApplicationContext();
        CharSequence text="";
        if(view.getId()==R.id.button){
          text = "This button will launch my spotify app!";
        }else if(view.getId()==R.id.button2){
            text = "This button will launch my scores app!";
        }else if(view.getId()==R.id.button3){
            text = "This button will launch my library app!";
        }else if(view.getId()==R.id.button4){
            text = "This button will launch my bigger app!";
        }else if(view.getId()==R.id.button5){
            text = "This button will launch my reader app!";
        }else if(view.getId()==R.id.button6){
            text = "This button will launch my capstone app!";
        }


        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
