package necer.ncalendardemo.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.necer.ncalendar.calendar.NMonthCalendar;
import com.necer.ncalendar.utils.Utils;

import org.joda.time.DateTime;

import necer.ncalendardemo.R;

/**
 * Created by 闫彬彬 on 2017/8/28.
 * QQ:619008099
 */

public class TestActivity extends Activity{


    private NMonthCalendar nmcalendar;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);


        Utils.getMonthCalendar2(new DateTime("2019-09-01"), 1);


        nmcalendar = (NMonthCalendar) findViewById(R.id.nmcalendar);



    }

}