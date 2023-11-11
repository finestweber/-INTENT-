package com.mycompany.myapp;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.GestureDetector.*;
import android.view.View.*;
import android.content.*;
import android.widget.SearchView.*;
import android.view.*;

public class MainActivity extends Activity 
{
	Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		button1=findViewById(R.id.button1);
		button1.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1)
				
				{
					Intent in = new Intent(getApplicationContext(),page2.class);
					startActivity(in);
					
					// TODO: Implement this method
				}

	});
  }
				
}
