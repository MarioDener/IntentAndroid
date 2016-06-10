package com.codemario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String dataImport = "Default Value";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void consoleLog(View v){
        TextView mytext = (TextView) findViewById(R.id.textView);
        mytext.setText("Hola Mario");
        EditText txtData = (EditText) findViewById(R.id.txtDato);
        this.dataImport = (String)txtData.getText().toString();
        Log.d("debugger","Control tengo chance");
    }

    public void  loadOtherActivity(View v){
        Intent myIntent = new Intent(this,OtherActivity.class);
        myIntent.putExtra(Intent.EXTRA_TEXT,this.dataImport);

        startActivity(myIntent);
    }

}
