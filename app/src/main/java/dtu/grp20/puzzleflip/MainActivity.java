package dtu.grp20.puzzleflip;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button startNewGame, continueGame;
    ImageView imageView;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startNewGame = (Button) findViewById(R.id.startNewGameButton);
        continueGame = (Button) findViewById(R.id.continueGameButton);
        textView = (TextView) findViewById(R.id.textView);

        startNewGame.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(MainActivity.this, GameActivity.class));
                    }
                }
        );

        continueGame.setOnClickListener(
                new Button.OnClickListener(){

                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(MainActivity.this, GameActivity.class));
                    }
                }
        );


    }
}
