package com.xk.androidart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class TestActivity extends AppCompatActivity {
    private EditText mEdit_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        mEdit_text = findViewById(R.id.edit_text);
        LogUtil.e(this,"onCreate");
        if (savedInstanceState!=null){
            String texts = savedInstanceState.getString("mEdit_text");
            LogUtil.e(this,"onCreate  界面重新创建 取出的数据为 ： "  + texts );
        }
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
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("mEdit_text",mEdit_text.getText().toString().trim());
        LogUtil.e(this,"onSaveInstanceState 发生异常状态 保存的数据为 ： "  +  mEdit_text.getText().toString().trim());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        String texts = savedInstanceState.getString("mEdit_text");
        mEdit_text.setText(texts);
        LogUtil.e(this,"onRestoreInstanceState  界面重新创建 取出的数据为 ： "  + texts );
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
}
