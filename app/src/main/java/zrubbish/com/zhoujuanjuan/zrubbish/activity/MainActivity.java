package zrubbish.com.zhoujuanjuan.zrubbish.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import zrubbish.com.zhoujuanjuan.zrubbish.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.test_event).setOnClickListener(this);
        findViewById(R.id.test_paoma).setOnClickListener(this);
        findViewById(R.id.test_rabbit).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.test_event:
                Intent intent = new Intent(this,TestEventActivity.class);
                startActivity(intent);
                break;
            case R.id.test_paoma:
                Intent paomaIntent = new Intent(this,PaomaActivity.class);
                startActivity(paomaIntent);
                break;
            case R.id.test_rabbit:
                Intent animationIntent = new Intent(this,RabbitAnimationActivity.class);
                startActivity(animationIntent);
                break;

        }
    }
}
