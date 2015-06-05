package com.example.asc1.tictactoe;

import android.content.Intent;
import android.os.CountDownTimer;
import android.os.SystemClock;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import android.widget.Button;
import android.widget.TextView;




public class TwoPlayerGameLocal extends ActionBarActivity {
    TextView playerTurn;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button reset;
    Boolean clicked1 = false;
    Boolean clicked2 = false;
    Boolean clicked3 = false;
    Boolean clicked4 = false;
    Boolean clicked5 = false;
    Boolean clicked6 = false;
    Boolean clicked7 = false;
    Boolean clicked8 = false;
    Boolean clicked9 = false;
    int turn = 0;

    public void checkWinner()
    {

        if(b1.getText().equals("X")&&b2.getText().equals("X")&&b3.getText().equals("X"))
        {
            playerTurn.setText("X won the game");

        }
        else if(b4.getText().equals("X")&&b5.getText().equals("X")&&b6.getText().equals("X"))
        {
            playerTurn.setText("X won the game");

        }
        else if(b7.getText().equals("X")&&b8.getText().equals("X")&&b9.getText().equals("X"))
        {
            playerTurn.setText("X won the game");

        }
        else if(b1.getText().equals("X")&&b4.getText().equals("X")&&b7.getText().equals("X"))
        {
            playerTurn.setText("X won the game");

        }
        else if(b2.getText().equals("X")&&b5.getText().equals("X")&&b8.getText().equals("X"))
        {
            playerTurn.setText("X won the game");

        }
        else if(b3.getText().equals("X")&&b6.getText().equals("X")&&b9.getText().equals("X"))
        {
            playerTurn.setText("X won the game");

        }
        else if(b1.getText().equals("X")&&b5.getText().equals("X")&&b9.getText().equals("X"))
        {
            playerTurn.setText("X won the game");

        }
        else if(b3.getText().equals("X")&&b5.getText().equals("X")&&b7.getText().equals("X"))
        {
            playerTurn.setText("X won the game");

        }
        else if(b1.getText().equals("O")&&b2.getText().equals("O")&&b3.getText().equals("O"))
        {
            playerTurn.setText("O won the game");


        }
        else if(b4.getText().equals("O")&&b5.getText().equals("O")&&b6.getText().equals("O"))
        {
            playerTurn.setText("O won the game");

        }
        else if(b7.getText().equals("O")&&b8.getText().equals("O")&&b9.getText().equals("O"))
        {
            playerTurn.setText("O won the game");

        }
        else if(b1.getText().equals("O")&&b4.getText().equals("O")&&b7.getText().equals("O"))
        {
            playerTurn.setText("O won the game");

        }
        else if(b2.getText().equals("O")&&b5.getText().equals("O")&&b8.getText().equals("O"))
        {
            playerTurn.setText("O won the game");

        }
        else if(b3.getText().equals("O")&&b6.getText().equals("O")&&b9.getText().equals("O"))
        {
            playerTurn.setText("O won the game");

        }
        else if(b1.getText().equals("O")&&b5.getText().equals("O")&&b9.getText().equals("O"))
        {
            playerTurn.setText("O won the game");

        }
        else if(b3.getText().equals("O")&&b5.getText().equals("O")&&b7.getText().equals("O"))
        {
            playerTurn.setText("O won the game");

        }

        else if(turn>8)
        {
            playerTurn.setText("Cats Game - NO WINNER");

        }

        else if(turn%2==0)
        {
            playerTurn.setText("X Turn");
        }
        else if(turn%2==1)
        {
            playerTurn.setText("O Turn");
        }

    }

    View.OnClickListener buttonListener1 = new View.OnClickListener(){
        public void onClick(View v) {
    if(clicked1)
    {
    }
            else
    {
        clicked1 = true;
        turn++;
        if(turn%2==0)
            b1.setText("O");
        else
            b1.setText("X");
        checkWinner();
    }
        }
    };

