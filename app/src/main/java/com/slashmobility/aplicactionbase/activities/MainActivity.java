package com.slashmobility.aplicactionbase.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.slashmobility.aplicactionbase.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {



    @BindView(R.id.textView)TextView dsplay_text;
    @BindView(R.id.btn_start)Button btn_start;
    @BindView(R.id.btn_stop)Button btn_stop;
    @BindView(R.id.btn_pause)Button btn_pause;
    @BindView(R.id.btn_lap)Button btn_laps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }


    @OnClick(R.id.btn_start)
    protected void statart_chronometer(){

        Toast.makeText(MainActivity.this, "Acccion",Toast.LENGTH_LONG).show();

    }

}
