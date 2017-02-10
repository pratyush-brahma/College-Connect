package com.example.collegeconnect;

import android.app.Activity;
import android.content.Intent;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class signup extends Activity implements OnClickListener{
	EditText nm,br,sem,roll,pass;
	
	TextView tv;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.signup);
		nm=(EditText)findViewById(R.id.editText1);
		br=(EditText)findViewById(R.id.editText2); 
		sem=(EditText)findViewById(R.id.editText3);
		roll=(EditText)findViewById(R.id.editText4);
		pass=(EditText)findViewById(R.id.editText5);
		tv=(TextView)findViewById(R.id.textView3);
		
		tv.setOnClickListener(this);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		SQLiteDatabase stud=openOrCreateDatabase("Student Profile", MODE_PRIVATE, null);
		stud.execSQL("create table if not exists studprofile(Name varchar,Branch varchar,Semester int,Roll int,Pass varchar,Brag varchar);");
		stud.execSQL("insert into studprofile values('"+nm.getText()+"','"+br.getText()+"','"+sem.getText()+"','"+roll.getText()+"','"+pass.getText()+"','null');");
		Intent i= new Intent(getApplicationContext(),profile.class);
		startActivity(i);
		Integer k=Integer.parseInt(roll.getText().toString());
		i.putExtra("rolln",k );
		
	}

}
