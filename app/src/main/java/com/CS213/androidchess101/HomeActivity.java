package com.CS213.androidchess101;

import java.util.ArrayList;
import java.util.LinkedList;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.CS213.model.Move;
import com.CS213.model.PlayedGames;
	

public class HomeActivity extends ActionBarActivity {
	
	public static boolean RUN_ONCE = false;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home_activity);
		initPlayButton();
		if (!RUN_ONCE) {
			RUN_ONCE = true;
			PlayedGames.playedGames = new ArrayList<LinkedList<Move>>();
			PlayedGames.gameNames = new ArrayList<String>();
		}
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home, menu);
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

	private void initPlayButton() {

		Button playButton = (Button) findViewById(R.id.playButton);
		playButton.setOnClickListener(new OnClickListener() {

			@Override 
			public void onClick(View argo) {
								
				startActivity(new Intent(HomeActivity.this, ChessActivity.class));
			}
		});
	}
	

}
