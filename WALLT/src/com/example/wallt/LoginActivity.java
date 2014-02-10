/**
 * the log in form page
 */
package com.example.wallt;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
 
public class LoginActivity extends Activity {
    
	private final String DEFAULT_ID = "admin";
	private final String DEFAULT_PASSWORD = "pass123";
    
	private String id;
    private String password;
    
    EditText idET;
    EditText passwordET;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setting default screen to login.xml
        setContentView(R.layout.login_activity);
 
        TextView back = (TextView) findViewById(R.id.backToMain);
        
        TextView login = (TextView) findViewById(R.id.btnLogin);
        login.setOnClickListener(new View.OnClickListener(){

			public void onClick(View v) {
				idET = (EditText) findViewById(R.id.loginEdit);
				passwordET = (EditText) findViewById(R.id.passwordEdit);
				id = idET.getText().toString();
				password = passwordET.getText().toString();
				if (id.equals(DEFAULT_ID) && password.equals(DEFAULT_PASSWORD)) {
					Intent i = new Intent(getApplicationContext(), SuccessActivity.class);
		        	startActivity(i);
				} else {
					Toast.makeText(getBaseContext(), "Try Again", Toast.LENGTH_SHORT).show();
				}
			}
        });
//        back.setButtonOnClickListener();
 
        back.setOnClickListener(new View.OnClickListener() {
 
            public void onClick(View v) {
                // Switching back to login screen
                finish();
            }
        });
    }
    
//    private void setButtonOnClickListener() {
//    	loginButton.setOnClickListener(new OnClickListener(){
//
//			@Override
//			public void onClick(View v) {
				
//			}
//    });
//    }
}