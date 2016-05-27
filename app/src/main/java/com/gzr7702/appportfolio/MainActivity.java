package com.gzr7702.appportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /*
    * Function that will create a toast based on
    * the tag of the button
     */
    public void createToast(View v) {
        String viewID = v.getTag().toString();
        String text = "This button will launch my " + viewID + " app!";
        Toast.makeText(this, text, Toast.LENGTH_LONG).show();
    }

}
