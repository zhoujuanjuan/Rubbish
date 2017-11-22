package zrubbish.com.zhoujuanjuan.zrubbish.activity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;

import java.util.Timer;
import java.util.TimerTask;

import zrubbish.com.zhoujuanjuan.zrubbish.R;

public class RabbitAnimationActivity extends AppCompatActivity {

    private FrameLayout framelayout;
    private Handler mHandler;
    private static final int HANDLER_WHAT = 0X1A;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rabbit_animation);
        framelayout = (FrameLayout) findViewById(R.id.root_layout);
//        final RabbitView rabbitView = new RabbitView(this);
//        rabbitView.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                rabbitView.bitmapX = event.getX();
//                rabbitView.bitmapY = event.getY();
//                rabbitView.invalidate();
//                return true;
//            }
//        });
//        framelayout.addView(rabbitView);

        mHandler = new Handler(){
            int index = 0;
            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                if(msg.what == HANDLER_WHAT)
                index++;
                move(index%8);

            }
        };

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                mHandler.sendEmptyMessage(HANDLER_WHAT);
            }
        },2,300);

    }


    private void move(int index){
        switch(index){
            case 0:
                framelayout.setForeground(getResources().getDrawable(R.drawable.rabbit_1));
                break;
            case 1:
                framelayout.setForeground(getResources().getDrawable(R.drawable.rabbit_2));
                break;
            case 2:
                framelayout.setForeground(getResources().getDrawable(R.drawable.rabbit_3));
                break;
            case 3:
                framelayout.setForeground(getResources().getDrawable(R.drawable.rabbit_4));
                break;
            case 4:
                framelayout.setForeground(getResources().getDrawable(R.drawable.rabbit_5));
                break;
            case 5:
                framelayout.setForeground(getResources().getDrawable(R.drawable.rabbit_6));
                break;
            case 6:
                framelayout.setForeground(getResources().getDrawable(R.drawable.rabbit_7));
                break;
            case 7:
                framelayout.setForeground(getResources().getDrawable(R.drawable.rabbit_8));
                break;
        }

    }



}
