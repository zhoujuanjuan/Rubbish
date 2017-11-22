package zrubbish.com.zhoujuanjuan.zrubbish.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

import zrubbish.com.zhoujuanjuan.zrubbish.R;

/**
 * Created by zhoujuanjuan on 17/11/22.
 */

public class RabbitView extends View {
    public float bitmapX;
    public float bitmapY;
    private Bitmap bitmap;

    public RabbitView(Context context) {
        super(context);
        bitmap = BitmapFactory.decodeResource(this.getResources(), R.drawable.rabbit_1);
        bitmapX = bitmap.getWidth();
        bitmapY = bitmap.getHeight();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        canvas.drawBitmap(bitmap, bitmapX - bitmap.getWidth()/2, bitmapY - bitmap.getHeight()/2, paint);
        if (bitmap.isRecycled()) {
            bitmap.recycle();
        }
    }


}
