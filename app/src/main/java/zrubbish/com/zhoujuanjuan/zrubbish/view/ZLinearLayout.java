package zrubbish.com.zhoujuanjuan.zrubbish.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * Created by zhoujuanjuan on 17/11/20.
 */

public class ZLinearLayout extends LinearLayout {
    public ZLinearLayout(Context context) {
        super(context);
    }

    public ZLinearLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ZLinearLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.d("zjj","-----ViewGroup dispatchTouchEvent-----"+ev.getAction());
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.d("zjj","-----ViewGroup onInterceptTouchEvent-----"+ev.getAction());
        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d("zjj","-----ViewGroup onTouchEvent-----"+event.getAction());
        return super.onTouchEvent(event);
    }
}
