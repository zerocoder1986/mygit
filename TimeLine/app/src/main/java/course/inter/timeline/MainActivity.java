package course.inter.timeline;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.baoyachi.stepview.HorizontalStepView;
import com.baoyachi.stepview.bean.StepBean;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        HorizontalStepView setpview5 = (HorizontalStepView) findViewById(R.id.step_view);
        List<StepBean> stepsBeanList = new ArrayList<>();
        StepBean stepBean0 = new StepBean("step1",1);
        StepBean stepBean1 = new StepBean("step2",1);
        StepBean stepBean2 = new StepBean("step3",1);
        StepBean stepBean3 = new StepBean("step4",0);
        StepBean stepBean4 = new StepBean("step5",-1);
        stepsBeanList.add(stepBean0);
        stepsBeanList.add(stepBean1);
        stepsBeanList.add(stepBean2);
        stepsBeanList.add(stepBean3);
        stepsBeanList.add(stepBean4);



        setpview5
                .setStepViewTexts(stepsBeanList)//总步骤
                .setTextSize(12)//set textSize
                .setStepsViewIndicatorCompletedLineColor(ContextCompat.getColor(MainActivity.this, android.R.color.white))//设置StepsViewIndicator完成线的颜色
                .setStepsViewIndicatorUnCompletedLineColor(ContextCompat.getColor(MainActivity.this, R.color.uncompleted_text_color))//设置StepsViewIndicator未完成线的颜色
                .setStepViewComplectedTextColor(ContextCompat.getColor(MainActivity.this, android.R.color.white))//设置StepsView text完成线的颜色
                .setStepViewUnComplectedTextColor(ContextCompat.getColor(MainActivity.this, R.color.uncompleted_text_color))//设置StepsView text未完成线的颜色
                .setStepsViewIndicatorCompleteIcon(ContextCompat.getDrawable(MainActivity.this, R.drawable.complted))//设置StepsViewIndicator CompleteIcon
                .setStepsViewIndicatorDefaultIcon(ContextCompat.getDrawable(MainActivity.this, R.drawable.default_icon))//设置StepsViewIndicator DefaultIcon
                .setStepsViewIndicatorAttentionIcon(ContextCompat.getDrawable(MainActivity.this, R.drawable.attention))
                .setOnClickListener(this);//设置StepsViewIndicator AttentionIcon
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.step_view:
                Intent intent=new Intent(this, Detail.class);
                startActivity(intent);

            case R.drawable.default_icon:
                Context context1 = getApplicationContext();
                CharSequence text1 = "Hello toast!";
                int duration1 = Toast.LENGTH_SHORT;

                Toast toast1 = Toast.makeText(context1, text1, duration1);
                toast1.show();
                break;


        }

    }
}
