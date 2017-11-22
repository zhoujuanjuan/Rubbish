package zrubbish.com.zhoujuanjuan.zrubbish.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import java.util.Random;

/**
 * Created by zhoujuanjuan on 17/11/21.
 */

public class ZPaoMaView extends View {

    private Paint mPaint = new Paint();
    private Random mRandom = new Random();
    private float rx;
    private PaoMaViewThread mViewThread;


    public ZPaoMaView(Context context) {
        super(context);
    }

    public ZPaoMaView(Context context, AttributeSet attrs){
        super(context, attrs);
    }

    public ZPaoMaView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }



    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (mViewThread == null) {
            mViewThread = new PaoMaViewThread();
            mViewThread.start();
        } else {
            mPaint.setTextSize(30f);
//            mPaint.setAlpha(100);
            canvas.drawText("跑马灯小伙。。。",rx,300,mPaint);
        }

    }

    class PaoMaViewThread extends Thread{
        @Override
        public void run() {
            while(true){
                rx += 3;
                if (rx > getWidth()) {
                    rx = 0 - mPaint.measureText("跑马灯效果。。。。");
                }
                int r = mRandom.nextInt(255);
                int g = mRandom.nextInt(255);
                int b = mRandom.nextInt(255);
                mPaint.setARGB(255,r,g,b);
                postInvalidate();
                try{
                    sleep(30);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }


            }
        }
    }
}
