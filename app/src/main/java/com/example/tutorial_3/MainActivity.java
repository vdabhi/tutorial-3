 package com.example.tutorial_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

 public class MainActivity extends AppCompatActivity {
    EditText edtuser,edtpass;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        edtuser=(EditText)findViewById(R.id.txtname);
        edtpass=(EditText)findViewById(R.id.txtpassword);
        btnLogin=(Button)findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtuser.getText().toString().equals("admin@gmail.com") &&
                        edtpass.getText().toString().equals("admin")) {
                    Intent it=new Intent(getApplicationContext(),after_login.class);
                    startActivity(it);
                }else
                {
                    Toast.makeText(getApplicationContext(), "invalid username and password",Toast.LENGTH_SHORT).show();
                }
            }
        } );
    }
}
