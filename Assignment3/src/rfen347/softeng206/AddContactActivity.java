package rfen347.softeng206;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.QuickContactBadge;
import android.widget.Toast;

public class AddContactActivity extends Activity {
	private Button save;
	private Button cancel;
	private ImageButton picture;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.add_contact);
		
		picture = (ImageButton)findViewById(R.id.add_picture);
		save = (Button)findViewById(R.id.save_contact_button);
		cancel = (Button)findViewById(R.id.cancel2_contact_button);
		save.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.setClass(AddContactActivity.this, MainActivity.class);
				startActivity(intent);
				
				String displayString = "Contact Added";
				Toast.makeText(save.getContext(), displayString, Toast.LENGTH_LONG).show();
			}
		})
		;
		cancel.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.setClass(AddContactActivity.this, MainActivity.class);
				startActivity(intent);
				
			}
		})
		;
		picture.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.setClass(AddContactActivity.this, GalleryActivity.class);
				startActivity(intent);
				
			}
		})
		;
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.add_contact, menu);
		return true;
	}

}
