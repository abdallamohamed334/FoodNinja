package com.example.foodninja;



import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class NiniaSplash extends AppCompatActivity {
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
getWindow().setFlags( WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN );
        setContentView( R.layout.activity_ninia_splash );
        EditText email,pawword;
    email=findViewById( R.id.emailsign );
    pawword=findViewById( R.id.pawwordsign );

 Button next=findViewById( R.id.nextupload );
 next.setOnClickListener( new View.OnClickListener() {
     @Override
     public void onClick(View view) {
         SharedPreferences sp = getSharedPreferences("Users_info", MODE_PRIVATE);
         SharedPreferences.Editor editor = sp.edit();
         String Email =email.getText().toString();
         String pass=pawword.getText().toString();

         if (Email.isEmpty()||pass.isEmpty()){

             Snackbar snackbar = Snackbar
                     .make(view, " يجب كتابة البريد الالكتروني وكلمة المرور", Snackbar.LENGTH_LONG);
             snackbar.show();
         }

         else  if (Email.equals(sp.getString("Mail", ""))&pass.equals(  sp.getString("Pass", ""))){

             Intent i = new Intent(NiniaSplash.this,SignUpprocess.class);
             startActivity(i);
             finish();

             Toast.makeText(NiniaSplash.this, "مرحبا بكم", Toast.LENGTH_SHORT).show();


         }
         else {

             Snackbar snackbar = Snackbar
                     .make(view, " خطأ البريد الالكتروني أو كلمة المرور", Snackbar.LENGTH_LONG);
             snackbar.show();

         }
     }
 } );

    }
}