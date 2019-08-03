package course.inter.timeline;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class StepsView extends AppCompatActivity implements View.OnClickListener {

Button b1,b2,b3,b4,b5,b6,b7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_steps_view);
        b1=(Button)findViewById(R.id.sending_data);
        b2=(Button)findViewById(R.id.first_call);
        b3=(Button)findViewById(R.id.text_work);
        b4=(Button)findViewById(R.id.control_quality);
        b5=(Button)findViewById(R.id.design);
        b6=(Button)findViewById(R.id.website_config);
        b7=(Button)findViewById(R.id.finished_product);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.design:
                break;
            case R.id.text_work:
                break;
            case R.id.first_call:
                break;
            case R.id.sending_data:
                Intent intent=new Intent(this, SendingData.class);
                startActivity(intent);
                break;
            case R.id.control_quality:
                break;
            case R.id.finished_product:
                break;
            case R.id.website_config:
                Intent intent1=new Intent(this, WebSiteConfig.class);
                startActivity(intent1);
                break;

        }
    }
}
