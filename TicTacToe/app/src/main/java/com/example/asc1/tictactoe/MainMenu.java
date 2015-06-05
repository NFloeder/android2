package com.example.asc1.tictactoe;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainMenu extends ActionBarActivity {

    TextView tictactoe;
    Button onePlayer;
    Button twoPlayerLocal;
    Button twoPlayerOnline;
    Button settings;

    View.OnClickListener buttonListener = new View.OnClickListener(){
        public void onClick(View v) {
            Intent intent = new Intent(v.getContext(), SinglePlayerGame.class);
            startActivity(intent);
        }
    };

    View.OnClickListener buttonListener2 = new View.OnClickListener(){
        public void onClick(View v) {
            Intent intent = new Intent(v.getContext(), TwoPlayerGameLocal.class);
            startActivity(intent);
        }
    };

    View.OnClickListener buttonListener3 = new View.OnClickListener(){
        public void onClick(View v) {
            Intent intent = new Intent(v.getContext(), TwoPlayerGameOnline.class);
            startActivity(intent);
        }
    };

    View.OnClickListener buttonListener4 = new View.OnClickListener(){
        public void onClick(View v) {
            Intent intent = new Intent(v.getContext(), Settings.class);
            startActivity(intent);
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        tictactoe = (TextView)findViewById(R.id.appName);
        onePlayer = (Button)findViewById(R.id.one_player);
        onePlayer.setOnClickListener(buttonListener2);
        twoPlayerLocal = (Button)findViewById(R.id.two_player_loc);
        twoPlayerLocal.setOnClickListener(buttonListener2);
        twoPlayerOnline = (Button)findViewById(R.id.two_player_online);
        twoPlayerOnline.setOnClickListener(buttonListener2);
        settings = (Button)findViewById(R.id.settings_options);
        settings.setOnClickListener(buttonListener2);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_menu, menu);
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
