package com.example.btvn_buoi06_bai01;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Contact contact;
    EditText edtUer,edtPass;
    Button btnLogin;
    TextView tb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contact=new Contact();
        edtUer=findViewById(R.id.user);
        edtPass=findViewById(R.id.password);
        tb=findViewById(R.id.tb);
        btnLogin=findViewById(R.id.login);
         btnLogin.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 String password=String.valueOf(edtPass.getText());
                 String user=String.valueOf(edtUer.getText());
                 if(user.length()==0)
                 {
                     tb.setText("* User không được để trống");
                 }
                 else if(password.length()==0)
                 {
                     tb.setText("* Password không được để trống");
                 }
                  else if (contact.lenght(password) == false) {
                         tb.setText("* Password phải chứa ít nhất 6 kí tự");
                     }
                  else if(contact.kt(password)==false)
                 {
                     tb.setText("* Password phải chứa kí tự đặc biệt");
                 }
                  else if( contact.number(password)==false)
                 {
                     tb.setText("* Password phải chứa số");
                 }
                  else if(contact.caps(password)==false)
                 {
                     tb.setText("* Password phải chứa kí tự viết hoa");
                 }
                 else if(contact.enter(password)==false)
                 {
                     tb.setText("* Password không chứ kí tự enter");
                 }
                  else {
                     startActivity(new Intent(getBaseContext(),nextlogin.class));
                 }

             }
         });

    }
}
