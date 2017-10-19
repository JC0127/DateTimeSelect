package com.qi.datetimeselect;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.qi.datetimeselect.utils.DateTiemDialog;

public class MainActivity extends AppCompatActivity implements DateTiemDialog.TimePickerDialogInterface{

    private DateTiemDialog tiemDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tiemDialog=new DateTiemDialog(this);
    }

    public void click(View view) {
//        tiemDialog.showDateAndTimePickerDialog();
        tiemDialog.showDatePickerDialog();
    }

    @Override
    public void positiveListener() {
        Log.e("time",tiemDialog.getDay()+"");

    }

    @Override
    public void negativeListener() {

    }
}
