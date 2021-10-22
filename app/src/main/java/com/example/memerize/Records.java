package com.example.memerize;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

public class Records extends TabActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.records);

        TabHost tabHost = getTabHost();


        TabHost.TabSpec timetab = tabHost.newTabSpec("Time");

        timetab.setIndicator("по времени", getResources().getDrawable(R.drawable.time));

        Intent timeIntent = new Intent(this, RecordTime.class);
        timetab.setContent(timeIntent);


        TabHost.TabSpec pointtab = tabHost.newTabSpec("Click");
        pointtab.setIndicator("по количеству ходов", getResources().getDrawable(R.drawable.point));
        Intent pointIntent = new Intent(this, RecordClick.class);
        pointtab.setContent(pointIntent);

        tabHost.addTab(timetab);
        tabHost.addTab(pointtab);
    }
}

