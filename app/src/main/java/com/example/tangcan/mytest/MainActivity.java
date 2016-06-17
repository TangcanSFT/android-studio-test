package com.example.tangcan.mytest;

import android.app.Activity;
import android.os.PowerManager;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.PopupWindow;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {
    PowerManager.WakeLock wl=null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RoomRecommad_PW pop=new RoomRecommad_PW(MainActivity.this);

                pop.showAtLocation(MainActivity.this.getWindow().getDecorView(),
                        Gravity.RIGHT, 0, 0);

            }
        });


    }



}