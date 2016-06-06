package com.example.windows.intent;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    public static final String TAG ="MainActivity";
    public static final String EXTRA_INT = "int";
    public static final String EXTRA_DOUBLE = "double";
    public static final String EXTRA_BOOL = "bool";
    public static final String EXTRA_STRING = "string";
    public static final String EXTRA_OBJ = "obj";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(TAG, "onRestoreInstanceState");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        Log.d(TAG, "onSaveInstanceState");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }
    /**
     * 创建菜单
     * @param menu
     * @return
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //加载菜单文件
        getMenuInflater().inflate(R.menu.main,menu);

        return super.onCreateOptionsMenu(menu);
    }

    /**
     * 选中菜单项
     * @param item
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId()==R.id.action_next){
            //跳转到另一个活动
            Intent intent = new Intent(this, NextActivity.class);

            //要执行操作
            //1.动作
            //2.数据
            intent.putExtra(EXTRA_INT,1);
            intent.putExtra(EXTRA_DOUBLE,1.2);
            intent.putExtra(EXTRA_BOOL,false);
            intent.putExtra(EXTRA_STRING,"hello");
            intent.putExtra(EXTRA_OBJ,new Info(9,"nine"));


            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }

}