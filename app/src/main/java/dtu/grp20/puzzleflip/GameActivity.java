package dtu.grp20.puzzleflip;

import android.content.ClipData;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.AsyncTask;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class GameActivity extends AppCompatActivity {

    ImageView imageView;
    WebView webView ;
    float x,y;
    float xFingerSidst , yFingerSidst;
    MotionEvent event;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        imageView = (ImageView) findViewById(R.id.brik1);

    }


    @Override
    public boolean onTrackballEvent(MotionEvent event) {
        x = x + event.getX();
        y = y + event.getY();
        return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        System.out.println(event);
        System.out.println(event.getAction());
        if (event.getAction() == MotionEvent.ACTION_MOVE ) {
            // husk startpunkt
            imageView.setX(event.getX());
            imageView.setY(event.getY());
            float dx = event.getX() - xFingerSidst;
            float dy = event.getY() - yFingerSidst;
            x = x + dx;
            y = y + dy;
        }
        xFingerSidst = event.getX();
        yFingerSidst = event.getY();
        return true;
    }





}
