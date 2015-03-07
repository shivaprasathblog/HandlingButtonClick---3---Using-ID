package com.example.handlingbuttonclick;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity 
{

	Button b;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
	}
	
	
	public void clickEvent(View v) 
	{
		
		
		if(v.getId()==R.id.button1)
		{
			Toast.makeText(MainActivity.this,"U have Clicked a Button 1 ", Toast.LENGTH_LONG).show();
		}
		
		if(v.getId()==R.id.button2)
		{
			Toast.makeText(MainActivity.this,"U have Clicked a Button 2", Toast.LENGTH_LONG).show();
		}
	
	}

	
	
	


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
