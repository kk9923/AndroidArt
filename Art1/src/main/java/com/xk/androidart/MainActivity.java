package com.xk.androidart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LogUtil.e(this,"onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        LogUtil.e(this,"onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        LogUtil.e(this,"onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        LogUtil.e(this,"onPause");
    }



    @Override
    protected void onStop() {
        super.onStop();
        LogUtil.e(this,"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        LogUtil.e(this,"onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        LogUtil.e(this,"onRestart");
    }

    public void TestActivity(View view) {
        Intent intent = new Intent(this,TestActivity.class);
        startActivity(intent);
    }
}
