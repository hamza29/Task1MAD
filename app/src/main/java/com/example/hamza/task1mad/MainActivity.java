package com.example.hamza.task1mad;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText mail;
    private EditText name;
    private Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mail = (EditText) findViewById(R.id.mail);
        final String strmail= mail.getText().toString();
        name = (EditText) findViewById(R.id.name);
        final String strname = name.getText().toString();
        btn1 = (Button) findViewById(R.id.signup);

        btn1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
//                String email = mail.getText().toString().trim();
//                String password = name.getText().toString().trim();

                // Check for empty data in the form
//                if (!email.isEmpty() && !password.isEmpty()) {
//                    // login user
//                }
//
                if(strmail.equals("")&& strname.equals(""))
                {
                    Toast.makeText(getApplicationContext(),
                            "Please enter the credentials!", Toast.LENGTH_LONG)
                            .show();


                    Intent i = new Intent (MainActivity.this,LoginActivity.class);
                    startActivity(i);

                }


                else if (strmail.equals("") && strname.equals("")){


                }
            }

        });






    }
}