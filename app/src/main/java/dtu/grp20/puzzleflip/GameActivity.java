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



        /*imageView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Log.d("","on touch");
                ClipData data = ClipData.newPlainText("ne","me");
                View.DragShadowBuilder dsb = new View.DragShadowBuilder(v);
                v.startDrag(data,dsb,v,0);
                v.setVisibility(View.INVISIBLE);
                return true;

            }
        });


        imageView.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {

                System.out.print("Whatever");
                int action = event.getAction();
                switch (event.getAction()) {
                    case DragEvent.ACTION_DRAG_STARTED:
                        // do nothing
                        break;
                    case DragEvent.ACTION_DRAG_ENTERED:
                        break;
                    case DragEvent.ACTION_DRAG_EXITED:
                        break;
                    case DragEvent.ACTION_DROP:
                        // Dropped, reassign View to ViewGroup
                        v.setX(event.getX()); //-(v.getWidth()/2));
                        v.setY(event.getY()); //-(v.getHeight()/2));
                        v.setVisibility(View.VISIBLE);
                        System.out.print("Whatever") ;
                        return true;
                    case DragEvent.ACTION_DRAG_ENDED:

                        break;
                    default:
                        break;
                }
                Log.d("","on drag");
                return true;
            }
        });*/




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
         imageView.setX(event.getX()-(imageView.getWidth()/2));
         imageView.setY(event.getY()-(imageView.getHeight()/2));
        if (event.getAction() == MotionEvent.ACTION_MOVE) {
            // husk startpunkt
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
