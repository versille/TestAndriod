package com.cavedu;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ButtonActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button myButton = (Button)findViewById(R.id.button1);
        
        myButton.setOnClickListener(new Button.OnClickListener(){

			public void onClick(View v) {
				// TODO Auto-generated method stub
				TextView myTextView = (TextView)findViewById(R.id.textview1);
				myTextView.setText("Good morning~");
			}
        	
        });
    }
}