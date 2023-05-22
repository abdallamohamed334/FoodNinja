package com.example.foodninja;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;


public class LoginActivity extends AppCompatActivity {
    @SuppressLint("MissingInflatedId")

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags( WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN );
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_login );
        TextView alredy=findViewById( R.id.alredy );
        alredy.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LoginActivity.this,NiniaSplash.class);
                startActivity( intent );
            }
        } );
        EditText username = findViewById( R.id.usernamesign );
        EditText email = findViewById( R.id.emailsign );
        EditText password = findViewById( R.id.pawwordsign );
        Button nextsign =findViewById( R.id.nextupload );
        nextsign.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (email.getText().toString().isEmpty()){




                    Snackbar snackbar = Snackbar
                            .make(view, " خطأ البريد الالكتروني", Snackbar.LENGTH_LONG);
                    snackbar.show();





                }
                else if(password.getText().toString().isEmpty()){

                    Snackbar snackbar = Snackbar
                            .make(view, " يجب كتابة كلمة مرور", Snackbar.LENGTH_LONG);
                    snackbar.show();

                }



                else {


                    SharedPreferences sp = getSharedPreferences("Users_info", MODE_PRIVATE);
                    SharedPreferences.Editor editor = sp.edit();
                    editor.putString("Mail",email.getText().toString() );
                    editor.putString("Pass",password.getText().toString() );
                    editor.commit();

                    Snackbar snackbar = Snackbar
                            .make(view, " تم التسجيل بنجاح", Snackbar.LENGTH_LONG);
                    snackbar.show();
Intent intent=new Intent(LoginActivity.this,NiniaSplash.class);
startActivity( intent );


                }
            }
            });
        }

    }



