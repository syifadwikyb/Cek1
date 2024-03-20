package com.example.home;

import androidx.appcompat.app.AppCompatActivity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class keuangan extends AppCompatActivity {

    private ImageButton imageButton,list,keuangan,profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tugas1);

        imageButton = findViewById(R.id.imageButton);
        list = findViewById(R.id.list);
        keuangan = findViewById(R.id.keuangan);
        profile = findViewById(R.id.profile);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopup();
            }
        });
        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (keuangan.this, tugas1.class);
                startActivity(intent);
            }
        });
        keuangan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (keuangan.this, keuangan.class);
                startActivity(intent);
            }
        });
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (keuangan.this, profile.class);
                startActivity(intent);
            }
        });
    }

    private void showPopup() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);


        // Inflate layout untuk dialog
        View view = getLayoutInflater().inflate(R.layout.activity_popup_keuangan, null);
        builder.setView(view);

        // Munculkan dialog
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}
