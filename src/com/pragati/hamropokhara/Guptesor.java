package com.pragati.hamropokhara;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Guptesor extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_gup);
		Button getmap;
		getmap = (Button) findViewById(R.id.getmap);
		getmap.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent maper = new Intent(Guptesor.this,Showmap.class);
				maper.putExtra("mapvalue", 10);
				startActivity(maper);
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_guptesor, menu);
		return true;
	}

}
