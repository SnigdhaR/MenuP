package com.example.mahe.menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void printToLogs(View view)
    {
        TextView tv1 = (TextView) findViewById(R.id.menu_item_1);
        String str1 = tv1.getText().toString();

        TextView tv2 = (TextView) findViewById(R.id.menu_item_2);
        String str2 = tv2.getText().toString();

        TextView tv3 = (TextView) findViewById(R.id.menu_item_3);
        String str3 = tv3.getText().toString();

        Log.i("MainActivity",str1);
        Log.i("MainActivity",str2);
        Log.i("MainActivity",str3);
    }
}
