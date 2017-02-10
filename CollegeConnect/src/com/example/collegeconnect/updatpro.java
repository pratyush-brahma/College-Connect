package com.example.collegeconnect;

import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class updatpro extends Activity implements OnClickListener{
	EditText et1,et2,et3,et4;
	Button b;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.updatpro);
		et1=(EditText)findViewById(R.id.editText1);
		et2=(EditText)findViewById(R.id.editText2);
		et3=(EditText)findViewById(R.id.editText3);
		et4=(EditText)findViewById(R.id.editText4);
		b=(Button)findViewById(R.id.button1);
		b.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		SQLiteDatabase stud=openOrCreateDatabase("Student Profile", MODE_PRIVATE, null);
		stud.execSQL("update studprofile set Name='"+et1.getText()+"',Semester='"+et2.getText()+"',Branch='"+et3.getText()+"', ");
		
	}

}
