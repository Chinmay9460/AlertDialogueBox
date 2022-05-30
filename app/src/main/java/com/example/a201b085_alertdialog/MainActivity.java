package com.example.a201b085_alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        new AlertDialog.Builder( this )
                .setIcon( R.drawable.ic_cbbb)
                .setTitle( " Warning! " )
                .setMessage( "You are being watched ." )
                .setNeutralButton( "You are not verified...." , new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface , int i) {
                        Toast.makeText(getApplicationContext(), "Alert  is for you",Toast.LENGTH_SHORT).show();
                    }
                } ).show();

        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
    }
}