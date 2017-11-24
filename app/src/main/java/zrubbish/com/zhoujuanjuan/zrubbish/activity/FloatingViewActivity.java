package zrubbish.com.zhoujuanjuan.zrubbish.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;

import zrubbish.com.zhoujuanjuan.zrubbish.R;
import zrubbish.com.zhoujuanjuan.zrubbish.view.ZFloatView;

public class FloatingViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floating_view);
        ZFloatView floatView = new ZFloatView(getApplicationContext());
        View subView = LayoutInflater.from(this).inflate(R.layout.floating_toast_view,null);
//        ObjectAnimator icon_anim = ObjectAnimator.ofFloat(imgCircle, "rotationY", 0.0F, 359.0F);
//        icon_anim.setRepeatCount(-1);
//        icon_anim.setDuration(1000);
//        icon_anim.setInterpolator(interpolator); //设置匀速旋转，不卡顿 icon_anim.start();

        floatView.setView(subView);
        floatView.show();

        ImageView imgCircle = (ImageView) subView.findViewById(R.id.img_circle_animation);
        LinearInterpolator interpolator = new LinearInterpolator();
        //立体旋转
//        ObjectAnimator icon_anim = ObjectAnimator.ofFloat(imgCircle, "rotationY", 0.0F, 359.0F);
//        icon_anim.setRepeatCount(-1);
//        icon_anim.setDuration(1000);
//        icon_anim.setInterpolator(interpolator);
//        icon_anim.start();
        //平面旋转
        Animation circleAnimation = AnimationUtils.loadAnimation(this,R.anim.icon_rotate);
        circleAnimation.setInterpolator(interpolator);
        if(null != circleAnimation){
            subView.findViewById(R.id.img_circle_animation).startAnimation(circleAnimation);
        }

    }
}
