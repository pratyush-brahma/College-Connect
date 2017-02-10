package in.wptrafficanalyzer.listfragmentimagestext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

public class CountryList extends ListFragment {
	
	// Array of strings storing country names
    String[] countries = new String[] {
            "Profile",
            "GPA",
            "Schedule",
            "About Us",
             };    
    
    
    // Array of strings to store currencies
    String[] currency = new String[]{
    	"Check On your profile.\nCheck out your peers' profile.\nKnow. Connect. Interact.",
    	"Worried about your grades?\nNow worry only for the study.\nKeep a check on your expected SPI using the GPA calculator.",
    	"Why remember something when you can always look it up?\nNow be up-to-date with the classes using this schedule.",
    	"Well, if you want to know about the brains behind this app\nCheck us out."
    	    };
    
    
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {	
		
		// Each row in the list stores country name, currency and flag
        List<HashMap<String,String>> aList = new ArrayList<HashMap<String,String>>();        
        
        for(int i=0;i<4;i++){
        	HashMap<String, String> hm = new HashMap<String,String>();
            hm.put("txt", ""+ countries[i]);
            hm.put("cur","" + currency[i]);
                        
            aList.add(hm);        
        }
        
        // Keys used in Hashmap
        String[] from = {"txt","cur" };
        
        // Ids of views in listview_layout
        int[] to = { R.id.txt,R.id.cur};        
        
        // Instantiating an adapter to store each items
        // R.layout.listview_layout defines the layout of each item
        SimpleAdapter adapter = new SimpleAdapter(getActivity().getBaseContext(), aList, R.layout.listview_layout, from, to);       
		
		setListAdapter(adapter);
		getListView().setDividerHeight(10);
		
		
		return super.onCreateView(inflater, container, savedInstanceState);		
	}
	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		switch (position) {
		case 0:
			Toast.makeText(getActivity(), "0",Toast.LENGTH_SHORT).show();
			break;

		default:
			break;
		}
		super.onListItemClick(l, v, position, id);
	}

}
