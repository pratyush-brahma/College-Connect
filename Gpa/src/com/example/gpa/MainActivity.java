package com.example.gpa;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.text.InputFilter.LengthFilter;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;


public class MainActivity extends Activity implements OnItemSelectedListener {
 Spinner branchsp,semsp;
 FragmentManager fm;
 Fragment frag;
 FragmentTransaction ft;
 Bundle bundle;
 int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        branchsp=(Spinner) findViewById(R.id.spinner1);
        
        ArrayAdapter<CharSequence> badapter=ArrayAdapter.createFromResource(this, R.array.Branch, android.R.layout.simple_spinner_item);
        badapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        branchsp.setAdapter(badapter);
        branchsp.setOnItemSelectedListener(this);
        semsp=(Spinner) findViewById(R.id.spinner2);
        
        ArrayAdapter<CharSequence> sadapter=ArrayAdapter.createFromResource(this, R.array.Semester, android.R.layout.simple_spinner_item);
        sadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        semsp.setAdapter(sadapter);
        semsp.setOnItemSelectedListener(this);
        fm=getFragmentManager();
        frag=new firstfrag();
        ft=fm.beginTransaction();
        ft.add(R.id.semcontainer, frag);
        ft.commit();
        
	
    }    

  /*  @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }*/

	@Override
	public void onItemSelected(AdapterView<?> parent, View arg1, int pos,
			long id) {
		// TODO Auto-generated method stub
		Spinner spinner=(Spinner) parent;
		switch (spinner.getId()) {
		case R.id.spinner1:
			
			
                 
			i=pos;
			    
			
			break;
			//semloading fragments
		case R.id.spinner2:
			
			if(pos==0||pos==1)
			{
			
				fm=getFragmentManager();
	        frag=new firstfrag();
	        ft=fm.beginTransaction();
	        
	        ft.replace(R.id.semcontainer, frag);
	        ft.commit();
	        
			}
			if(pos==2)
			{ fm=getFragmentManager();
	        frag=new firstfrag();
	        ft=fm.beginTransaction();
				frag=new thirdfrag();
				ft.replace(R.id.semcontainer, frag);
				ft.commit();
			}
			break;
		default:
			break;
		}
		/*if(spinner.getId()==R.id.spinner1)
		{Toast.makeText(getApplicationContext(), ""+pos, Toast.LENGTH_SHORT).show();}
		else if(spinner.getId()==R.id.spinner2)
			Toast.makeText(getApplicationContext(), ""+pos, Toast.LENGTH_SHORT).show();*/
	}
	
	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		
	}
	public int sub() {
		return i;
	}
}