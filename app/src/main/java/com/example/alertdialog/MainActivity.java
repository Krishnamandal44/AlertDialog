package com.example.alertdialog;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
	final Context context=this;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button btn=(Button)findViewById(R.id.bt);
		btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				AlertDialog.Builder alettdialogbuilder=new AlertDialog.Builder(context);
				alettdialogbuilder.setTitle("hi");
				alettdialogbuilder.setMessage("are you sure you want to delete?");
				alettdialogbuilder.setCancelable(false);
				alettdialogbuilder.setPositiveButton("YES",new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						Toast.makeText(MainActivity.this, "Delete this page", 2000).show();
						// TODO Auto-generated method stub
						
					}
				});
				alettdialogbuilder.setNegativeButton("NO",new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						dialog.cancel();
						// TODO Auto-generated method stub
						
					}
				});
				AlertDialog ald=alettdialogbuilder.create();
				ald.show();
				// TODO Auto-generated method stub
				
			}
		});
	}
}
