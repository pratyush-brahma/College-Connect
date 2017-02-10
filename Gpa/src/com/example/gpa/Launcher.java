package com.example.gpa;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Launcher extends Activity implements OnClickListener {
	TextView tv;
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.launcher);
	Button b=(Button) findViewById(R.id.button1);
	b.setOnClickListener(this);
	tv=(TextView)findViewById(R.id.textView1);
	tv.setMovementMethod(new ScrollingMovementMethod());
	tv.setText("This GPA calculator calculates your expected SPI.\n\nIn the next page, enter the grades obtained in the respective subjects as per the following:\n\nIf marks obtained>=102, grade=10.\nIf marks obtained>=90, grade=9.\nIf marks obtained>=78, grade=8.\nIf marks obtained>=66, grade=7.\nIf marks obtained>=54, grade=6.\nIf marks obtained>=42, grade=5.\n\nA grade below 5 in any subject is considered fail and hence no SPI is obtained.");
}

@Override
public void onClick(View v) {
	// TODO Auto-generated method stub
	Intent i=new Intent(getApplicationContext(), MainActivity.class);
	ActivityOptions ao=ActivityOptions.makeScaleUpAnimation(v, 0, 0, v.getWidth(), v.getHeight());
	startActivity(i);
}
}
