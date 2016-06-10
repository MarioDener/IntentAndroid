package com.codemario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class OtherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

//        get info from [MainActivity]
        TextView lblMessage = (TextView) findViewById(R.id.lblh1_OtherActivity);
        if (getIntent()!=null && getIntent().hasExtra(Intent.EXTRA_TEXT)){
            lblMessage.setText(getIntent().getStringExtra(Intent.EXTRA_TEXT));
        }
    }

    public void onClickClose(View v){
        Intent myIntent = new Intent();
        myIntent.putExtra(MainActivity.REQUEST_RESULT,42);
        setResult(RESULT_OK,myIntent);
        finish();
    }
}
