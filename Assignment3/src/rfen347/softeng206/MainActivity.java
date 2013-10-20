package rfen347.softeng206;



import java.util.ArrayList;
import java.util.List;

//

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	private Button addContact;
	private Button deleteContact;
	private Button editContact;
	private Button sortContact;
	private ListView listView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		addContact= (Button)findViewById(R.id.add_contact_button);
		deleteContact= (Button)findViewById(R.id.delete_contact_button);
		editContact= (Button)findViewById(R.id.edit_contact_button);
		sortContact= (Button)findViewById(R.id.sort_contact_button);
		listView = (ListView)findViewById(R.id.main_listview);
		setupListView();
		
		addContact.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.setClass(MainActivity.this, AddContactActivity.class);
				startActivity(intent);
				
			}
		})
		;
		
		deleteContact.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.setClass(MainActivity.this, DeleteContactActivity.class);
				startActivity(intent);
				
			}
		})
		;
		sortContact.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.setClass(MainActivity.this, SortContactActivity.class);
				startActivity(intent);
				
			}
		})
		;
	}
	
	

	ContactList c = new ContactList();
	private void setupListView(){
		c.contactListAdd(new Contact("Jack", "Ham", "0211958402", "123456", "3249504", "JackHam@hotmail.com", "123 Jay Street Auckland", "22/06/91"));
		c.contactListAdd(new Contact("Jack", "Ham", "0211958402", "123456", "3249504", "JackHam@hotmail.com", "123 Jay Street Auckland", "22/06/91"));
		c.contactListAdd(new Contact("Jack", "Ham", "0211958402", "123456", "3249504", "JackHam@hotmail.com", "123 Jay Street Auckland", "22/06/91"));
		c.contactListAdd(new Contact("Jack", "Ham", "0211958402", "123456", "3249504", "JackHam@hotmail.com", "123 Jay Street Auckland", "22/06/91"));
		c.contactListAdd(new Contact("Jack", "Ham", "0211958402", "123456", "3249504", "JackHam@hotmail.com", "123 Jay Street Auckland", "22/06/91"));
		c.contactListAdd(new Contact("Jack", "Ham", "0211958402", "123456", "3249504", "JackHam@hotmail.com", "123 Jay Street Auckland", "22/06/91"));
		c.contactListAdd(new Contact("Jack", "Ham", "0211958402", "123456", "3249504", "JackHam@hotmail.com", "123 Jay Street Auckland", "22/06/91"));
		c.contactListAdd(new Contact("Jack", "Ham", "0211958402", "123456", "3249504", "JackHam@hotmail.com", "123 Jay Street Auckland", "22/06/91"));
		c.contactListAdd(new Contact("Jack", "Ham", "0211958402", "123456", "3249504", "JackHam@hotmail.com", "123 Jay Street Auckland", "22/06/91"));
		c.contactListAdd(new Contact("Jack", "Ham", "0211958402", "123456", "3249504", "JackHam@hotmail.com", "123 Jay Street Auckland", "22/06/91"));
		c.contactListAdd(new Contact("Jack", "Ham", "0211958402", "123456", "3249504", "JackHam@hotmail.com", "123 Jay Street Auckland", "22/06/91"));
		c.contactListAdd(new Contact("Jack", "Ham", "0211958402", "123456", "3249504", "JackHam@hotmail.com", "123 Jay Street Auckland", "22/06/91"));
		c.contactListAdd(new Contact("Jack", "Ham", "0211958402", "123456", "3249504", "JackHam@hotmail.com", "123 Jay Street Auckland", "22/06/91"));
		c.contactListAdd(new Contact("Jack", "Ham", "0211958402", "123456", "3249504", "JackHam@hotmail.com", "123 Jay Street Auckland", "22/06/91"));
		c.contactListAdd(new Contact("Jack", "Ham", "0211958402", "123456", "3249504", "JackHam@hotmail.com", "123 Jay Street Auckland", "22/06/91"));
		c.contactListAdd(new Contact("Jack", "Ham", "0211958402", "123456", "3249504", "JackHam@hotmail.com", "123 Jay Street Auckland", "22/06/91"));
		c.contactListAdd(new Contact("Jack", "Ham", "0211958402", "123456", "3249504", "JackHam@hotmail.com", "123 Jay Street Auckland", "22/06/91"));
		c.contactListAdd(new Contact("Jack", "Ham", "0211958402", "123456", "3249504", "JackHam@hotmail.com", "123 Jay Street Auckland", "22/06/91"));
		c.contactListAdd(new Contact("Jack", "Ham", "0211958402", "123456", "3249504", "JackHam@hotmail.com", "123 Jay Street Auckland", "22/06/91"));
		c.contactListAdd(new Contact("Jack", "Ham", "0211958402", "123456", "3249504", "JackHam@hotmail.com", "123 Jay Street Auckland", "22/06/91"));
		c.contactListAdd(new Contact("Jack", "Ham", "0211958402", "123456", "3249504", "JackHam@hotmail.com", "123 Jay Street Auckland", "22/06/91"));
		c.contactListAdd(new Contact("Jack", "Ham", "0211958402", "123456", "3249504", "JackHam@hotmail.com", "123 Jay Street Auckland", "22/06/91"));
		c.contactListAdd(new Contact("Jack", "Ham", "0211958402", "123456", "3249504", "JackHam@hotmail.com", "123 Jay Street Auckland", "22/06/91"));
		c.contactListAdd(new Contact("Jack", "Ham", "0211958402", "123456", "3249504", "JackHam@hotmail.com", "123 Jay Street Auckland", "22/06/91"));
		c.contactListAdd(new Contact("Jack", "Ham", "0211958402", "123456", "3249504", "JackHam@hotmail.com", "123 Jay Street Auckland", "22/06/91"));
		c.contactListAdd(new Contact("Jack", "Ham", "0211958402", "123456", "3249504", "JackHam@hotmail.com", "123 Jay Street Auckland", "22/06/91"));
		
		ListAdapter listAdapter = new CustomListAdapter(MainActivity.this, c.getDisplayList());
		listView.setAdapter(listAdapter);
		
		listView.setOnItemClickListener(new ListItemClickedListener());
	}
	
	class ListItemClickedListener implements AdapterView.OnItemClickListener{

		//displays a string on what you clicked
		@Override
		public void onItemClick(AdapterView<?> parentView, View clickedView, int clickedViewPosition, long id) {
			// TODO Auto-generated method stub
			Contact selectedContact = c.getDisplayList().get(clickedViewPosition);
			
			String displayString = selectedContact.getFirstName() + " " + selectedContact.getLastName() + "\nMobile Number:" + selectedContact.getMobile() +"\nHome Number:" + selectedContact.getHome() + "\nWork Number:" + selectedContact.getWork();
			Toast.makeText(clickedView.getContext(), displayString, Toast.LENGTH_LONG).show();
		}
		
	}
	private class CustomListAdapter extends ArrayAdapter<Contact>{
		private Context context;
		private List<Contact> contacts;
		
		CustomListAdapter(Context context, List<Contact> contact){
			super(context, android.R.layout.simple_list_item_1, contact);
			
			this.context = context;
			this.contacts = contact;
		}
		//this method defines the layout used for each item
		public View getView(int position, View convertView, ViewGroup parent){
			//Converts a layout described in xml into java code
			LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			View listItemView = inflater.inflate(R.layout.custom_list_item_layout, null);
			
			//Similar to the creation of listviews and buttons, we reference the TextView to its ID found in custom_list_item_layout.xml.
			//Sets the style
			TextView fn = (TextView)listItemView.findViewById(R.id.list_item_text_FN);
			TextView ln = (TextView)listItemView.findViewById(R.id.list_item_text_LN);
			TextView dob = (TextView)listItemView.findViewById(R.id.list_item_text_mobile);
			
			//Sets the text for each position
			fn.setText(contacts.get(position).getFirstName());
			ln.setText(contacts.get(position).getLastName());
			dob.setText(contacts.get(position).getMobile());
			
			return listItemView;
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	

}