    View.OnClickListener buttonListener2 = new View.OnClickListener(){
        public void onClick(View v) {
            if(clicked2)
            {
            }
            else
            {
                clicked2 = true;
                turn++;
                if(turn%2==0)
                    b2.setText("O");
                else
                    b2.setText("X");
                checkWinner();
            }
        }
    };

    View.OnClickListener buttonListener3 = new View.OnClickListener(){
        public void onClick(View v) {
            if(clicked3)
            {
            }
            else
            {
                clicked3 = true;
                turn++;
                if(turn%2==0)
                    b3.setText("O");
                else
                    b3.setText("X");
                checkWinner();
            }
        }
    };

    View.OnClickListener buttonListener4 = new View.OnClickListener(){
        public void onClick(View v) {
            if(clicked4)
            {
            }
            else
            {
                clicked4 = true;
                turn++;
                if(turn%2==0)
                    b4.setText("O");
                else
                    b4.setText("X");
                checkWinner();
            }
        }
    };

    View.OnClickListener buttonListener5 = new View.OnClickListener(){
        public void onClick(View v) {
            if(clicked5)
            {
            }
            else
            {
                clicked5 = true;
                turn++;
                if(turn%2==0)
                    b5.setText("O");
                else
                    b5.setText("X");
                checkWinner();
            }
        }
    };

    View.OnClickListener buttonListener6 = new View.OnClickListener(){
        public void onClick(View v) {
            if(clicked6)
            {
            }
            else
            {
                clicked6 = true;
                turn++;
                if(turn%2==0)
                    b6.setText("O");
                else
                    b6.setText("X");
                checkWinner();
            }
        }
    };

    View.OnClickListener buttonListener7 = new View.OnClickListener(){
        public void onClick(View v) {
            if(clicked7)
            {
            }
            else
            {
                clicked7 = true;
                turn++;
                if(turn%2==0)
                    b7.setText("O");
                else
                    b7.setText("X");
                checkWinner();
            }
        }
    };

    View.OnClickListener buttonListener8 = new View.OnClickListener(){
        public void onClick(View v) {
            if(clicked8)
            {
            }
            else
            {
                clicked8 = true;
                turn++;
                if(turn%2==0)
                    b8.setText("O");
                else
                    b8.setText("X");
                checkWinner();
            }
        }
    };

    View.OnClickListener buttonListener9 = new View.OnClickListener(){
        public void onClick(View v) {
            if(clicked9)
            {
            }
            else
            {
                clicked9 = true;
                turn++;
                if(turn%2==0)
                    b9.setText("O");
                else
                    b9.setText("X");
                checkWinner();
            }
        }
    };


    View.OnClickListener buttonListener10 = new View.OnClickListener(){
        public void onClick(View v) {
            Intent intent = getIntent();
            finish();
            startActivity(intent);
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_player_game_local);
        playerTurn = (TextView)findViewById(R.id.playerturn);
        b1 = (Button)findViewById(R.id.imageButton1);
        b1.setOnClickListener(buttonListener1);
        b2 = (Button)findViewById(R.id.imageButton2);
        b2.setOnClickListener(buttonListener2);
        b3 = (Button)findViewById(R.id.imageButton3);
        b3.setOnClickListener(buttonListener3);
        b4 = (Button)findViewById(R.id.imageButton4);
        b4.setOnClickListener(buttonListener4);
        b5 = (Button)findViewById(R.id.imageButton5);
        b5.setOnClickListener(buttonListener5);
        b6 = (Button)findViewById(R.id.imageButton6);
        b6.setOnClickListener(buttonListener6);
        b7 = (Button)findViewById(R.id.imageButton7);
        b7.setOnClickListener(buttonListener7);
        b8 = (Button)findViewById(R.id.imageButton8);
        b8.setOnClickListener(buttonListener8);
        b9 = (Button)findViewById(R.id.imageButton9);
        b9.setOnClickListener(buttonListener9);
        reset = (Button)findViewById(R.id.reset);
        reset.setOnClickListener(buttonListener10);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_two_player_game_local, menu);
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
