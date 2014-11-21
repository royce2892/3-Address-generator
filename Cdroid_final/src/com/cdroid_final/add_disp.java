package com.cdroid_final;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

public class add_disp extends Activity{

	TextView outp;
	String output;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.add_disp);
		output = this.getIntent().getExtras().getString("name");
	//	Toast.makeText(getApplicationContext(),output, Toast.LENGTH_SHORT).show();

		outp=(TextView) findViewById(R.id.out);
		outp.setText(output);
	}
	

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		finish();
	}


	@Override
	public void onBackPressed() 
	{
		// TODO Auto-generated method stub
		super.onBackPressed();
		Intent intent = new Intent(this, Main.class);
		startActivity(intent);
	}
	
	


}
