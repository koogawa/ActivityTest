package com.example.activitytest;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class ActivityTest extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	Log.i("TEST", "onCreate() called.");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    public void onStart() {
    	Log.i("TEST", "onStart() called.");
    	super.onStart();
    }
    
    public void onRestart() {
    	Log.i("TEST", "onRestart() called.");
    	super.onRestart();
    }

    public void onResume() {
    	Log.i("TEST", "onResume() called.");
    	super.onResume();
    }
    
    public void onPause() {
    	Log.i("TEST", "onPause() called.");
    	super.onPause();
    }
    
    public void onStop() {
    	Log.i("TEST", "onStop() called.");
    	super.onStop();
    }

    public void onDestroy() {
    	Log.i("TEST", "onDestory() called.");
    	super.onDestroy();
    }
}