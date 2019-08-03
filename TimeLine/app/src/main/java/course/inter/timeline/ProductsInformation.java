package course.inter.timeline;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ProductsInformation extends AppCompatActivity implements View.OnClickListener {
Button tv1, tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products_information);
        tv1=(Button)findViewById(R.id.productExplonation2);
        //tv2=(Button)findViewById(R.id.productExplonation) ;
        tv1.setOnClickListener(this);

    }
    public void onClick(View v ){
        switch (v.getId()){
            case R.id.productExplonation2:
            String url = "www.http://molco.co.il/";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
        }


        //String s="HTTPS://www.google.com";
      //  new URL("HTTPS://www.google.com");
    }
}
