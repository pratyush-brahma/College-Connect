package com.example.collegeconnect;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class home extends ListActivity {
	String a[]={"Profile","Schedule","GPA Calculator","About Us"};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		ArrayAdapter<String> arr= new ArrayAdapter<String>(this, R.id.textView1,R.layout.home, a);
		setListAdapter(arr);
	}
	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id); 
		switch(position)
		{
		case 0:
			Intent i=new Intent(getApplicationContext(),profile.class);
			startActivity(i);
			break;
			//run the below code to navigate to pages
		/*case 1:
			Intent i1=new Intent(getApplicationContext(),schedule.class);
			startActivity(i1);
			break;
		case 2:
			Intent i2=new Intent(getApplicationContext(),gpaclac.class);
			startActivity(i2);
			break;
		case 3:
			Intent i3=new Intent(getApplicationContext(),aboutus.class);
			startActivity(i3);
			break;*/
		
		}
	}

}
