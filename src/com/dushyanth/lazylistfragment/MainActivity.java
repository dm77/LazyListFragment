package com.dushyanth.lazylistfragment;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.content.Intent;

public class MainActivity extends Activity
{
    private static final String TAG = "MainActivity";
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void launchUserListActivity(View v) {
        Intent intent = new Intent(this, UserListActivity.class);
        startActivity(intent);
    }
}
