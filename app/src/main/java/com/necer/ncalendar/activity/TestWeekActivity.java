package com.necer.ncalendar.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.necer.MyLog;
import com.necer.calendar.BaseCalendar;
import com.necer.calendar.MonthCalendar;
import com.necer.calendar.WeekCalendar;
import com.necer.listener.OnCalendarChangedListener;
import com.necer.listener.OnCalendarMultipleChangedListener;
import com.necer.ncalendar.R;

import org.joda.time.LocalDate;

import java.util.List;

public class TestWeekActivity extends AppCompatActivity {


    private TextView tv_result;
    private WeekCalendar weekCalendar;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week);

        tv_result = findViewById(R.id.tv_result);


        weekCalendar = findViewById(R.id.weekCalendar);

      //  weekCalendar.setDateInterval("2018-10-1","2019-10-10");

        weekCalendar.setOnCalendarChangedListener(new OnCalendarChangedListener() {
            @Override
            public void onCalendarChange(BaseCalendar baseCalendar, int year, int month, LocalDate localDate) {
                tv_result.setText(year + "年" + month + "月" + "   当前页面选中 " + localDate);

                MyLog.d("setOnCalendarChangedListener:::" + year + "年" + month + "月" + "   当前页面选中 " + localDate);
            }
        });

        weekCalendar.setOnCalendarMultipleChangedListener(new OnCalendarMultipleChangedListener() {
            @Override
            public void onCalendarChange(BaseCalendar baseCalendar, int year, int month, List<LocalDate> currectSelectList, List<LocalDate> allSelectList) {

                MyLog.d(year + "年" + month + "月");
                MyLog.d("当前页面选中：：" + currectSelectList);
                MyLog.d("全部选中：：" + allSelectList);

            }
        });

    }

    public void lastMonth(View view) {
        weekCalendar.toLastPager();
    }

    public void nextMonth(View view) {
        weekCalendar.toNextPager();
    }

    public void jump_2018_10_10(View view) {
        weekCalendar.jumpDate("2018-10-10");
    }

    public void jump_2019_10_10(View view) {
        weekCalendar.jumpDate("2019-10-10");
    }

    public void jump_2019_6_10(View view) {
        weekCalendar.jumpDate("2019-6-10");
    }


    public void today(View view) {
        weekCalendar.toToday();
    }
}