package com.pragati.hamropokhara;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.Menu;
import android.widget.Toast;




import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;


public class Showmap extends FragmentActivity {
	private GoogleMap googleMap;
	 int getdata;
	 private double loong,lat;
	 

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_showmap);
		SupportMapFragment fm = (SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.map);
		googleMap= fm.getMap();
		//googleMap =((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map)).getMap();
		getdata = getIntent().getIntExtra("mapvalue", 0);
		switch(getdata){
		
		case 0:		
			lat=28.2053253;
			loong=83.96161929999994;
			break;
		case 1:		
			lat=28.1631834;
			loong=84.0626264;
			break;
		case 2:		
			lat=28.207461;
			loong=83.9535052;
			break;
		case 3:		
			lat=28.2025654;
			loong=83.985008;
			break;
		case 4:		
			lat=28.1896882;
			loong=83.982032;
			break;
		case 5:		
			lat=28.2716142;
			loong=83.9799653;
			break;
		case 6:		
			lat=28.202565400000000000;
			loong=83.985008000000000000;
			break;
		case 7:		
			lat=28.2218759;
			loong=83.99957889999996;
			break;
		case 8:		
			lat=28.2459192;
			loong=83.94871109999997;
			break;
		case 9:		
			lat=28.2025654;
			loong=83.985008;
			break;
		case 10:		
			lat=28.1892602;
			loong=83.95784679999997;
			break;
			
		}
		try{
		
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(new LatLng(lat,loong),18);
	    googleMap.animateCamera(update);
	    }catch (Exception e) {
			// TODO: handle exception
	    	
		}
		
		 
	}
	
	

	/*private void initilizeMap(){
		if(googleMap == null){
			googleMap = ((MapFragment) getFragmentManager().findFragmentById(
                    R.id.map)).getMap();
			
			CameraUpdate update = CameraUpdateFactory.newLatLngZoom(new LatLng(lat,loong),18);
		    googleMap.animateCamera(update);
			
		    //MarkerOptions marker = new MarkerOptions().position(new LatLng(lat, loong)).title("Hello Maps ");
			//googleMap.addMarker(marker);
			//CameraPosition cameraPosition = new CameraPosition.Builder().target(
	          //      new LatLng(lat, loong)).zoom(12).build();
	 
//	googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));

		}
		 if (googleMap == null) {
             Toast.makeText(getApplicationContext(),
                     "Sorry! unable to create maps", Toast.LENGTH_SHORT)
                     .show();
         }
	}*/
	

	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_showmap, menu);
		return true;
	}

}
