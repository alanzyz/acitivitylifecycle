package com.play.activitylife;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.btn_one)
    Button btn_one;
    @BindView(R.id.btn_two)
    Button btn_two;
    public static final String TAG="MainActivity";
    public static final String EXTRA_TEXT="EXTRA_TEXT";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        btn_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,TranslateActivity.class));
            }
        });
        btn_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,SecondActivity.class));
            }
        });

        if (savedInstanceState!=null){
            String txt=savedInstanceState.getString(EXTRA_TEXT);
            Log.e(TAG,"onCreate savedInstanceState"+txt);
        }
        Log.e(TAG,"onCreate  ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG,"onResume  ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG,"onRestart  ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG,"onStart  ");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState!=null){
            String txt=savedInstanceState.getString(EXTRA_TEXT);
            Log.e(TAG,"onRestoreInstanceState  savedInstanceState"+txt);
        }
        Log.e(TAG,"onRestoreInstanceState  ");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        if (outState!=null){
            outState.putString(EXTRA_TEXT,"C.L.Wang");
        }
        Log.e(TAG,"onSaveInstanceState  ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG,"onDestroy  ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG,"onPause  ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG,"onStop  ");
    }
}
