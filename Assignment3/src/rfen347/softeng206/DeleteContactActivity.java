package rfen347.softeng206;

import java.util.List;

import rfen347.softeng206.MainActivity.ListItemClickedListener;
import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class DeleteContactActivity extends Activity {
	private Button deleteContact;
	private Button cancel;
	private ListView listView;
	private CheckBox checkbox;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_delete_contact);
		
		deleteContact= (Button)findViewById(R.id.delete2_contact_button);
		cancel = (Button)findViewById(R.id.cancel_contact_button);
		listView = (ListView)findViewById(R.id.delete_listview);
		
		setupListView();
		
		cancel.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.setClass(DeleteContactActivity.this, MainActivity.class);
				startActivity(intent);
				
			}
		})
		;
		deleteContact.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(DeleteContactActivity.this);
				
				dialogBuilder.setTitle("Are you sure you wish to remove contact(s)?");
				dialogBuilder.setMessage("This cannot be undone!");
				dialogBuilder.setPositiveButton("No", null);
				dialogBuilder.setNegativeButton("Yes", new DialogInterface.OnClickListener() {
					//deletes when clicked "OK"
					@Override
					public void onClick(DialogInterface arg0, int arg1) {
						// TODO Auto-generated method stub
						String displayString = "Contact(s) deleted";
						Toast.makeText(deleteContact.getContext(), displayString, Toast.LENGTH_LONG).show();
						
						Intent intent = new Intent();
						intent.setClass(DeleteContactActivity.this, MainActivity.class);
						startActivity(intent);
					}
				});
				dialogBuilder.setCancelable(true);
				
				dialogBuilder.create().show();
				
			}
			
		}
		);
		
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
		
		ListAdapter listAdapter = new CustomListAdapter(DeleteContactActivity.this, c.getDisplayList());
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
			View listItemView = inflater.inflate(R.layout.custom_list_item_delete_layout, null);
			
			//Similar to the creation of listviews and buttons, we reference the TextView to its ID found in custom_list_item_layout.xml.
			//Sets the style
			TextView fn = (TextView)listItemView.findViewById(R.id.list_item_text_FN2);
			TextView ln = (TextView)listItemView.findViewById(R.id.list_item_text_LN2);
			TextView dob = (TextView)listItemView.findViewById(R.id.list_item_text_mobile2);
			CheckBox cb = (CheckBox)findViewById(R.id.list_item_check_box);
			
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
