package com.example.collegeconnect;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Login extends Activity implements OnClickListener{
	Button b1,b2;
	TextView tv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getActionBar().hide();
		
		setContentView(R.layout.activity_login);
		b1=(Button)findViewById(R.id.button1);
		tv=(TextView)findViewById(R.id.textView2);
		b1.setOnClickListener(this);
		tv.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v.getId()==R.id.button1)
		{
			
			}
		if(v.getId()==R.id.textView2)
		{
			Intent i1=new Intent(getApplicationContext(),signup.class);
			startActivity(i1);
		}
		
	}

}
