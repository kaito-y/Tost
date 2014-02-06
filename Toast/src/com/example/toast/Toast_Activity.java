package com.example.toast;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Toast;


public class Toast_Activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		//トーストの表示
		Toast.makeText(this,"トースト表示のサンプル",Toast.LENGTH_LONG).show();
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.toast_, menu);
		return true;
	}

}
