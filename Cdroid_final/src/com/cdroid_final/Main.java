package com.cdroid_final;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main extends Activity implements OnClickListener  {
	
	EditText pgm;
	Button comp;
	String program=new String();
	String req="";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.main);
		pgm=(EditText) findViewById(R.id.pgm);
		comp=(Button) findViewById(R.id.comp);
//		 String program="a=b-c+d+e*f";
//       String program="a =t11+t12";
		comp.setOnClickListener(this);
 //   InputStream is = new ByteArrayInputStream(program.getBytes());
 /*   Yylex y= new Yylex(is);
   
    YYParser parse;
    System.out.println("3 address code inna pidichooo :P :P!!!");

   parse = new YYParser((YYParser.Lexer)y);
    try {
        boolean parse1 = parse.parse();
        String output=parse.output();
       System.out.println("ok"+output);
    } catch (IOException ex) {
        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
    }*/
    
    
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId())
		{
		case R.id.comp:
			program=pgm.getText().toString();
			InputStream is = new ByteArrayInputStream(program.getBytes());
			    Yylex y= new Yylex(is);
			    String output=new String();
			   
			    YYParser parse;
		//	    System.out.println("3 address code inna pidichooo :P :P!!!");

			   parse = new YYParser((YYParser.Lexer)y);
			    	try {
			            boolean parse1 = parse.parse();
			            if(parse1==true)
			            {
			            	req=parse.outp;
			            	System.out.println(req);
			            	Intent intent = new Intent(this, add_disp.class);
			    			intent.putExtra("name",req);
			    	//		Toast.makeText(this, program, Toast.LENGTH_SHORT).show();

			    			startActivity(intent);
			            }
			            else
			            	{
			            	req=y.error;
					    		Toast.makeText(this, req, Toast.LENGTH_LONG).show();
			            	}
			    } catch (IOException ex) {
			        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
			    }
			    
	//		Toast.makeText(this, req, Toast.LENGTH_SHORT).show();
			
			break;
		}
		
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

}
