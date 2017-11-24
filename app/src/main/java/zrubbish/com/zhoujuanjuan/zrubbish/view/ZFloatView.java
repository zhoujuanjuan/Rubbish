package zrubbish.com.zhoujuanjuan.zrubbish.view;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by zhoujuanjuan on 17/11/24.
 */

public class ZFloatView {
    private Toast toast;
    private Object mTN;
    private Method show;
    private Method hide;

    private int width = WindowManager.LayoutParams.WRAP_CONTENT;
    private int height = WindowManager.LayoutParams.WRAP_CONTENT;

    public ZFloatView(Context applicationContext) {
        toast = new Toast(applicationContext);
    }

    public void setView(View view, int width, int height) {
        this.width = width;
        this.height = height;
        toast.setView(view);
        initTN();
    }

    public void show() {
        try {
            show.invoke(mTN);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void hide() {
        try {
            hide.invoke(mTN);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void setView(View view) {
        toast.setView(view);
        initTN();
    }


    private void initTN() {
        try {
            Field tnField = toast.getClass().getDeclaredField("mTN");
            tnField.setAccessible(true);
            mTN = tnField.get(toast);
            show = mTN.getClass().getMethod("show");
            hide = mTN.getClass().getMethod("hide");
            Field tnParamField = mTN.getClass().getDeclaredField("mParams");
            tnParamField.setAccessible(true);
            WindowManager.LayoutParams params = (WindowManager.LayoutParams) tnParamField.get(mTN);
            params.flags = WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL | WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE;
            params.width = width;
            params.height = height;
            Field tnNextViewField = mTN.getClass().getDeclaredField("mNextView");
            tnNextViewField.setAccessible(true);
            tnNextViewField.set(mTN, toast.getView());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
