package com.example.windows.intent;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

public class NextActivity extends AppCompatActivity {

    private static final String TAG ="NextActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        Log.d(TAG, "onCreate");

        Intent intent =getIntent();

        if(intent!=null){
            double d =intent.getDoubleExtra(MainActivity.EXTRA_DOUBLE,0);
            int i =  intent.getIntExtra(MainActivity.EXTRA_INT, 0);
            boolean b=intent.getBooleanExtra(MainActivity.EXTRA_BOOL, false);
            String s=intent.getStringExtra(MainActivity.EXTRA_STRING);
            Info info= (Info) intent.getSerializableExtra(MainActivity.EXTRA_OBJ);

        }

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
     * 选项菜单被选中
     * @param item
     * @return
     */
    @Override
   public boolean onOptionsItemSelected(MenuItem item) {
        //这个方法是将手机中的返回键和向上键达到的两个活动的生命周期一样
        if(item.getItemId()==android.R.id.home){ //这是系统资源：操作栏左上角up箭头

            //销毁当前活动
           this.finish();
            //时间处理完毕，即使
            // 系统不需要再做任何事情屏蔽系统的默认行为
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}