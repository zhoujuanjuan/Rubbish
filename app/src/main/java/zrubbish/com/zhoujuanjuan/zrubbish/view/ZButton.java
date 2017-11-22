package zrubbish.com.zhoujuanjuan.zrubbish.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Button;

/**
 * Created by zhoujuanjuan on 17/11/20.
 */

@SuppressLint("AppCompatCustomView")
public class ZButton extends Button {
    public ZButton(Context context) {
        super(context);
    }

    public ZButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ZButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.d("zjj", "---button---dispatchTouchEvent----" + event.getAction() + "   buttonId" + getId());
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d("zjj", "---- button--onTouchEvent----" + event.getAction() + "buttonId" + getId());

        return super.onTouchEvent(event);
    }
}
