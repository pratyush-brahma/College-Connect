package com.example.collegeconnect;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.TextView;

public class profile extends Activity {
	TextView tv1,tv2,tv3,tv4,tv5;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.profile);
		tv1=(TextView)findViewById(R.id.textView6);
		tv2=(TextView)findViewById(R.id.textView7);
		tv3=(TextView)findViewById(R.id.textView8);
		tv4=(TextView)findViewById(R.id.textView9);
		tv5=(TextView)findViewById(R.id.textView11);
		Intent i=new Intent();
		
		SQLiteDatabase stud=openOrCreateDatabase("Student Profile", MODE_PRIVATE, null);
		Cursor c=stud.rawQuery("select *from studprofile where Roll='"+i.getIntExtra("rolln", 0)+"'", null);
		while(c.moveToFirst())
		{
			tv1.setText(c.getString(0));
			tv2.setText(c.getString(1));
			tv3.setText(c.getString(2));
			tv4.setText(c.getString(3));
		}
		
		
	}
	

}
