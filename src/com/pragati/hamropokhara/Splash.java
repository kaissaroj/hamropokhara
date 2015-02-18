package com.pragati.hamropokhara;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.Window;

public class Splash extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_splash);
		 new Handler().postDelayed(new Runnable() {
			 
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Intent mainIntent = new Intent(Splash.this,MainActivity.class);
				startActivity(mainIntent);
				Splash.this.finish();
			}
		}, 5000);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_splash, menu);
		return true;
	}

}
