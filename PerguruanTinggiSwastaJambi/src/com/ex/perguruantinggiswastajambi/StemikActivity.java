package com.ex.perguruantinggiswastajambi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class StemikActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_stemik);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.stemik, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	public void opensejarahstemik(View v){
		Intent i = new Intent(getApplicationContext(), Sejarah_stemikActivity.class);
		startActivity(i);
		}
	public void openvisstemik(View v){
		Intent i = new Intent(getApplicationContext(), Visi_stemikActivity.class);
		startActivity(i);
		}
	public void openjurusanstemik(View v){
		Intent i = new Intent(getApplicationContext(), Jurusan_stemikActivity.class);
		startActivity(i);
		}



}
