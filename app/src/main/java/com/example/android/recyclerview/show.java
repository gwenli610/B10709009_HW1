package com.example.android.recyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class show extends AppCompatActivity {
    TextView txv1;
    Button btn1;
    Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        Bundle bundle=getIntent().getExtras();
        int number=bundle.getInt("number");
        txv1=(TextView)findViewById(R.id.showtxt);
        txv1.setText("你剛剛選了"+number+"個項目");
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn1.setOnClickListener(btn1listener);
        btn2.setOnClickListener(btn2listener);
    }
    public Button.OnClickListener btn1listener=new Button.OnClickListener(){

        @Override
        public void onClick(View v) {
            Intent intent=new Intent();
            intent.setClass(show.this,MainActivity.class);

                  /* 结束这个activity */
                   show.this.finish();
        }
    };
    public Button.OnClickListener btn2listener=new Button.OnClickListener(){

        @Override
        public void onClick(View v) {

            Intent intent=new Intent();
            intent.setClass(show.this,MainActivity.class);
            show.this.onDestory();
        }
    };
    private void onDestory() {
        super.onDestroy();
    }
}
