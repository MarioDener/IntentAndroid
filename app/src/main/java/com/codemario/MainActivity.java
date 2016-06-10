package com.codemario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String dataImport = "Default Value";

    public static final String REQUEST_RESULT = "REQUEST_RESULT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /***
     * Method read a value from EditText and set to TextView
     * @param v
     */

    public void consoleLog(View v){
        TextView mytext = (TextView) findViewById(R.id.textView);
        EditText txtData = (EditText) findViewById(R.id.txtDato);
        this.dataImport = (String)txtData.getText().toString();
        mytext.setText(this.dataImport);
        Log.d("debugger","Control tengo chance");
    }

    /***
     * Method send my property class to [OtherActivity]
     * @param v
     */
    public void  loadOtherActivity(View v){
        Intent myIntent = new Intent(this,OtherActivity.class);
        myIntent.putExtra(Intent.EXTRA_TEXT,this.dataImport);

        startActivityForResult(myIntent,1);
//        startActivity(myIntent);
    }

    protected void startActivityForResult(int requestCode,int resultCode, Intent data){
        super.onActivityResult(requestCode,resultCode,data);
        if (resultCode==RESULT_OK){
            Toast.makeText(this, data.getIntExtra(REQUEST_RESULT,0), Toast.LENGTH_SHORT).show();
        }
    }

}
