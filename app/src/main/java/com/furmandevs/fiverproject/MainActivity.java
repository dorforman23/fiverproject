package com.furmandevs.fiverproject;

import androidx.appcompat.app.AppCompatActivity;
import android.content.pm.ActivityInfo;
import android.icu.util.HebrewCalendar;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class MainActivity extends AppCompatActivity {

    int dayNum, hour, minute;
    String dayTXT, fullTime;
    String[] fullDay = {"ראשון", "שני", "שלישי", "רביעי", "חמישי", "שישי", "שבת"};
    TextView dayTxt, dayGuideTxt, dayORnight, currentTime, hebrewDate, interenationalDate;
    Calendar calendar;
    Date date;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);


        dayTxt = findViewById(R.id.dayTXT);
        dayGuideTxt = findViewById(R.id.dayGuideTxt);
        dayORnight = findViewById(R.id.dayORnight);
        currentTime = findViewById(R.id.currentTime);
        hebrewDate = findViewById(R.id.hebrewDate);
        interenationalDate = findViewById(R.id.interenationalDate);

        calendar = Calendar.getInstance();
        dayNum = calendar.get(Calendar.DAY_OF_WEEK);
        dayTxt.setText(fullDay[dayNum-1]);

        hour = calendar.get(Calendar.HOUR_OF_DAY);
        minute = calendar.get(Calendar.MINUTE);

        fullTime = String.valueOf(hour) + ":" + String.valueOf(minute);

        currentTime.setText(fullTime);

        /*hebrewDate.setText(HebrewCalendar());

        HebrewCalendar hebrewCalendar = HebrewCalendar.getInstance();
*/
    }
}













