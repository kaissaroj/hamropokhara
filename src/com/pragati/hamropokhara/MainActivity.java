package com.pragati.hamropokhara;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends Activity {

	ListView lv;
	Button feed,send;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		 // storing string resources into Array
		feed= (Button) findViewById(R.id.feed);
		
		lv = (ListView) findViewById(R.id.listView1);
	
		String[] PHOTO_SIZES = { "Introduction", "Lakeside","Begnas",
			"Barahi Temple", "Bindabasini Temple","International Mountain Museum","Mahendra Cave","Bat Cave","Shanti Stupa","Sarangkot","Davis Fall","Gupteshor Cave" };
		
	
       // String[] adobe_products = getResources().getStringArray(R.array.cities);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, PHOTO_SIZES);
        
        adapter.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);
        lv.setAdapter(adapter);
        // Binding resources Array to ListAdapter
        lv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				
			switch(arg2){
			case 0:
				
				Intent i = new Intent(MainActivity.this,Introduc.class);
				startActivity(i);
				break;
				
				case 1:
					
					Intent ii = new Intent(MainActivity.this,Lake.class);
					startActivity(ii);
					break;
				case 2:
					//setContentView(R.layout.activity_begnas);
					Intent iii = new Intent(MainActivity.this,Beg.class);
					startActivity(iii);
					break;
					
				case 3:
					//setContentView(R.layout.activity_barahi);
					Intent iiii = new Intent(MainActivity.this,Barahi.class);
					startActivity(iiii);
					
					break;
				case 4:
					//setContentView(R.layout.activity_binda);
					Intent iv = new Intent(MainActivity.this,Bindas.class);
					startActivity(iv);
					
					break;
				case 5:
					//setContentView(R.layout.activity_museum);
					Intent v = new Intent(MainActivity.this,Muse.class);
					startActivity(v);
					
					break;
				case 6:
					//setContentView(R.layout.activity_mahendra);
					Intent vi = new Intent(MainActivity.this,Mahen.class);
					startActivity(vi);
					
					break;
				case 7:
					//setContentView(R.layout.activity_bat);
					Intent vii = new Intent(MainActivity.this,Batcav.class);
					startActivity(vii);
					
					break;
				case 8:
					//setContentView(R.layout.activity_shanti);
					Intent viii = new Intent(MainActivity.this,Shantii.class);
					startActivity(viii);
					
					break;
				case 9:
					//setContentView(R.layout.activity_sarangkot);
					Intent ix = new Intent(MainActivity.this,Saran.class);
					startActivity(ix);
					
					break;
				case 10:
					//setContentView(R.layout.activity_davis);
					Intent x = new Intent(MainActivity.this,Daviss.class);
					startActivity(x);
					
					break;
				case 11:
					//setContentView(R.layout.activity_gup);
					Intent xi = new Intent(MainActivity.this,Guptesor.class);
					startActivity(xi);
					
					break;
				
					
				}
		
			
			
			}
		});

        
      
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
