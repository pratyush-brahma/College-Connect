package com.example.gpa;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class firstfrag extends Fragment implements OnClickListener {
	TextView tvs1,tvs2,tvs3,tvs4,tvs5,tvs6,tvs7,tvs8,tvs9,tvs10,tvs11;
	EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7,ed8,ed9,ed10,ed11;
	Button click;
	Integer m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11;
	
	int i,k;
	public void firstfrag() {
		
	}
@Override
public View onCreateView(LayoutInflater inflater, ViewGroup container,
		Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	View view=inflater.inflate(R.layout.firstsem,container,false);
	tvs1=(TextView) view.findViewById(R.id.textView2);
	tvs2=(TextView) view.findViewById(R.id.textView3);
	tvs3=(TextView) view.findViewById(R.id.textView4);
	tvs4=(TextView) view.findViewById(R.id.textView5);
	tvs5=(TextView) view.findViewById(R.id.textView6);
	tvs6=(TextView) view.findViewById(R.id.textView7);
	tvs7=(TextView) view.findViewById(R.id.textView8);
	tvs8=(TextView) view.findViewById(R.id.textView9);
	tvs9=(TextView) view.findViewById(R.id.textView10);
	tvs10=(TextView) view.findViewById(R.id.textView11);
	tvs11=(TextView) view.findViewById(R.id.textView12);
	ed1=(EditText) view.findViewById(R.id.editText1);
	
			
	ed2=(EditText) view.findViewById(R.id.editText2);
	ed3=(EditText) view.findViewById(R.id.editText3);
	ed4=(EditText) view.findViewById(R.id.editText4);
	ed5=(EditText) view.findViewById(R.id.editText5);
	ed6=(EditText) view.findViewById(R.id.editText5);
	ed7=(EditText) view.findViewById(R.id.editText6);
	ed8=(EditText) view.findViewById(R.id.editText7);
	ed9=(EditText) view.findViewById(R.id.editText8);
	ed10=(EditText) view.findViewById(R.id.editText10);
	ed11=(EditText) view.findViewById(R.id.editText11);
	click=(Button) view.findViewById(R.id.button1);
	click.setOnClickListener(this);
	
	/*for(int i=0;i<11;i++)
		m[i]=Integer.parseInt(ed[1].getText().toString());*/
    MainActivity act=(MainActivity) getActivity();
    int i=act.sub();
    if(i<4)
    {tvs1.setText("Engg. Graphics(2)");
    tvs2.setText("Env. & Eco.(4)");
    tvs3.setText("Basic Electronics(4)");
    tvs4.setText("Maths-2(4)");
    tvs5.setText("Basic Mech. & Civil(6)");
    tvs6.setText("CFIT(4)");
    tvs7.setText("E.G. Lab(2)");
    tvs8.setText("Eco. Lab(1)");
    tvs9.setText("B.E. Lab(1)");
    tvs10.setText("CFIT Lab(1)");
    tvs11.setText("Civil & BME Lab(1)");
    
    /*calculate(1);*/
    k=1;}
    else
    {tvs1.setText("Language(2)");
    tvs2.setText("App. Chemistry(4)");
    tvs3.setText("App. Physics(4)");
    tvs4.setText("Maths-1(4)");
    tvs5.setText("Electrical Engg.(4)");
    tvs6.setText("Engg. Mechanics(4)");
    tvs7.setText("Chem. lab(4)");
    tvs8.setText("Physics lab(1)");
    tvs9.setText("Engg. Mech. Lab(1)");
    tvs10.setText("Language Lab(1)");
    tvs11.setText("Electrical Lab(1)");
   /* calculate(2);*/
    k=2;}
	Toast.makeText(getActivity(),""+i, Toast.LENGTH_SHORT).show();
	
	
	return view;
}

@Override
public void onClick(View v) {
	// TODO Auto-generated method stub
	m1=Integer.parseInt(ed1.getText().toString());
	m2=Integer.parseInt(ed2.getText().toString());
	m3=Integer.parseInt(ed3.getText().toString());
	m4=Integer.parseInt(ed4.getText().toString());
	m5=Integer.parseInt(ed5.getText().toString());
	m6=Integer.parseInt(ed6.getText().toString());

	m7=Integer.parseInt(ed7.getText().toString());
	m8=Integer.parseInt(ed8.getText().toString());
	m9=Integer.parseInt(ed9.getText().toString());
	m10=Integer.parseInt(ed10.getText().toString());
	m11=Integer.parseInt(ed11.getText().toString());
	if(k==1)
	{int p;
	p=2*m1+4*m2+4*m3+4*m4+6*m5+4*m6+2*m7+1*m8+1*m9+1*m10+1*m11;
	float q;
	q=p/(32);
	Toast.makeText(getActivity(),""+q, Toast.LENGTH_SHORT).show();}
}
}
